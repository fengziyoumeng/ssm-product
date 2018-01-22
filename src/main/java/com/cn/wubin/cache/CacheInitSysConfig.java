package com.cn.wubin.cache;

import com.cn.wubin.model.pojo.SysConfig;
import com.cn.wubin.service.ISysConfigService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import tool.util.BeanUtil;
import tool.util.StringUtil;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 缓存帮助类
 * 
 * @author gc
 * @version 1.0.0
 * @date 2017年1月7日 上午10:40:22
 * Copyright 杭州民华金融信息服务有限公司 资产匹配系统 All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 
 * 未经授权不得进行修改、复制、出售及商业使用
 */
public class CacheInitSysConfig {

    private static final Logger logger = LogManager.getLogger(CacheInitSysConfig.class);

    /**
     * 初始化系统参数配置
     */
	public static void initSysConfig(ApplicationContext applicationContext) {

        logger.info("初始化系统配置Config...");

        // 系统配置Config缓存
        ISysConfigService sysConfigService = (ISysConfigService) applicationContext.getBean("sysConfigService");

        // HashMap本身不是线程安全的，因此不能用于多线程并发，因为多线程环境下，使用HashMap进行put操作会引起死循环，导致CPU利用率接近100%，
        // 但是java中提供了一个ConcurrentHashMap，这个map是线程安全的，通过对get操作不加锁，对put操作分块加锁的方式来保证线程安全的同时还能有较高的读写性能
        // 用redis的话还需要建立到redis的连接，然后提交查询请求，等待返回结果，这样会耗费相当多的时间；所以用ConcurrentHashMap较好
        Map<String, Object> configMap = new ConcurrentHashMap<String, Object>();

        List<SysConfig> sysConfigs = sysConfigService.listSysConfig();
        for (SysConfig sysConfig : sysConfigs) {
            if (null != sysConfig && StringUtil.isNotBlank(sysConfig.getCode())) {
                configMap.put(sysConfig.getCode(), sysConfig.getValue());
            }
        }

        Global.configMap = new ConcurrentHashMap<String, Object>(); //初始化公共资源的configMap，configMap的作用域在本工程全文
        Global.configMap.putAll(configMap);
    }

 
}

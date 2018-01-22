package com.cn.wubin.controller;

import com.cn.wubin.cache.CacheInitSysConfig;
import com.cn.wubin.cache.Global;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 缓存重置接口
 */
@Controller
@RequestMapping("/config")
public class ConfigReloadController implements ApplicationContextAware{

    ApplicationContext applicationContext;

    private static Logger logger = LogManager.getLogger(ConfigReloadController.class);

    @RequestMapping("/reload/data")
    public String queryData(){

        //重新加载系统配置数据
        CacheInitSysConfig.initSysConfig(applicationContext);

        String cacheValue = Global.getValue("ftp_username");
        logger.info("缓存值："+cacheValue);

        return "success";  //将model对象属性映射到success.jsp
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

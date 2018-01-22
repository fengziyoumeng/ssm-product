package com.cn.wubin.cache;

import com.cn.wubin.service.ISysConfigService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 实现InitializingBean的类，都会在容器启动时调用afterPropertiesSet()方法
 * CacheInitBean必须在spring-mybatis.xml定义，不然无效，不调用afterPropertiesSet()方法
 */
public class CacheInitBean implements InitializingBean,ApplicationContextAware{

    ApplicationContext applicationContext;

    public void afterPropertiesSet() throws Exception {
        System.out.println("容器初始化的时候带上了我");
        CacheInitSysConfig.initSysConfig(applicationContext); //传入上下文，便于从上下文获得service层类对象
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext; //获得上下文
    }
}

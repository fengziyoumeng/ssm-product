package com.cn.wubin.controller;

import com.alibaba.fastjson.JSON;
import com.cn.wubin.cache.Global;
import com.cn.wubin.model.pojo.BannerInfo;
import com.cn.wubin.redis.ShardedJedisClient;
import com.cn.wubin.service.IBannerInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private IBannerInfoService bannerInfoService;

    @Resource
    private ShardedJedisClient redisClient;

    private static Logger logger = LogManager.getLogger(TestController.class);

    @RequestMapping("/query/data")
    public String queryData(HttpServletRequest request,Model model){

//        URLDecoder.decode(value, "utf-8");

        String cacheValue = Global.getValue("ftp_username");
        logger.info("缓存值："+cacheValue);

        String value = redisClient.get("name");
        logger.info(value);

        Long id = Long.parseLong(request.getParameter("id"));
        BannerInfo bannerInfo = bannerInfoService.queryBannerInfo(id);
        logger.info(JSON.toJSONString(bannerInfo));
        model.addAttribute("bannerInfo",bannerInfo);
        return "test";  //将model对象属性映射到test.jsp
    }

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
        logger.trace("trace level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");

        String operativeInfos = "job=nsnnss|module=jdjjdjd";
        if(operativeInfos.contains("|")){
            operativeInfos = operativeInfos.replace("|",",");
        }
        System.out.println(operativeInfos);
    }

}

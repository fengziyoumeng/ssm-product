package com.cn.wubin.controller;

import com.alibaba.fastjson.JSON;
import com.cn.wubin.model.bo.Ticket;
import com.cn.wubin.model.pojo.BannerInfo;
import com.cn.wubin.service.IBannerInfoService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tool.util.DateUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/test")
public class TestController {

    @Resource
    private IBannerInfoService bannerInfoService;

    private static Logger logger = Logger.getLogger(TestController.class);

    @RequestMapping("/query/data")
    public String queryData(HttpServletRequest request,Model model){

        Long id = Long.parseLong(request.getParameter("id"));
        BannerInfo bannerInfo = bannerInfoService.queryBannerInfo(id);
        logger.info(JSON.toJSONString(bannerInfo));
        model.addAttribute("bannerInfo",bannerInfo);
        return "test";  //将model对象属性映射到test.jsp
    }

}

package com.test.wubin;

import com.alibaba.fastjson.JSON;
import com.cn.wubin.model.pojo.BannerInfo;
import com.cn.wubin.service.IBannerInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:*-beans.xml"})
public class TestMybatis {

    @Resource
    private IBannerInfoService bannerInfoService;

    private static Logger logger = LogManager.getLogger(TestMybatis.class);

    @Test
    public void test(){
        BannerInfo bannerInfo = bannerInfoService.queryBannerInfo(1l);
        logger.info(JSON.toJSONString(bannerInfo));
    }
}

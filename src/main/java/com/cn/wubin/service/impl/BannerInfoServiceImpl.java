package com.cn.wubin.service.impl;

import com.cn.wubin.dao.IBannerInfoMapper;
import com.cn.wubin.model.pojo.BannerInfo;
import com.cn.wubin.service.IBannerInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bannerInfoService")
public class BannerInfoServiceImpl implements IBannerInfoService{

    @Resource
    private IBannerInfoMapper bannerInfoMapper;

    public BannerInfo queryBannerInfo(Long id) {
        return bannerInfoMapper.selectByPrimaryKey(id);
    }
}

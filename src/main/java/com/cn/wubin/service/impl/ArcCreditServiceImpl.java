package com.cn.wubin.service.impl;

import com.cn.wubin.dao.IArcCreditMapper;
import com.cn.wubin.model.pojo.ArcCredit;
import com.cn.wubin.service.IArcCreditService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("arcCreditService")
public class ArcCreditServiceImpl implements IArcCreditService{

    @Resource
    private IArcCreditMapper arcCreditMapper;

    @Override
    public Boolean saveorUpdate(ArcCredit arcCredit) {
        int i = arcCreditMapper.insertSelective(arcCredit);
        if(i==1){
            return true;
        }else{
            return false;
        }
    }
}

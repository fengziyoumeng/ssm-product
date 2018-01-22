package com.cn.wubin.service.impl;

import com.cn.wubin.dao.ISysConfigMapper;
import com.cn.wubin.model.pojo.SysConfig;
import com.cn.wubin.service.ISysConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("sysConfigService")
public class SysConfigServiceImpl implements ISysConfigService {

    @Resource
    private ISysConfigMapper sysConfigMapper;

    public List<SysConfig> listSysConfig() {
        return sysConfigMapper.listSysConfig(null);
    }
}

package com.cn.wubin.service;

import com.cn.wubin.model.pojo.SysConfig;

import java.util.List;

public interface ISysConfigService {

	/**
	 * 查询所有配置
	 * @return
	 * @throws Exception
	 */
	List<SysConfig> listSysConfig();

}

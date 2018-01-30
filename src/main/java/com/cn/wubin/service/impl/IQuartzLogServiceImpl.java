package com.cn.wubin.service.impl;

import com.cn.wubin.dao.QuartzLogMapper;
import com.cn.wubin.model.bo.QuartzLogModel;
import com.cn.wubin.model.pojo.QuartzLog;
import com.cn.wubin.service.IQuartzLogService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * 定时任务记录ServiceImpl
 * 
 * @author
 * @version 1.0.0
 * @date 2017-03-15 13:38:29
 * Copyright 杭州民华金融信息服务有限公司  arc All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 
 * 未经授权不得进行修改、复制、出售及商业使用
 */
@SuppressWarnings("unused")
@Service("quartzLogService")
public class IQuartzLogServiceImpl implements IQuartzLogService {

	private static final Logger logger = LogManager.getLogger(IQuartzLogServiceImpl.class);
   
    @Resource
    private QuartzLogMapper quartzLogMapper;

	@Override
	public int save(QuartzLog ql) {
		return quartzLogMapper.save(ql);
	}




	@Override
	public Page<QuartzLogModel> page(Map<String, Object> searchMap,
									 int current, int pageSize) {
		PageHelper.startPage(current, pageSize);
		List<QuartzLogModel> list = quartzLogMapper.page(searchMap);
		return (Page<QuartzLogModel>)list;
	}
	
}
package com.cn.wubin.service;

import com.cn.wubin.model.bo.QuartzLogModel;
import com.cn.wubin.model.pojo.QuartzLog;
import com.github.pagehelper.Page;

import java.util.Map;

/**
 * 定时任务记录Service
 * 
 * @author
 * @version 1.0.0
 * @date 2017-03-15 13:38:29
 * Copyright 杭州民华金融信息服务有限公司  arc All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 
 * 未经授权不得进行修改、复制、出售及商业使用
 */
public interface IQuartzLogService {

	int save(QuartzLog ql);

	Page<QuartzLogModel> page(Map<String, Object> searchMap, int current, int pageSize);

}

package com.cn.wubin.dao;

import com.cn.wubin.model.bo.QuartzLogModel;
import com.cn.wubin.model.pojo.QuartzLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 定时任务记录Dao
 * 
 * @author
 * @version 1.0.0
 * @date 2017-03-15 13:38:29
 * Copyright 杭州民华金融信息服务有限公司  arc All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 
 * 未经授权不得进行修改、复制、出售及商业使用
 */
@RDBatisDao
public interface QuartzLogMapper{

	/**
	 * 据quartId查询最后执行时间
	 * @param quartId
	 * @return
	 */
	String findLastTimeByQzInfoId(@Param("quartzId") Long quartId);

	/**
	 * 日志查询
	 * @param searchMap
	 * @return
	 */
	List<QuartzLogModel> page(Map<String, Object> searchMap);

	int save(QuartzLog e);

}

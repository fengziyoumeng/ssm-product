package com.cn.wubin.dao;

import com.cn.wubin.model.bo.QuartzInfoModel;
import com.cn.wubin.model.pojo.QuartzInfo;

import java.util.List;
import java.util.Map;

/**
 * 定时任务详情Dao
 * 
 * @author lyang
 * @version 1.0.0
 * @date 2017-03-15 13:30:53
 * Copyright 杭州民华金融信息服务有限公司  arc All Rights Reserved
 * 官方网站：www.yongqianbei.com
 * 
 * 未经授权不得进行修改、复制、出售及商业使用
 */
@RDBatisDao
public interface QuartzInfoMapper {

	/**
	 * 定时任务查询
	 * 
	 * @param map
	 * @return
	 */
	List<QuartzInfoModel> page(Map<String, Object> map);

	int save(QuartzInfo e);

	/**
	 * 更新数据
	 */
	int updateSelective(Map<String, Object> paramMap);

	/**
	 * 数据查询
	 *
	 * @return 结果集
	 */
	List<QuartzInfo> listSelective(Map<String, Object> paramMap);

	/**
	 * 获取一条记录
	 *
	 *            查询条件
	 * @return 查询结果
	 */
	QuartzInfo findSelective(Map<String, Object> paramMap);
}

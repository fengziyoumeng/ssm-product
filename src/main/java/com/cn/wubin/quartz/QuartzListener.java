package com.cn.wubin.quartz;

import com.cn.wubin.model.bo.QuartzInfoModel;
import com.cn.wubin.model.pojo.QuartzInfo;
import com.cn.wubin.service.IQuartzInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tool.util.BeanUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuartzListener implements ServletContextListener,HttpSessionAttributeListener {

	private static Logger logger= LogManager.getLogger(QuartzListener.class);

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		logger.info("【启动所有任务】开始...");
		try {
			IQuartzInfoService quartzInfoService = (IQuartzInfoService) BeanUtil.getBean("quartzInfoService");

			// 查询启用状态的定时任务信息
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("state", QuartzInfoModel.STATE_ENABLE);
			List<QuartzInfo> list = quartzInfoService.list(paramMap);

			// 循环添加任务
			for (QuartzInfo quartzInfo : list) {
				String clName = quartzInfo.getClassName();
				try{
					Object cl = Class.forName(clName).newInstance();
					QuartzManager.addJob(quartzInfo.getCode(), cl.getClass(),quartzInfo.getCycle());
				}catch (Exception e){
					logger.info("忽略");
				}
			}

			// 启动所有定时任务
			QuartzManager.startJobs();

		} catch (Exception e) {
			logger.error("启动定时任务异常--->" + e.getMessage(), e);
		}
		logger.info("【启动所有任务】结束...");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}

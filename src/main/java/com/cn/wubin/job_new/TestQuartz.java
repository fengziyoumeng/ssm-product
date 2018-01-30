package com.cn.wubin.job_new;

import com.cn.wubin.model.pojo.QuartzInfo;
import com.cn.wubin.model.pojo.QuartzLog;
import com.cn.wubin.service.IQuartzInfoService;
import com.cn.wubin.service.IQuartzLogService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import tool.util.BeanUtil;
import tool.util.DateUtil;

import javax.xml.rpc.ServiceException;
import java.util.HashMap;
import java.util.Map;

@Component
@Lazy(value = false)
public class TestQuartz implements Job {
    private static final Logger logger = LogManager.getLogger(TestQuartz.class);

    public void execute(JobExecutionContext context) throws JobExecutionException {
        IQuartzInfoService quartzInfoService = (IQuartzInfoService) BeanUtil.getBean("quartzInfoService");
        IQuartzLogService quartzLogService = (IQuartzLogService) BeanUtil.getBean("quartzLogService");
        QuartzLog quartzLog = new QuartzLog();
        Map<String,Object> quartzInfoData = new HashMap<>();
        QuartzInfo quartzInfo = quartzInfoService.findByCode("testQuartz");//查询出表中todayQuartz对应的QuartzInfo对象
        try {
            quartzInfoData.put("id", quartzInfo.getId());
            quartzInfoData.put("succeed", quartzInfo.getSucceed()+1);

            String remark = executeContent();//执行内容
            quartzLog.setQuartzId(quartzInfo.getId());
            quartzLog.setStartTime(DateUtil.getNow());
            quartzLog.setTime(DateUtil.getNow().getTime()-quartzLog.getStartTime().getTime());
            quartzLog.setResult("10");//成功状态是10
            quartzLog.setRemark(remark);
        }catch (Exception e) {
            quartzInfoData.put("fail", quartzInfo.getFail()+1);
            quartzLog.setResult("20");//失败状态是20
            logger.error(e.getMessage(),e);
        }finally{
            logger.info("更新定时任务数据");
            quartzInfoService.update(quartzInfoData);
            logger.info("保存定时任务日志");
            quartzLogService.save(quartzLog);
        }
    }

    private String executeContent() throws ServiceException {
        logger.info("*********************任务完成*****************************");
        return "任务完成";
    }
}
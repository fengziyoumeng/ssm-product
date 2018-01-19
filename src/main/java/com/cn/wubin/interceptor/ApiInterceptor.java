package com.cn.wubin.interceptor;

import com.cn.wubin.utils.EncryptUtil;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by lsk on 2017/2/14.
 */
@SuppressWarnings({ "rawtypes" })
public class ApiInterceptor implements HandlerInterceptor {

	private static Logger logger = Logger.getLogger(ApiInterceptor.class);

	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
		Map<String, Object> rec = new LinkedHashMap<String, Object>();

		//获得请求参数
//		Map<String,Object> requestMap = RequestParamUtil.getParams(httpServletRequest);
//		logger.info(String.format("请求转为requestMap【%s】",requestMap));

		//获得头中的token和signMsg
		// token（自定义的字符串，是前后端交互的部分密钥）为空说明用户未登陆
		// signMsg是前端将请求中的参数拼接成一串字符串，并且MD5加密后生成的字符串，用来与后台进行验签的
		String token = httpServletRequest.getHeader("token");
		String signMsg = httpServletRequest.getHeader("signMsg");
		logger.info(String.format("请求token【%s】",token));
		logger.info(String.format("请求的加密签名串signMsg【%s】",signMsg));

		//将requestMap属性转为 a=5|b=9 这种形式拼接字符串返回
//		String requestMapString = RequestParamUtil.paramsString(requestMap);
//		logger.info(String.format("requestMap转为拼接字符串requestMapString【%s】",requestMapString));

		// app_key是移动端密钥,是一串固定字符串，暂且用app_key代替，正式上线要替换对应值
		String app_key = "FEA198F41528E70213E44F7782BDE856";
		logger.info(String.format("移动端密钥app_key【%s】",app_key));
		// _signMsg是加签后的字符串
//		String _signMsg = EncryptUtil.md5(app_key + token + requestMapString);
//		logger.info(String.format("后台加签后的字符串_signMsg【%s】",requestMapString));

		//开始验签
//		boolean flag = _signMsg.equalsIgnoreCase(signMsg);
		// flag为false验签不通过
//		if (!flag) {
//			rec.put("code", 400);
//			rec.put("msg", "验签不通过");
//			throw new RuntimeException("验签不通过");
////			这里需要将rec信息返回给前端，这里还需要配置，以后配置
////			JsonUtil.writeJson(rec, httpServletResponse);
////			return false;
//		}

		//如果token不为空，则说明已经登陆，将用户数据放入session中

		return true;
	}

	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

	}

	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

	}
}

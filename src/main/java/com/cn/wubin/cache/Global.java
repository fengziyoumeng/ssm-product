package com.cn.wubin.cache;

import tool.util.NumberUtil;
import tool.util.StringUtil;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 启动加载缓存类
 */
public class Global {

	public static ConcurrentHashMap<String, Object> configMap;

	public static ConcurrentHashMap<String, Object> msg_template_Map;

	public static int getInt(String key){
		return NumberUtil.getInt(StringUtil.isNull(configMap.get(key)));
	}

	public static double getDouble(String key){
		return NumberUtil.getDouble(StringUtil.isNull(configMap.get(key)));
	}

	public static String getValue(String key) {
		return StringUtil.isNull(configMap.get(key));
	}

	public static Object getObject(String key){
		return configMap.get(key);
	}

	public static String getMsgTempLate(String key) {
		return StringUtil.isNull(msg_template_Map.get(key));
	}

}

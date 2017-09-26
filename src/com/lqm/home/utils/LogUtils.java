package com.lqm.home.utils;

import org.apache.commons.logging.impl.Log4JLogger;

public class LogUtils {
	
	public static final Log4JLogger logger = new Log4JLogger("OA");
	
	public static void debug(String msg){
		logger.debug(msg);
	}
	
	public static void info(String msg){
		logger.info(msg);;
	}
	
	public static void warn(String msg){
		logger.warn(msg);
	}
	
	public static void error(String msg){
		logger.error(msg);
	}
	
	public static void fatal(String msg){
		logger.fatal(msg);
	}
}

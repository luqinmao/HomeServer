package com.lqm.home.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Description: 时间工具类
 * Company: youjiang
 * @author Kwum
 * @date 2016年12月19日 下午1:29:02
 * @version 1.0
 */

public class TimeUtil {

	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd"); 
	public static SimpleDateFormat dayFormatChina = new SimpleDateFormat("yyyy年MM月dd日"); 
	
	/**
	 * 获取当前时间（以字符串的形式）
	 * @return 例如 2016-12-05 17:16:33
	 */
	public static String getCurrentTimeString(){
		return sdf.format(new Date());
	}
	
	/**
	 * 输入时间字符串返回Date格式输出（时间字符串格式：yyyy-MM-dd HH:mm:ss）
	 * @param str 时间字符串
	 * @return Date格式的时间
	 * @throws ParseException 
	 */
	public static Date getTimeFromString(String str) throws ParseException{
		return sdf.parse(str);
	}
	
	/**
	 * 获取本月第一天的日期
	 * @return str 本月第一天的日期  eg:2016-10-01
	 */
	public static String getThisMonthFirstDay(){
		//获取当前月第一天：
        Calendar c = Calendar.getInstance();    
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天 
		return dayFormat.format(c.getTime());
	}
	
	/**
	 * 获取本月最后一天的日期
	 * @return str 本月第一天的日期  eg:2016-10-31
	 */
	public static String getThisMonthLastDay(){
		//获取当前月最后一天
        Calendar ca = Calendar.getInstance();    
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
        return dayFormat.format(ca.getTime());
	}
	/**
	 * 获取前天日期
	 * @return 昨天日期 eg:2016-10-31
	 * @author lin
	 */
	public static String getDayBeforeYesterday(){
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -2);
        return dayFormat.format(cal.getTime());
	}
	
	
	/**
	 * 获取昨天日期
	 * @return 昨天日期 eg:2016-10-31
	 * @author kwum 
	 */
	public static String getYesterDay(){
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return dayFormat.format(cal.getTime());
	}
	
	/**
	 * 获取今天日期
	 * @return 今天日期 eg:2016-10-31
	 * @author lin
	 */
	public static String getToday(){
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		return sf.format(new Date());
	}
	
	/**
	 * 用于比较用户的accessToken是否过时
	 * @return	1 大于等于  0小于
	 * @author lin
	 * @throws ParseException 
	 */ 
	public static int comparisonTime(String time) throws ParseException{
		SimpleDateFormat dfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    java.util.Date begin=dfs.parse(TimeUtil.getCurrentTimeString());
	    java.util.Date end = dfs.parse(time);
		long between=(Math.abs(end.getTime()-begin.getTime()))/1000;
		System.out.println(end.getTime());
		System.out.println(between);
		if(between>=604800){
			return 1;
		}else{
			return 0;
		}
	}
	
	/**
	 * 获取一周前的日期
	 * @return 七天前的日期 eg:2016-10-31
	 * @author kwum
	 */
	public static String getAWeekBefore(){
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        return dayFormat.format(cal.getTime());
	}
	
	/**
	 * 获取一个月前的日期
	 * @return 一个月前的日期 eg:2016-10-31
	 * @author kwum
	 */
	public static String getAMonthBefore(){
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        return dayFormat.format(cal.getTime());
	}
	
	/**
	 * 获取三个月前的日期
	 * @return 三个月前的日期 eg:2016-10-31
	 * @author kwum
	 */
	public static String getThreeMonthBefore(){
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -3);
        return dayFormat.format(cal.getTime());
	}
	
	/**
	 * 获取一年前的日期
	 * @return 一年前的日期 eg:2016-10-31
	 * @author kwum
	 */
	public static String getAYearBefore(){
		Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1);
        return dayFormat.format(cal.getTime());
	}
	
	/**
	 * 获取当前日期（带“年”、“月”、“日”）
	 * @return 例如：2016年11月29日
	 * @author kwum
	 */
	public static String getCurrentTimeChina(){
		return dayFormatChina.format(new Date());
	}
	/***
	 * 获取本周第一天的日期
	 * @author feng
	 * @date 2016年12月21日 下午2:33:19
	 * @version 1.0
	 * @return
	 */
	public static String getWeeksOneDate(){
		Calendar cal =Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY); //获取本周一的日期
		return dayFormat.format(cal.getTime());
	}
}

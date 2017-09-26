package com.lqm.home.utils;

import com.lqm.home.pojo.Page;

/**
 * Description: 分页信息辅助类
 * Company: youjiang
 * @author lin
 * @date 2016年10月21日 上午10:32:30
 * @version 1.0
 */
public class PageUtils {
	
	/**
	 * 十个条目一页
	 */
	private static final int TENITEMSINONEPAGE = 10;
	
	/**
	 * 二十个条目一页
	 */
	private static final int TWENTYITEMSINONEPAGE = 20;
	
	/**
	 * 五个条目一页
	 */
	private static final int FIVEITEMSINONEPAGE = 5;
	
	/**
	 * 构造分页
	 * @param everyPage 每一页记录数
	 * @param totalCount 总记录数
	 * @param currentPage 当前页数
	 * @return
	 */
	public static Page createPage(int everyPage, int totalCount, int currentPage) {
		everyPage = getEveryPage(everyPage);
		int totalPage = getTotalPage(everyPage, totalCount);
		currentPage = getCurrentPage(currentPage, totalPage);
		int beginIndex = getBeginIndex(everyPage, currentPage);
		boolean hasPrePage = getHasPrePage(currentPage);
		boolean hasNextPage = getHasNextPage(totalPage, currentPage);
		return new Page(everyPage, totalCount, totalPage, currentPage,
				beginIndex, hasPrePage, hasNextPage);
	}
	
	public static Page createPage(int everyPage, int currentPage) {
		int beginIndex = getBeginIndex(everyPage, currentPage);
		return new Page(beginIndex, everyPage);
	}
	
	private static int defaultEveryPage = 10;
	/**
	 * 获取起始点
	 * @param everyPage 每一页多少条
	 * @param currentPage 当前页数
	 * @return 起始点
	 * @author lin
	 */
	public static int getBeginIndex(int everyPage,int currentPage){
		if(currentPage == 0){
			return currentPage;
		}
		return (currentPage - 1) * everyPage;
	}
	/**
	 * 设置当前页
	 * @param currentPage 当前页
	 * @param totalPage 总页数
	 * @return 当前页
	 * @author lin
	 */
	public static int getCurrentPage(int currentPage,int totalPage){
		if(currentPage >= totalPage){
			return totalPage;
		}
		return currentPage <= 0 ? 1 : currentPage;
	}
	/**
	 * 获取每一页条数
	 * @param everyPage 每一页条数
	 * @return 每一页条数
	 * @author lin
	 */
	public static int getEveryPage(int everyPage){
		return everyPage <=0 ? defaultEveryPage :everyPage;
	}
	/**
	 * 是否有上一页
	 * @param currentPage 当前页
	 * @return 布尔类型
	 * @author lin
	 */
	public static boolean getHasPrePage(int currentPage){
		return currentPage == 1 ? false : true;
	}
	
	/**
	 * 是否有下一页
	 * @param currentPage 当前页
	 * @param totalPage 总页数
	 * @return 布尔类型
	 * @author lin
	 */
	public static boolean getHasNextPage(int totalPage, int currentPage){
		return currentPage == totalPage || totalPage == 0 ? false : true;
	}
	
	/**
	 * 设置总页数
	 * @param everyPage 每一页条数
	 * @param totalCount 总条数
	 * @return 总页数
	 * @author lin
	 */
	public static int getTotalPage(int everyPage,int totalCount){
		int totalPage = 1;
		if(totalCount % everyPage == 0){
			 totalPage = (totalCount/everyPage);
		}else{
			totalPage = (totalCount / everyPage + 1);
		}
		return  totalPage;
	}

	/**
	 * 十条目一页
	 * @return 10
	 * @author kwum
	 */
	public static int getTenItems() {
		return TENITEMSINONEPAGE;
	}

	/**
	 * 二十条目一页
	 * @return 20
	 * @author kwum
	 */
	public static int getTwentyItems() {
		return TWENTYITEMSINONEPAGE;
	}

	/**
	 * 五条目
	 * @return 5
	 * @author kwum
	 */
	public static int getFiveItems() {
		return FIVEITEMSINONEPAGE;
	}
}

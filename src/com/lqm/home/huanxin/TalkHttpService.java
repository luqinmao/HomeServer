package com.lqm.home.huanxin;
import java.io.File;
import java.util.Map;

public interface TalkHttpService {
	/**
	 * @param url 请求地址
	 * @param method 请求方法
	 * @param param 请求参数
	 * @param auth 加密认证
	 * @param field 字段转换
	 * */
	public TalkNode request(String url, int method, Object param, Authentic auth, String[][]field) throws Exception;
	/**
	 * @param url 请求地址
	 * @param file 文件数据
	 * @param auth 加密认证
	 * @param equal 字段转换
	 * */
	public TalkNode upload(String url, File file, Authentic auth, String[][]equal) throws Exception;
	/**
	 * @param url 请求地址
	 * @param file 本地文件
	 * @param auth 加密认证
	 * @param header 请求头部
	 * */
	public void downLoad(String url, File file, Authentic auth, Map<String,String>header) throws Exception;
}
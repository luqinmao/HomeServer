package com.lqm.home.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;


/***
 * 
 * <p>
 * Title: CustomExceptionResolver
 * </p> 
 * <p>
 * Description:统一异常处理
 * </p> 
 * <p>
 * Company: YouJiang
 * </p> 
 *
 * @author feng
 * @date 2017年1月1日 上午11:12:32
 * @version 1.0
 */
public class CustomExceptionResolver implements HandlerExceptionResolver{
	public CustomExceptionResolver() {
		System.out.println("---------CustomExceptionResolver---------");
	}
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
			Exception arg3) {
		/**设置响应头允许ajax跨域访问**/
		response.setHeader("Access-Control-Allow-Origin","*");
		 /*星号表示所有的异域请求都可以接受，*/
		response.setHeader("Access-Control-Allow-Methods","GET,POST");
		try {
			JSONObject json=new JSONObject();
			json.put("code", -200);
			json.put("msg", "处理异常");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json.toString());
			response.getWriter().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}

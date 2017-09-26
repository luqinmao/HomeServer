package com.lqm.home.utils;

import java.io.File;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

/**
 * Description: 保存图片工具类
 * Company: youjiang
 * @author Kwum
 * @date 2016年10月17日 下午5:09:34
 * @version 1.0
 */

public class ImgUtil {
	
	/**
	 * 保存图片文件至用户文件夹中
	 * @param hsr 全局HttpServletRequest
	 * @param file 图片文件
	 * @param fileName 图片文件名
	 * @param path 文件夹路径
	 * @return 返回图片路径
	 * @throws Exception 
	 * @throws IllegalStateException 
	 */
	@SuppressWarnings("unused")
	public static String saveImgInUserFolder(
			HttpServletRequest request, MultipartFile file, String fileName, String path) 
					throws Exception{
		long l = System.nanoTime();//获取系统当前时间（唯一值）
		String root = request.getServletContext().getRealPath(path);//保存图片文件夹的路径
		File fil=new File(root);//创建用户文件夹
		if (!fil.exists()) {
			fil.mkdirs();
        }
		InputStream is;
		String ext = fileName.substring(fileName.lastIndexOf("."));
		File f = new File(root+"/"+l+ext);
		file.transferTo(f);
		return request.getContextPath()+ path +"/"+ l + ext;
	}
}

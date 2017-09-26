package com.lqm.home.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lqm.home.mapper.UserMapper;
import com.lqm.home.po.LoginReturnData;
import com.lqm.home.po.User;
import com.lqm.home.po.Village;
import com.lqm.home.service.UserService;
import com.lqm.home.utils.ImgUtil;
import com.lqm.home.utils.LogUtils;
import com.lqm.home.utils.ResultData;
import com.lqm.home.utils.TimeUtil;



@Controller
@RequestMapping(value="user",produces="text/plain;charset=UTF-8")
public class UserCtrl {
	
	@Resource
	private UserService userService;
	@Resource
	private UserMapper userMapper;
	

	/** 注册 */
	@RequestMapping(value = "register", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.POST)
	public @ResponseBody
	ResultData<User> register(
			@RequestParam(value = "homeid", required = true) int homeid,
			@RequestParam(value = "tel", required = false) String tel,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "accid", required = true) String accid,
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "sex", required = false) String sex,
			@RequestParam(value = "birthday", required = false) String birthday,
			@RequestParam(value = "province", required = false) String province,
			@RequestParam(value = "city", required = false) String city,
			@RequestParam(value = "sign", required = false) String describe,  //个性签名
			HttpServletRequest request,
			@RequestParam(value="userphoto",required = true)MultipartFile photoImg
			) {
		
		ResultData<User> resultData = new ResultData<>();
		
		//先判断乡吧号是否已经被注册
		if(userService.isAlreadyRegistered(accid)){
			resultData.setCode(300);
			resultData.setMsg("此乡吧号已经被注册");
			resultData.setSuccess(false);
			return resultData;
		}
		try {
			String userphoto = ImgUtil.saveImgInUserFolder(request, photoImg, photoImg.getOriginalFilename(), 
					"/upload/img/"+TimeUtil.getWeeksOneDate());
			String address = province+ city;
			resultData = userService.register(homeid,tel, password,accid,username,userphoto,sex,birthday,address,describe);
		} catch (Exception e) {
			e.printStackTrace();
			LogUtils.error(e.toString());
			resultData.setCode(-200);
			resultData.setMsg("处理异常");
			resultData.setSuccess(true);
			return resultData;
		}
		return resultData;
	}
	

	/** 登录 */
	@RequestMapping(value = "login", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.POST)
	public @ResponseBody
	ResultData<LoginReturnData> login(
			@RequestParam(value = "accid", required = true) String accid,
			@RequestParam(value = "password", required = true) String password
			) {
		ResultData<LoginReturnData> resultData = new ResultData<>();
		try {
			resultData = userService.login(accid, password);
		} catch (Exception e) {
			e.printStackTrace();
			LogUtils.error(e.toString());
			resultData.setCode(-200);
			resultData.setMsg("处理异常");
			System.out.println(resultData);
			return resultData;
		}

		return resultData;
	}
	
	/***
	 * 更换关注的乡吧
	 */
	@RequestMapping(value = "replaceVillage", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.POST)
	@ResponseBody
	public ResultData<User> replaceVillage(
			@RequestParam(value = "userid", required = true) Integer userid,
			@RequestParam(value = "villageid", required = true) Integer villageid
			) throws Exception {
		User user = userMapper.selectByPrimaryKey(userid);
		user.setHomeid(villageid);
		userService.update(user);
		ResultData<User> resultData = new ResultData<>();
		resultData.setData(user);
		resultData.setCode(200);
		resultData.setMsg("切换乡吧成功");
		return resultData;
	}
	
}

package com.lqm.home.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lqm.home.mapper.FeedbackMapper;
import com.lqm.home.po.Feedback;
import com.lqm.home.utils.ResultData;
import com.lqm.home.utils.TimeUtil;

/**
 * 反馈
 * @author luqinmao
 *
 */
@Controller
@RequestMapping(value="feedback",produces="text/plain;charset=UTF-8")
public class FeedBackCtrl {

	@Resource
	private FeedbackMapper feedbackMapper;

	/***
	 * 创建反馈信息
	 */
	@RequestMapping(value = "createFeedBack", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.POST)
	@ResponseBody
	public ResultData<Feedback> createFeedBackInfo(
			@RequestParam(value = "userid", required = false) Integer userid,
			@RequestParam(value = "feedbackcontent", required = true) String feedbackcontent,
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "userContact", required = true) String userContact
			) throws Exception {
		
		Feedback feedback = new Feedback();
		feedback.setUserid(1);
		feedback.setContent(feedbackcontent);
		feedback.setUsername(username);
		feedback.setUserContact(userContact);
		feedback.setCreateTime(TimeUtil.getCurrentTimeString());
		feedbackMapper.insert(feedback);
		
		ResultData<Feedback> resultData = new ResultData<>();
		resultData.setData(feedback);
		resultData.setCode(200);
		resultData.setMsg("反馈成功");
		return resultData;
	}
	
}

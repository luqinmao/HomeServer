package com.lqm.home.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lqm.home.mapper.VillageMapper;
import com.lqm.home.po.User;
import com.lqm.home.po.Village;
import com.lqm.home.service.VillageService;
import com.lqm.home.utils.ImgUtil;
import com.lqm.home.utils.LogUtils;
import com.lqm.home.utils.ResultData;
import com.lqm.home.utils.TimeUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="village",produces="text/plain;charset=UTF-8")
public class VillageCtrl {
	
	@Resource
	private VillageService villageService;
	
	@Resource
	private VillageMapper villageMapper;

	/***
	 * 获取乡吧信息
	 */
	@RequestMapping(value = "getVillageInfo", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.GET)
	@ResponseBody
	public ResultData<Village> getVillageInfo(
			@RequestParam(value = "homeid", required = true) Integer homeid
			) throws Exception {
		Village village = villageService.selectVillageInfo(homeid);
		ResultData<Village> resultData = new ResultData<>();
		resultData.setData(village);
		resultData.setCode(200);
		resultData.setMsg("查询成功");
		return resultData;
	}
	
	/***
	 * 创建乡吧
	 */
	@RequestMapping(value = "createVillage", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.POST)
	public @ResponseBody
	ResultData<Village> createVillage(
			@RequestParam(value = "villageName", required = true) String villageName,
			@RequestParam(value = "villageDesc", required = true) String villageDesc,
			@RequestParam(value = "attentionNum", required = false) int attentionNum,
			@RequestParam(value = "postNum", required = false) int postNum,
			@RequestParam(value = "province", required = true) String province,
			@RequestParam(value = "city", required = true) String city,
			@RequestParam(value = "district", required = true) String district,
			HttpServletRequest request,
			@RequestParam(value="villageIcon",required = true)MultipartFile villageIcon
			) {
		ResultData<Village> resultData = new ResultData<>();
		
		//先判断乡吧号是否已经被创建
		if(villageService.isAlreadyCreated(villageName)){
			resultData.setCode(300);
			resultData.setMsg("此乡吧已经被创建");
			resultData.setSuccess(false);
			return resultData;
		}
		try {
			String villageIconString = ImgUtil.saveImgInUserFolder(request, villageIcon, villageIcon.getOriginalFilename(), 
					"/upload/img/"+TimeUtil.getWeeksOneDate());
			resultData = villageService.insert(villageIconString,villageName, villageDesc,attentionNum,postNum,province,city,district);
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
	
	/***
	 * 获取乡吧列表
	 */
	@RequestMapping(value = "getVillages", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.POST)
	@ResponseBody
	public ResultData<List<Village>> getVillages(
			@RequestParam(value = "district", required = true) String district
			) throws Exception {
		List<Village> datas = villageService.getVillageListByDistrict(district);
		ResultData<List<Village>> resultData = new ResultData<>();
		resultData.setData(datas);
		resultData.setCode(200);
		resultData.setMsg("查询成功");
		return resultData;
	}
	
	/***
	 * 根据名字查询乡吧
	 */
	@RequestMapping(value = "searchVillageByName", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.POST)
	@ResponseBody
	public ResultData<List<Village>> searchVillageByName(
			@RequestParam(value = "villageName", required = true) String villageName
			) throws Exception {
		ResultData<List<Village>> resultData = new ResultData<>();
		List<Village> villages = new ArrayList<>();
		Village village = villageService.searchByName(villageName);
		if(village == null){
			resultData.setSuccess(false);
			resultData.setMsg("没有数据");
		}else{
			villages.add(village);
			resultData.setData(villages);
			resultData.setCode(200);
			resultData.setMsg("查询成功");
			resultData.setSuccess(true);
		}
		return resultData;
	}
	
}

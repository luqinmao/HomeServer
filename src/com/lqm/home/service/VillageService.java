package com.lqm.home.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.lqm.home.po.User;
import com.lqm.home.po.Village;
import com.lqm.home.utils.ResultData;

public interface VillageService {



	Village selectVillageInfo(Integer homeid);

	List<Village> getVillageListByDistrict(String district);

	Village searchByName(String villageName);

	boolean isAlreadyCreated(String villageName);

	ResultData<Village> insert(String villageIcon, String villageName, String villageDesc, int attentionNum, int postNum,
			String province, String city, String district);
	
}

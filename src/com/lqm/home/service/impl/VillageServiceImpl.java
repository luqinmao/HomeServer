package com.lqm.home.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lqm.home.mapper.PostMapper;
import com.lqm.home.mapper.UserMapper;
import com.lqm.home.mapper.VillageMapper;
import com.lqm.home.po.PostExample;
import com.lqm.home.po.User;
import com.lqm.home.po.UserExample;
import com.lqm.home.po.UserExample.Criteria;
import com.lqm.home.po.Village;
import com.lqm.home.po.VillageExample;
import com.lqm.home.service.VillageService;
import com.lqm.home.utils.ResultData;
import com.lqm.home.utils.TimeUtil;


@Transactional
@Service
public class VillageServiceImpl implements VillageService{

	@Resource
	private VillageMapper villageMapper;
	@Resource
	private PostMapper postMapper;
	@Resource
	private UserMapper userMapper;
	
	@Override
	public Village selectVillageInfo(Integer homeid) {
		Village village = villageMapper.selectByPrimaryKey(homeid);
		village.setPostNum(countPostByHomeid(homeid));
		village.setAttentionNum(countUserByHomeid(homeid));
		return village;
	}

	
	//鄉吧發佈的帖子數
	public int countPostByHomeid(Integer homeid) {
		PostExample postExample = new PostExample();
		com.lqm.home.po.PostExample.Criteria criteria = postExample.createCriteria();
		criteria.andVillageIdEqualTo(homeid);
		return postMapper.countByExample(postExample);
	}
	
	//鄉吧關注人數
		public int countUserByHomeid(Integer homeid) {
			UserExample userExample = new UserExample();
			Criteria criteria = userExample.createCriteria();
			criteria.andHomeidEqualTo(homeid);
			return userMapper.countByExample(userExample);
		}


		/**
		 * 根据地区获取乡吧列表
		 */
		@Override
		public List<Village> getVillageListByDistrict(String district) {
			VillageExample villageExample = new VillageExample();
			com.lqm.home.po.VillageExample.Criteria criteria = villageExample.createCriteria();
			criteria.andDistrictEqualTo(district);
			return villageMapper.selectByExample(villageExample);
		}

		/**
		 * 根据名字查询乡吧
		 */
		@Override
		public Village searchByName(String villageName) {
			VillageExample villageExample = new VillageExample();
			com.lqm.home.po.VillageExample.Criteria criteria = villageExample.createCriteria();
			criteria.andTitleEqualTo(villageName);
			if(villageMapper.selectByExample(villageExample).size()>0){
				return villageMapper.selectByExample(villageExample).get(0);
			}else{
				return null;
			}
		}


		/**
		 * 检查乡吧是否已经被创建
		 * @param villageName
		 * @return
		 */
		@Override
		public boolean isAlreadyCreated(String villageName) {
			VillageExample villageExample  = new VillageExample();
			com.lqm.home.po.VillageExample.Criteria criteria = villageExample.createCriteria();
			criteria.andTitleEqualTo(villageName);
			List<Village> villages = villageMapper.selectByExample(villageExample);
			if(villages.size()>0){
				return true;
			}else{
				return false;
			}
		}


		@Override
		public ResultData<Village> insert(String villageIcon, String villageName, String villageDesc, int attentionNum,
				int postNum, String province, String city, String district) {
			Village village = new Village();
			village.setAttentionNum(attentionNum);
			village.setCity(city);
			village.setProvince(province);
			village.setVillageIcon(villageIcon);
			village.setDistrict(district);
			village.setTitle(villageName);
			village.setVillageDesc(villageDesc);
			village.setPostNum(postNum);
			village.setCreateTime(TimeUtil.getCurrentTimeString());
			
			int villageId = villageMapper.insert(village);
			Village mode = villageMapper.selectByPrimaryKey(villageId);
			
			ResultData<Village> resultData = new ResultData<>();
			resultData.setCode(200);
			resultData.setData(mode);
			resultData.setSuccess(true);
			resultData.setMsg("创建成功");
			return resultData;
		}
}

package com.lqm.home.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lqm.home.mapper.CommentMapper;
import com.lqm.home.mapper.CommentMapperCustom;
import com.lqm.home.mapper.PostMapper;
import com.lqm.home.mapper.PostMapperCustom;
import com.lqm.home.mapper.VillageMapper;
import com.lqm.home.po.Comment;
import com.lqm.home.po.CommentExample;
import com.lqm.home.po.CommentExample.Criterion;
import com.lqm.home.po.Post;
import com.lqm.home.po.PostExample;
import com.lqm.home.po.PostExample.Criteria;
import com.lqm.home.po.Village;
import com.lqm.home.pojo.CommentCustom;
import com.lqm.home.pojo.Page;
import com.lqm.home.pojo.PostCustom;
import com.lqm.home.service.CommentService;
import com.lqm.home.service.PostService;
import com.lqm.home.service.VillageService;
import com.lqm.home.utils.PageUtils;
import com.lqm.home.utils.ResultData;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Transactional
@Service
public class PostServiceImpl implements PostService{

	@Resource
	private PostMapper postMapper;
	@Resource
	private PostMapperCustom postMapperCustom;


	public int deleteByPrimaryKey(Integer id) {
		return postMapper.deleteByPrimaryKey(id);
	}

	public int insert(Post record) {
		return postMapper.insert(record);
	}
	
	public int update(Post record){
		return postMapper.updateByPrimaryKey(record);
	}
		

	public Post selectByPrimaryKey(Integer id) {
		return postMapper.selectByPrimaryKey(id);
	}

	@Override
	public ResultData<List<Post>> selectPosts(Integer currentPage, Integer pageCount, Integer homeid) throws Exception {
        PostCustom custom=new PostCustom();
        custom.setVillageId(homeid);
		Page page;
		ResultData<List<Post>> resultData = new ResultData<>();
		
		if(currentPage>=2){
			page = PageUtils.createPage(pageCount, currentPage);
		}else{
			int count = countByHomeid(homeid);
			page = PageUtils.createPage(pageCount, count, currentPage);
			if(count == 0){
//				json.put("pageNum", count);
				resultData.setData(null);
			}else{
//				json.put("pageNum", page.getTotalPage());
				page = PageUtils.createPage(pageCount, currentPage);
			}
		}	
		custom.setPage(page);
		List<Post> list = postMapperCustom.selectPostpage(custom);
		resultData.setData(list);
		return resultData;
	}

	
	public int countByHomeid(Integer homeid) {
		PostExample postExample = new PostExample();
		Criteria criteria = postExample.createCriteria();
		criteria.andVillageIdEqualTo(homeid);
		return postMapper.countByExample(postExample);
	}
	
}

package com.lqm.home.service;


import java.util.List;

import com.lqm.home.po.Post;
import com.lqm.home.utils.ResultData;

public interface PostService {

	 int insert(Post record);
	 
	 int update(Post record);

	 ResultData<List<Post>> selectPosts(Integer page, Integer num, Integer homeid) throws Exception;

	 Post selectByPrimaryKey(Integer id);
	 
	 

	
}

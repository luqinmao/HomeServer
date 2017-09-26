package com.lqm.home.service;

import java.util.List;


import com.lqm.home.po.Comment;
import com.lqm.home.po.Post;
import com.lqm.home.utils.ResultData;

public interface CommentService {


	ResultData<List<Comment>> selectComments(Integer page, Integer num, Integer postid) throws Exception;
	
	void insert(Comment record);  
	 
	Comment selectByPrimaryKey(Integer id);
	 
}

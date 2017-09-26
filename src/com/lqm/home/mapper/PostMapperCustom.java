package com.lqm.home.mapper;

import java.util.List;

import com.lqm.home.po.Comment;
import com.lqm.home.po.Post;
import com.lqm.home.pojo.CommentCustom;
import com.lqm.home.pojo.PostCustom;


public interface PostMapperCustom {
	
	List<Post> selectPostpage(PostCustom custom) throws Exception;

}

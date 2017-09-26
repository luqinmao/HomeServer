package com.lqm.home.mapper;

import java.util.List;

import com.lqm.home.po.Comment;
import com.lqm.home.pojo.CommentCustom;


public interface CommentMapperCustom {
	
	List<Comment> selectCommentsPageByPostId(CommentCustom custom) throws Exception;
	
	void insertCommentGetCommentId(Comment record);  //返回评论id


}

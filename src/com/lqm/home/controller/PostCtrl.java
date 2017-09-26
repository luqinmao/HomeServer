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

import com.lqm.home.po.Post;
import com.lqm.home.service.PostService;
import com.lqm.home.utils.ImgUtil;
import com.lqm.home.utils.ResultData;
import com.lqm.home.utils.TimeUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Controller
@RequestMapping(value="post",produces="text/plain;charset=UTF-8")
public class PostCtrl {
	
	@Resource
	private PostService postService;

	/***
	 * 创建帖子
	 */
	@RequestMapping(value = "createPost", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.POST)
	@ResponseBody
	public ResultData<Post> createPost(
			@RequestParam(value = "useraccount", required = true) String useraccount,
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "userphoto", required = true) String userphoto,
			@RequestParam(value = "title", required = true) String title,
			@RequestParam(value = "content", required = true) String content,
			@RequestParam(value = "contentImg", required = true) String contentImg,
			@RequestParam(value = "currentPosition", required = true) String currentPosition,
			@RequestParam(value = "createTime", required = true) String createTime,
			@RequestParam(value = "villageId", required = true) Integer villageId,
			HttpServletRequest request,
			@RequestParam(value="img",required = false)List<MultipartFile> img
			) throws Exception {
		
		Post post = new Post();
		
		if(img != null){
			String path = "";
			JSONArray jsonArray = new JSONArray();
			JSONObject jsonObject;
			int i = 1;
			for(MultipartFile f : img){
				jsonObject = new JSONObject();
				jsonObject.put("id", i);
				path = ImgUtil.saveImgInUserFolder(request, f, f.getOriginalFilename(), 
						"/upload/img/"+TimeUtil.getWeeksOneDate());
				jsonObject.put("path", path);
				jsonArray.add(jsonObject);
				i++;
			}
			post.setContentImg(jsonArray.toString());
		}
		post.setUseraccount(useraccount);
		post.setUsername(username);
		post.setUserphoto(userphoto);
		post.setTitle(title);
		post.setContent(content);
		post.setCommentNum("0");
		post.setCurrentPosition(currentPosition);
		post.setCreateTime(TimeUtil.getCurrentTimeString());
		post.setVillageId(villageId);
		
		int postid = postService.insert(post);
		Post returnpost = postService.selectByPrimaryKey(postid);
		
		ResultData<Post> resultData = new ResultData<>();
		resultData.setData(returnpost);
		resultData.setCode(200);
		resultData.setMsg("插入成功");
		System.out.println("返回数据:"+resultData.toString());
		return resultData;
	}
	
	/***
	 * 查询帖子
	 */
	@RequestMapping(value = "getPosts", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.GET)
	@ResponseBody
	public ResultData<List<Post>> getPosts(
			@RequestParam(value = "homeid", required = true) Integer homeid,
			@RequestParam(value = "page", required = true) Integer page,
			@RequestParam(value = "num", required = true) Integer num
			) throws Exception {
		
		ResultData<List<Post>> resultData = new ResultData<>();
		resultData = postService.selectPosts(page, 10, homeid);
		resultData.setCode(200);
		resultData.setMsg("查询成功");
		return resultData;
	}
	
	
	/***
	 * 根据id查询帖子
	 */
	@RequestMapping(value = "getPostById", produces = { "application/json;charset=UTF-8" }, method = RequestMethod.GET)
	@ResponseBody
	public ResultData<Post> getPostById(
			@RequestParam(value = "postid", required = true) Integer postid
			) throws Exception {
		
		ResultData<Post> resultData = new ResultData<>();
		Post post = postService.selectByPrimaryKey(postid);
		resultData.setData(post);
		resultData.setCode(200);
		resultData.setMsg("查询成功");
		return resultData;
	}
	
}

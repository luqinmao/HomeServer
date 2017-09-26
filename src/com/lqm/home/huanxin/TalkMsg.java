package com.lqm.home.huanxin;
import java.util.HashMap;
import java.util.Map;
public class TalkMsg {
	private String action;
	private Map<String,Object>ext;
	private String file_id;
	private Long file_length;
	private String filename;
	private String from;
	private Integer height;
	private Integer length;
	private String msg;
	private String secret;
	private String[]target;
	private Integer target_type;
	private String thumb;
	private String thumb_secret;
	private Integer type;
	private String url;
	private Integer width;
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Map<String, Object> getExt() {
		return ext;
	}
	public void setExt(Map<String, Object> ext) {
		this.ext = ext;
	}
	public String getFile_id() {
		return file_id;
	}
	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}
	public Long getFile_length() {
		return file_length;
	}
	public void setFile_length(Long file_length) {
		this.file_length = file_length;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String[] getTarget() {
		return target;
	}
	public void setTarget(String[] target) {
		this.target = target;
	}
	public Integer getTarget_type() {
		return target_type;
	}
	public void setTarget_type(Integer target_type) {
		this.target_type = target_type;
	}
	public String getThumb() {
		return thumb;
	}
	public void setThumb(String thumb) {
		this.thumb = thumb;
	}
	public String getThumb_secret() {
		return thumb_secret;
	}
	public void setThumb_secret(String thumb_secret) {
		this.thumb_secret = thumb_secret;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	/**
	 * 添加附加数据
	 * */
	public void putExt(String key, Object value) {
		if(ext==null){
			ext = new HashMap<String,Object>();
		}
		ext.put(key,value);
	}
	/**
	 * 取值为【1=文本消息，1=用户消息、2=群发消息、3=聊天室消息】
	 * */
	public String getTargetType() {
		if(target_type!=null){
			switch(target_type){
				case 1:return "users";
				case 2:return "chatgroups";
				case 3:return "chatrooms";
			}
		}
		return null;
	}
	/**
	 * 取值为【1=文本消息、2=图片消息、3=语音消息、4=视频消息、5=透传消息】
	 * */
	public String getMessageType() {
		if(type!=null){
			switch(type){
				case 1:return "txt";
				case 2:return "img";
				case 3:return "audio";
				case 4:return "video";
				case 5:return "cmd";
			}
		}
		return null;
	}
}
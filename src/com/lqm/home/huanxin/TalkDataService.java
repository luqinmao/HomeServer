package com.lqm.home.huanxin;
import java.io.File;
public interface TalkDataService {
	/**
	 * 设置请求Token
	 * @param token 服务端Token
	 * */
	public void setToken(Authentic.Token token);
	/**
	 * 登录环信平台
	 * @param username 注册账户
	 * @param password 登录密码
	 * @param nickname 用户昵称
	 * */
	public TalkNode login(String username, String password) throws Exception;
	/**
	 * 退出环信平台
	 * @param username 注册账户
	 * */
	public TalkNode logout(String username) throws Exception;
	/**
	 * 添加用户信息(单个)
	 * @param username 注册账户
	 * @param password 登录密码
	 * @param nickname 用户昵称
	 * */
	public TalkNode userSave(String username, String password, String nickname) throws Exception;
	/**
	 * 添加用户信息(批量)
	 * @param username 注册账户
	 * @param password 登录密码
	 * @param nickname 用户昵称
	 * */
	public TalkNode userSave(String[] username, String[] password, String[] nickname) throws Exception;
	/**
	 * 删除用户信息(单个)
	 * @param username 注册账户
	 * */
	public TalkNode userDrop(String username) throws Exception;
	/**
	 * 删除用户信息(批量)
	 * @param size 当前页数
	 * */
	public TalkNode userDrop(Long size) throws Exception;
	/**
	 * 启用禁用账户
	 * @param username 注册账户
	 * */
	public TalkNode userModifyAccess(String username, Boolean access) throws Exception;
	/**
	 * 修改用户密码
	 * @param username 注册账户
	 * @param password 登录密码
	 * */
	public TalkNode userModifyPassword(String username, String password) throws Exception;
	/**
	 * 修改用户昵称
	 * @param username 注册账户
	 * @param nickname 用户昵称
	 * */
	public TalkNode userModifyNickname(String username, String nickname) throws Exception;
	/**
	 * 获取用户信息
	 * @param username 注册账户
	 * */
	public TalkNode userGet(String username) throws Exception;
	/**
	 * 获取用户信息
	 * @param size 当前页数
	 * @param cursor 当前游标
	 * @param start 开始毫秒
	 * */
	public TalkNode userList(Long size, String cursor, Long start) throws Exception;
	/**
	 * 判断用户状态
	 * @param username 注册账户
	 * */
	public TalkNode userLine(String username) throws Exception;
	/**
	 * 获取所属群组(好友群)
	 * @param username 注册账户
	 * */
	public TalkNode userGroupList(String username) throws Exception;
	/**
	 * 获取所属群组(聊天室)
	 * @param username 注册账户
	 * */
	public TalkNode userRoomList(String username) throws Exception;
	/**
	 * 获取消息数量(离线)
	 * @param username 注册账户
	 * */
	public TalkNode userMessageCount(String username) throws Exception;
	/**
	 * 获取消息状态(离线)
	 * @param username 注册账户
	 * @param id 消息编号
	 * */
	public TalkNode userMessageLine(String username, String id) throws Exception;
	/**
	 * 添加好友账户
	 * @param username 注册账户
	 * @param friend 好友账户
	 * */
	public TalkNode friendSave(String username, String friend) throws Exception;
	/**
	 * 删除好友账户
	 * @param username 注册账户
	 * @param friend 好友账户
	 * */
	public TalkNode friendDrop(String username, String friend) throws Exception;
	/**
	 * 获取好友列表
	 * @param username 注册账户
	 * */
	public TalkNode friendList(String username) throws Exception;
	/**
	 * 添加拦截账户
	 * @param username 注册账户
	 * @param friend 拦截账户
	 * */
	public TalkNode blockSave(String username, String[] friend) throws Exception;
	/**
	 * 删除拦截账户
	 * @param username 注册账户
	 * @param friend 拦截账户
	 * */
	public TalkNode blockDrop(String username, String friend) throws Exception;
	/**
	 * 获取拦截列表
	 * @param username 注册账户
	 * */
	public TalkNode blockList(String username) throws Exception;
	/**
	 * 添加群组信息
	 * @param owner 所属用户
	 * @param name 群组名称
	 * @param desc 群组描述
	 * @param limit 用户上限
	 * @param friend 好友账户
	 * */
	public TalkNode groupSave(String owner, String name, String desc, Integer limit, String[] friend) throws Exception;
	/**
	 * 删除群组信息
	 * @param id 群组编号
	 * */
	public TalkNode groupDrop(String id) throws Exception;
	/**
	 * 修改群组信息
	 * @param id 群组编号
	 * @param name 群组名称
	 * @param desc 群组描述
	 * @param limit 用户上限
	 * */
	public TalkNode groupModify(String id, String name, String desc, Integer limit) throws Exception;
	/**
	 * 修改群组群主
	 * @param id 群组编号
	 * @param owner 所属用户
	 * */
	public TalkNode groupModifyOwner(String id, String owner) throws Exception;
	/**
	 * 获取群组信息
	 * @param id 群组编号
	 * */
	public TalkNode groupGet(String[] id) throws Exception;
	/**
	 * 获取群组列表
	 * @param size 当前页数
	 * @param cursor 当前游标
	 * @param start 开始毫秒
	 * */
	public TalkNode groupList(Long size, String cursor, Long start) throws Exception;
	/**
	 * 添加群组好友(单个)
	 * @param id 群组编号
	 * @param friend 好友账户
	 * */
	public TalkNode groupFriendSave(String id, String friend) throws Exception;
	/**
	 * 添加群组好友(批量)
	 * @param id 群组编号
	 * @param friend 好友账户
	 * */
	public TalkNode groupFriendSave(String id, String[] friend) throws Exception;
	/**
	 * 删除群组好友(单个)
	 * @param id 群组编号
	 * @param friend 好友账户
	 * */
	public TalkNode groupFriendDrop(String id, String friend) throws Exception;
	/**
	 * 删除群组好友(批量)
	 * @param id 群组编号
	 * @param friend 好友账户
	 * */
	public TalkNode groupFriendDrop(String id, String[] friend) throws Exception;
	/**
	 * 获取群组好友
	 * @param id 群组编号
	 * */
	public TalkNode groupFriendList(String id) throws Exception;
	/**
	 * 添加群组拦截(单个)
	 * @param id 群组编号
	 * @param friend 拦截账户
	 * */
	public TalkNode groupBlackSave(String id, String friend) throws Exception;
	/**
	 * 添加群组拦截(批量)
	 * @param id 群组编号
	 * @param friend 拦截账户
	 * */
	public TalkNode groupBlackSave(String id, String[] friend) throws Exception;
	/**
	 * 删除群组拦截(单个)
	 * @param id 群组编号
	 * @param friend 拦截账户
	 * */
	public TalkNode groupBlackDrop(String id, String friend) throws Exception;
	/**
	 * 删除群组拦截(批量)
	 * @param id 群组编号
	 * @param friend 拦截账户
	 * */
	public TalkNode groupBlackDrop(String id, String[] friend) throws Exception;
	/**
	 * 获取群组拦截
	 * @param id 群组编号
	 * */
	public TalkNode groupBlackList(String id) throws Exception;
	/**
	 * 上传文件数据
	 * @param file 文件数据
	 * */
	public TalkNode fileUpload(File file) throws Exception;
	/**
	 * 下载文件数据
	 * @param id 文件编号
	 * @param share 分享编号
	 * @param thumb 是否缩放
	 * @param file 本地文件
	 * */
	public void fileDown(String id, String share, Boolean thumb, File file) throws Exception;
	/**
	 * 添加消息数据
	 * @param data 消息数据
	 * */
	public TalkNode messageSave(TalkMsg data) throws Exception;
	/**
	 * 获取消息列表
	 * @param size 当前页数
	 * @param cursor 当前游标
	 * @param start 开始毫秒
	 * */
	public TalkNode messageList(Long size, String cursor, Long start) throws Exception;
	/**
	 * 获取聊天列表
	 * @param size 当前页数
	 * @param cursor 当前游标
	 * @param start 开始毫秒
	 * */
	public TalkNode chatList(Long size, String cursor, Long start) throws Exception;
	/**
	 * 添加聊天群组
	 * @param owner 所属用户
	 * @param name 群组名称
	 * @param desc 群组描述
	 * @param limit 用户上限
	 * @param friend 聊天账户
	 * */
	public TalkNode roomSave(String owner, String name, String desc, Integer limit, String[] friend) throws Exception;
	/**
	 * 修改聊天群组
	 * @param id 群组编号
	 * @param name 群组名称
	 * @param desc 群组描述
	 * @param limit 用户上限
	 * */
	public TalkNode roomModify(String id, String name, String desc, Integer limit) throws Exception;
	/**
	 * 删除聊天群组
	 * @param id 群组编号
	 * */
	public TalkNode roomDrop(String id) throws Exception;
	/**
	 * 获取聊天群组
	 * @param id 群组编号
	 * */
	public TalkNode roomGet(String id) throws Exception;
	/**
	 * 获取聊天群组
	 * */
	public TalkNode roomList() throws Exception;
	/**
	 * 获取聊天好友(单个)
	 * @param id 群组编号
	 * @param friend 聊天账户
	 * */
	public TalkNode roomFriendSave(String id, String friend) throws Exception;
	/**
	 * 获取聊天好友(批量)
	 * @param id 群组编号
	 * @param friend 聊天账户
	 * */
	public TalkNode roomFriendSave(String id, String[] friend) throws Exception;
	/**
	 * 删除聊天好友(单个)
	 * @param id 群组编号
	 * @param friend 聊天账户
	 * */
	public TalkNode roomFriendDrop(String id, String friend) throws Exception;
	/**
	 * 删除聊天好友(批量)
	 * @param id 群组编号
	 * @param friend 聊天账户
	 * */
	public TalkNode roomFriendDrop(String id, String[] friend) throws Exception;
}
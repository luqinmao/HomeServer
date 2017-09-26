package com.lqm.home.po;

import java.util.List;

public class LoginReturnData {
	
	List<User> friends;
	
	User myselfInfo;

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	public User getMyselfInfo() {
		return myselfInfo;
	}

	public void setMyselfInfo(User myselfInfo) {
		this.myselfInfo = myselfInfo;
	}

}

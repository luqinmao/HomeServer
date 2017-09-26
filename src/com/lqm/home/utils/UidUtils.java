package com.lqm.home.utils;

import java.util.UUID;

/**
 * 产生唯一身份id
 * @author Administrator
 *
 */
public class UidUtils {

	public static String generateUid(){
		
		UUID uuid = UUID.randomUUID();
		long currentTimeMillis = System.currentTimeMillis();
		String uid = uuid.toString() +"-"+ currentTimeMillis;
		
		return uid;
	}
	
	public static void main(String[] args) {
		System.out.println(generateUid());
	}
}

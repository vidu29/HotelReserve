package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.UserInfoEntity;

public interface UserInfoService {
	public UserInfoEntity addUserInfo(UserInfoEntity userInfo);
	
	public UserInfoEntity getuserInfoById(long userId);
	
	public UserInfoEntity updateUserInfoById(long userId,UserInfoEntity userInfo);
	
	public UserInfoEntity getUserInfoByEmail(String userEmail);
	
	public List<UserInfoEntity> getAllUserByRoomId(long roomId);

	UserInfoEntity updateUserInfo(UserInfoEntity userinfo, long id);

	void deleteUserInfo(long id);

	List<UserInfoEntity> getAllUser();

}

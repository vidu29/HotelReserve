package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserInfoEntity;

public interface UserService {
	public UserEntity addStudentData (UserEntity userEntity);
	
	public UserEntity getUserById(String userName);
	
	public boolean loginDemo(String userName,String password);

	public UserEntity getUserByEmail(String userEmail);

	public UserEntity updatePassword(String email,UserEntity userEntity);

	List<UserEntity> getAllUser();

	void deleteUser(long id);

	UserEntity getUserById(Long userId);
	
	UserEntity updateUser(UserEntity user, long id);

}

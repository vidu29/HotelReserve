package com.example.demo.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserInfoEntity;
//import com.example.demo.model.Employee;
import com.example.demo.service.UserInfoService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
	private UserInfoService userInfoService;
	
	public UserInfoController(UserInfoService userInfoService) 
	{
		super();
		this.userInfoService = userInfoService;
	}

	@PostMapping
	public ResponseEntity<UserInfoEntity> addUserInfo(@RequestBody UserInfoEntity UserInfo)
	{
		return new ResponseEntity<UserInfoEntity>(userInfoService.addUserInfo(UserInfo),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<UserInfoEntity> updateUserInfoById(@PathVariable("id") long userId,@RequestBody UserInfoEntity userInfo)
	{
		return new ResponseEntity<UserInfoEntity>(userInfoService.updateUserInfoById(userId, userInfo),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserInfoEntity> getUserInfoById(@PathVariable("id") long userId)
	{
		return new ResponseEntity<UserInfoEntity>(userInfoService.getuserInfoById(userId),HttpStatus.OK);
	}

	@GetMapping("/email/{userEmail}")
	public ResponseEntity<UserInfoEntity> getUserInfoByEmail(@PathVariable("userEmail") String userEmail)
	{
		return new ResponseEntity<UserInfoEntity>(userInfoService.getUserInfoByEmail(userEmail),HttpStatus.OK);
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<UserInfoEntity>> getAllUserByProductId(@PathVariable("id") long roomId) 
	{
		return new ResponseEntity<List<UserInfoEntity>>(userInfoService.getAllUserByRoomId(roomId),HttpStatus.OK);
	}
	@GetMapping
	public List<UserInfoEntity>getUser()
	{
		return userInfoService.getAllUser();
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id")long id)
	{
		userInfoService.deleteUserInfo(id);
		return new ResponseEntity<String>("Employee Deleted Successfully...",HttpStatus.OK);
		
	}
	@PutMapping("{id}")
	public ResponseEntity<UserInfoEntity>updateUserInfo(@PathVariable("id")long id,@RequestBody UserInfoEntity userinfo)
	{
		return new ResponseEntity<UserInfoEntity>(userInfoService.updateUserInfo(userinfo,id),HttpStatus.OK);
	}
}



package com.example.demo.controller;


import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
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

import com.example.demo.entity.UserEntity;
import com.example.demo.entity.UserInfoEntity;
import com.example.demo.service.UserService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user")
public class UserController {
	private UserService userService;
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userEntity)
	{
		
		return new ResponseEntity<UserEntity>(this.userService.addStudentData( userEntity),HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable("userId") long userId)
	{
		return new ResponseEntity<UserEntity>(userService.getUserById(userId),HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<Boolean> findUserPasswordById(@RequestBody UserEntity userEntity) {
	    return new ResponseEntity<Boolean>(userService.loginDemo(userEntity.getUserName(), userEntity.getUserPassword()), HttpStatus.OK);
	}

	
	@GetMapping("/email/{email}")
	public ResponseEntity<UserEntity> getUserByEmail(@PathVariable("email") String userEmail) 
	{
		return new ResponseEntity<UserEntity>(userService.getUserByEmail(userEmail),HttpStatus.OK);
	}
	
	@PostMapping("/forgetPassword/{email}")
	public ResponseEntity<UserEntity> updatePassword(@PathVariable("email") String email, @RequestBody UserEntity userEntity)
	{
		return new ResponseEntity<UserEntity>(userService.updatePassword(email,userEntity),HttpStatus.OK);
	}
	
	@GetMapping
	public List<UserEntity>getUser()
	{
		return userService.getAllUser();
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id")long id)
	{
		userService.deleteUser(id);
		return new ResponseEntity<String>("User Deleted Successfully...",HttpStatus.OK);
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<UserEntity>updateUser(@PathVariable("id")long id,@RequestBody UserEntity user)
	{
		return new ResponseEntity<UserEntity>(userService.updateUser(user,id),HttpStatus.OK);
	}

}



package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AdminDTO;
import com.example.demo.dto.LoginDTO;
import com.example.demo.responses.LoginResponses;
import com.example.demo.service.AdminService;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/admin")

public class AdminController {
	@Autowired
   private AdminService adminService;
	@PostMapping(path="/register")
	public String saveAdmin(@RequestBody AdminDTO adminDTO)
	{
		String id=adminService.addAdmin1(adminDTO);
		return id;
	}
	@PostMapping(path="/login")
	public ResponseEntity<?>loginAdmin(@RequestBody LoginDTO loginDTO)
	{
		LoginResponses  loginResponses=adminService.loginAdmin1(loginDTO);
		return ResponseEntity.ok(loginResponses);
	}
}
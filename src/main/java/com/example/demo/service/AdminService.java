package com.example.demo.service;

import com.example.demo.dto.AdminDTO;
import com.example.demo.dto.LoginDTO;
import com.example.demo.responses.LoginResponses;

public interface AdminService {
String addAdmin1(AdminDTO adminDTO);
LoginResponses loginAdmin1(LoginDTO loginDTO);

}
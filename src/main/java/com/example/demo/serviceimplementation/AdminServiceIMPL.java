package com.example.demo.serviceimplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AdminDTO;
import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Admin;
import com.example.demo.repository.AdminRepo;
import com.example.demo.responses.LoginResponses;
import com.example.demo.service.AdminService;
@Service
public class AdminServiceIMPL implements AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public String addAdmin1(AdminDTO adminDTO) {
		// TODO Auto-generated method stub
		Admin admin=new Admin(
		adminDTO.getId(),
		adminDTO.getUsername(),
		adminDTO.getEmail(),
		this.passwordEncoder.encode(adminDTO.getPassword()));
		adminRepo.save(admin);
		return admin.getUsername();
	}
AdminDTO adminDTO;
	@Override
	public LoginResponses loginAdmin1(LoginDTO loginDTO) {
		// TODO Auto-generated method stub
		String msg = "";
		Admin admin1= adminRepo.findByEmail(loginDTO.getEmail());
		if( admin1!=null)
		{
			String password=loginDTO.getPassword();
			String encodedPassword= admin1.getPassword();
	        Boolean isPwdRight=passwordEncoder.matches(password, encodedPassword);
if(isPwdRight)
{
	Optional<Admin>admin=adminRepo.findByEmailAndPassword(loginDTO.getEmail(), encodedPassword);

	if(admin.isPresent())

	{
		return new LoginResponses("Login Success",true);
		
	}
	else
	{
		return new LoginResponses("Login Fails",false);
	}
		
		}
		else
		{
		
		return new LoginResponses("Password Not Match",false);
	}
	}
	else
	{
		return new LoginResponses("Email does not Exist",false);
	}

}
}
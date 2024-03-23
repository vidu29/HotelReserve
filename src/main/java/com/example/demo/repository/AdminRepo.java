package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin,Integer>{
	//optional introduced in java , convey the msg thatn there may be no value without using null
	Optional<Admin>findByEmailAndPassword(String email,String password);
Admin findByEmail(String Email);
}

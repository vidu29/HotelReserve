package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobelException 
{
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIResponce> getException(ResourceNotFoundException ex)
	{
		String ms=ex.getMessage();
		APIResponce obj=new APIResponce();
		obj.setMessage(ms);
		obj.setStatus(false);
		
		return new ResponseEntity<APIResponce>(obj,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(ResourceFoundException.class)
	public ResponseEntity<APIResponce> getException(ResourceFoundException ex)
	{
		String ms=ex.getMessage();
		
		APIResponce obj=new APIResponce();
		obj.setMessage(ms);
		obj.setStatus(false);
		
		return new ResponseEntity<APIResponce>(obj,HttpStatus.OK);
	}
}



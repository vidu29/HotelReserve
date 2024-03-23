package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Feedback;
import com.example.demo.service.FeedbackService;

@CrossOrigin("*")
@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	private FeedbackService service;
	
	public FeedbackController(FeedbackService service) {
		super();
		this.service = service;
	}


	@PostMapping
	public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback) 
	{
		return new ResponseEntity<Feedback>(service.addFeedback(feedback),HttpStatus.CREATED);
	}

	@GetMapping("/email/{email}")
	public ResponseEntity<List<Feedback>> getAllFeedbackByEmail(@PathVariable("email") String email)
	{
		
		return new ResponseEntity<List<Feedback>>(service.getAllFeedbackByEmail(email),HttpStatus.OK);
	}

	@GetMapping("/id/{id}")
	public ResponseEntity<Feedback> getFeedbackById(@PathVariable("id") long id) 
	{
	
		return new ResponseEntity<Feedback>(service.getFeedbackById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFeedbackById(@PathVariable("id") long id) 
	{
	
		service.deleteFeedbackById(id);
	}
	@GetMapping
	public List<Feedback>getFeedback()
	{
		return service.getFeedback();
	}
}
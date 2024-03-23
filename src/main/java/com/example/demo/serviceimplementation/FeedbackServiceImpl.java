package com.example.demo.serviceimplementation;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.demo.entity.Feedback;
import com.example.demo.repository.FeedbackRepository;
import com.example.demo.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	private FeedbackRepository repository;
	
	public FeedbackServiceImpl(FeedbackRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Feedback addFeedback(Feedback feedback) 
	{
		
		return repository.save(feedback);
	}

	@Override
	public List<Feedback> getAllFeedbackByEmail(String email)
	{
		
		return repository.getFeedbackByEmail(email);
	}

	@Override
	public Feedback getFeedbackById(long id) 
	{
	
		return repository.findById(id).get();
	}

	@Override
	public void deleteFeedbackById(long id) 
	{
	
		repository.deleteById(id);
	}

	@Override
	public List<Feedback> getFeedback() {
		
		return repository.getFeedback();
	}	

}

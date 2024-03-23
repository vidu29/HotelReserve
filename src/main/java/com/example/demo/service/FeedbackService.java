package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.Feedback;
public interface FeedbackService {
	public Feedback addFeedback(Feedback feedback);
	
	public List<Feedback> getAllFeedbackByEmail(String email);
	
	public Feedback getFeedbackById(long id);
	
	public void deleteFeedbackById(long id);

	List<Feedback> getFeedback();

}

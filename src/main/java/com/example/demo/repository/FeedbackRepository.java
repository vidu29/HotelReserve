package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
	@Query(value="select*from feedback where user_email=:email",nativeQuery = true)
	public List<Feedback> getFeedbackByEmail(@Param("email") String email);

	@Query(value="select*from feedback",nativeQuery = true)
	public List<Feedback> getFeedback();



}

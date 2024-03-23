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

import com.example.demo.entity.BookRoomEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.BookRoomService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bookRoom")
public class BookRoomController {
	private BookRoomService service;

	public BookRoomController(BookRoomService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<BookRoomEntity> addBookRoom(@RequestBody BookRoomEntity bookRoom)
	{
		return new ResponseEntity<BookRoomEntity>(service.addBookRoom(bookRoom),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<BookRoomEntity> getBookRoomById(@PathVariable("id") long id)
	{
		return new ResponseEntity<BookRoomEntity>(service.getBookRoomById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteBuyRoomById(@PathVariable("id") long id)
	{
		return new ResponseEntity<String>( service.deleteBookRoomById(id),HttpStatus.OK);
	}
	
	@GetMapping("/getAllByEmail/{email}")
	public ResponseEntity<List<BookRoomEntity>> getBookRoomByEmail(@PathVariable("email")String userEmail)
	{
		
		return new ResponseEntity<List<BookRoomEntity>> (service.getBookRoomByEmail(userEmail),HttpStatus.OK);
	}


	@GetMapping("/getAllByRoomId/{id}")
	public ResponseEntity<List<BookRoomEntity>> getBuyRoomByRoomId(@PathVariable("id") long roomId) 
	{	
		return new ResponseEntity<List<BookRoomEntity>>(service.getBookRoomByRoomId(roomId),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<BookRoomEntity>> getAllBookRooms()
	{
		return new ResponseEntity<List<BookRoomEntity>>(service.getAllBookRoom(),HttpStatus.OK);
	}




}



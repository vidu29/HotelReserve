package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.BookRoomEntity;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.BookRoomRepository;
import com.example.demo.service.BookRoomService;

@Service
public class BookRoomServiceImple implements BookRoomService 
{
	
	private BookRoomRepository repository;
	
	public BookRoomServiceImple(BookRoomRepository repository) 
	{
		super();
		this.repository = repository;
	}

	@Override
	public BookRoomEntity addBookRoom(BookRoomEntity bookRoom) 
	{	
		return repository.save(bookRoom);
	}

	@Override
	public BookRoomEntity getBookRoomById(long id) 
	{	
		return repository.findById(id).get();
	}

	@Override
	public String deleteBookRoomById(long id) 
	{
		repository.deleteById(id);
		return "Record Deleted SuccessFully";
	}

	@Override
	public List<BookRoomEntity> getBookRoomByEmail(String userEmail) {
	
		return repository.findAllByEmail(userEmail);
	}

	@Override
	public List<BookRoomEntity> getBookRoomByRoomId(long roomId) 
	{
	
		return repository.findAllByRoomId(roomId);
	}

	@Override
	public List<BookRoomEntity> getAllBookRoom() {
		
		return repository.findAll();
	}
	
}
package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.BookRoomEntity;
import com.example.demo.entity.UserEntity;

public interface BookRoomService {
	public BookRoomEntity addBookRoom(BookRoomEntity bookRoom);
	
	public BookRoomEntity getBookRoomById(long id);
	
	public String deleteBookRoomById(long id);
	
	public List<BookRoomEntity> getBookRoomByEmail(String userEmail);
	
	public List<BookRoomEntity> getBookRoomByRoomId(long roomId);
	
	public List<BookRoomEntity> getAllBookRoom();

}

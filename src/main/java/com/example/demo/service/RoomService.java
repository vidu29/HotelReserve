package com.example.demo.service;
import java.util.List;

import com.example.demo.entity.RoomEntity;

public interface RoomService {
	public RoomEntity addRoom(RoomEntity room);
	
	public List<RoomEntity> getAllRoom();
	
	public RoomEntity updateRoomById(long roomId,RoomEntity room);
	
	public String deleteRoomById(long roomId);
	
	public RoomEntity getRoomById(long roomId);
	
	public List<RoomEntity> getAllRoomById();

	Long[] getAllRoomId();

	String deleteroomById(long roomId);

	List<RoomEntity> getAllRoomByiId();

}

package com.example.demo.serviceimplementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.RoomEntity;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.RoomRepository;
import com.example.demo.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService 
{
	
	Long[] productId;
	
	private RoomRepository roomRepository;
	
	public RoomServiceImpl(RoomRepository roomRepository)
	{
		super();
		this.roomRepository = roomRepository;
	}

	@Override
	public RoomEntity addRoom(RoomEntity room) 
	{
		return roomRepository.save(room);
	}

	@Override
	public List<RoomEntity> getAllRoom() 
	{	
		return roomRepository.findAll();
	}

	@Override
	public RoomEntity updateRoomById(long roomId, RoomEntity room) 
	{	
		roomRepository.findById(roomId).orElseThrow(()->new ResourceNotFoundException("ProductSerialNo",roomId));
		return roomRepository.save(room);
	}

	@Override
	public String deleteRoomById(long roomId) 
	{
		roomRepository.deleteById(roomId);	
		
		return "Record Deleted SucessFully";
	}

	@Override
	public RoomEntity getRoomById(long roomId) 
	{	
		return roomRepository.findById(roomId).get();
	}

	@Override
	public List<RoomEntity> getAllRoomByiId() 
	{
		List<RoomEntity> productEntityList=new ArrayList<RoomEntity>();
		for(int i=0;i<productId.length;i++)
		{
			productEntityList.add(roomRepository.getRoomsByRoomId(productId[i]));
		}
		return productEntityList;
	}
	
	@Override
	public Long[] getAllRoomId()
	{	
		return this.productId=roomRepository.getAllRoomId(); 
	}

	@Override
	public List<RoomEntity> getAllRoomById() {
		
		return null;
	}

	@Override
	public String deleteroomById(long roomId) {
		
		return null;
	}	
}
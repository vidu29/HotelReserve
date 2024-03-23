package com.example.demo.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.RoomEntity;
import com.example.demo.serviceimplementation.RoomServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/room")
public class RoomController {
	private RoomServiceImpl roomService;
	
	public RoomController(RoomServiceImpl roomService)
	{
		super();
		this.roomService = roomService;
	}

	@PostMapping
	public ResponseEntity<RoomEntity> addProducts(@RequestBody RoomEntity room)
	{
		return new ResponseEntity<RoomEntity>(roomService.addRoom(room),HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<RoomEntity> updateRoomById(@PathVariable("id")long roomSerialNo,@RequestBody RoomEntity room)
	{	
		return new ResponseEntity<RoomEntity>(roomService.updateRoomById(roomSerialNo, room),HttpStatus.OK);
	}
		
	@GetMapping
	public ResponseEntity<List<RoomEntity>> getAllRooms()
	{
		return new ResponseEntity<List<RoomEntity>>(roomService.getAllRoom(),HttpStatus.OK);
	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<RoomEntity> getProductById(@PathVariable("id") long roomSerialNo)
//	{
//		return new ResponseEntity<RoomEntity>(roomService.getRoomById(roomSerialNo),HttpStatus.OK);
//	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRoomById(@PathVariable("id") long roomSerialNo)
	{
		return new ResponseEntity<String>(roomService.deleteRoomById(roomSerialNo),HttpStatus.OK);
	}
	
}



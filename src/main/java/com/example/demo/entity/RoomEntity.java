package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roomId;
	
	@Column
	private String roomType;
	
	@Column
	private int totalRooms;
	
	@Column
	private int cost;
	
	@Column
	private int availableRooms;
	
	@Column
	private String roomRating;
	
	@Column
	private String uploadImage;

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long RoomId) {
		this.roomId = RoomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getTotalRooms() {
		return totalRooms;
	}

	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}
	
	public int getAvailableRooms() {
		return availableRooms;
	}

	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}

	public String getRoomRating() {
		return roomRating;
	}

	public void setRoomRating(String roomRating) {
		this.roomRating = roomRating;
	}
	
	@Override
	public String toString() {
		return "RoomEntity [roomId=" + roomId + ", roomType=" + roomType + ", totalRooms=" + totalRooms + ", cost=" + cost
				+ ", availableRooms=" + availableRooms + ", roomRating=" + roomRating + "]";
	}

	public RoomEntity() {
		super();
		
	}	

}
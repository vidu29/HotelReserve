package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookRoomEntity {
	@Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
		
		@Column
		private String userEmail;
		
		@Column
		private long roomType;
		
		@Column
		private int cost;
		
		@Column
		private String paymentMethod;

		public String getUserEmail() {
			return userEmail;
		}

		public void setUserEmail(String userEmail) {
			this.userEmail = userEmail;
		}

		public long getRoomType() {
			return roomType;
		}

		public void setRoomType(long roomType) {
			this.roomType = roomType;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		public String getPaymentMethod() {
			return paymentMethod;
		}

		public void setPaymentMethod(String paymentMethod) {
			this.paymentMethod = paymentMethod;
		}
		
		public BookRoomEntity() {
			super();
		}

		@Override
		public String toString() {
			return "BookRoomEntity [userEmail=" + userEmail + ", roomType=" + roomType + ", cost=" + cost
					+ ", paymentMethod=" + paymentMethod + "]";
		}	
		
	}



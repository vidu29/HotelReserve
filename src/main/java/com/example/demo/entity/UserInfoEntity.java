package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserInfoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;

	@Column(length = 20)
	private String userFirstName;
	
	@Column(length = 20)
	private String userLastName;
	
	@Column(unique=true)
	private String userEmail;
	
	@Column(length=3)
	private byte userAge;
	
	@Column(length=10)
	private long userContactNumber;
	
	@Column
	private String userGender;
	
	@Column
	private String userCountry;
	
	@Column
	private String userState;
	
    @Column
    private String userDistrict;
	
	@Column
    private int userPincode;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public byte getUserAge() {
		return userAge;
	}

	public void setUserAge(byte userAge) {
		this.userAge = userAge;
	}

	public long getUserContactNumber() {
		return userContactNumber;
	}

	public void setUserContactNumber(long userContactNumber) {
		this.userContactNumber = userContactNumber;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserCountry() {
		return userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserDistrict() {
		return userDistrict;
	}

	public void setUserDistrict(String userDistrict) {
		this.userDistrict = userDistrict;
	}

	public int getUserPincode() {
		return userPincode;
	}

	public void setUserPincode(int userPincode) {
		this.userPincode = userPincode;
	}

	@Override
	public String toString() {
		return "UserInfoEntity [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName="
				+ userLastName + ", userEmail=" + userEmail + ", userAge=" + userAge + ", userContactNumber="
				+ userContactNumber + ", userGender=" + userGender + ", userCountry=" + userCountry + ", userState="
				+ userState + ", userDistrict=" + userDistrict + ", userPincode=" + userPincode + "]";
	}

	public UserInfoEntity() {
		super();
	}	
}
package com.example.demo.responses;

public class LoginResponses {
String message;
Boolean status;

public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Boolean getStatus() {
	return status;
}
public void setStatus(Boolean status) {
	this.status = status;
}
public LoginResponses(String message, Boolean status) {
	super();
	this.message = message;
	this.status = status;
}

}

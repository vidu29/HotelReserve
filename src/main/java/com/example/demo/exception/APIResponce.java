package com.example.demo.exception;

public class APIResponce {
	private String message;
	
	private boolean status;

	public APIResponce(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public APIResponce() {
		super();	
	}
	@Override
	public String toString() {
		return "APIResponce [message=" + message + ", status=" + status + "]";
	}
}



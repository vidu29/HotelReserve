package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException
{
	private static final long serialVersionUID =3L;
	
	private String resourceName;
	
	private long resourceValue;
	
	public ResourceNotFoundException(String resourceName, long resourceValue) {
		super(String.format("%s : %s is Not Exists",resourceName,resourceValue));
		this.resourceName = resourceName;
		this.resourceValue = resourceValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public long getResourceValue() {
		return resourceValue;
	}

	public void setResourceValue(long resourceValue) {
		this.resourceValue = resourceValue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ResourceNotFoungException [resourceName=" + resourceName + ", resourceValue=" + resourceValue + "]";
	}

	public ResourceNotFoundException() {
		super();
		
	}

	public ResourceNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public ResourceNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ResourceNotFoundException(String message) {
		super(message);
		
	}

	public ResourceNotFoundException(Throwable cause) {
		super(cause);
		
	}

}
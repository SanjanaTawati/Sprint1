package com.event1.exception;

public class ResourceNotFoundException extends RuntimeException{
	public ResourceNotFoundException(String message) {
		super(message);
	}

}

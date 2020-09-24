package com.hsbc.exception;

@SuppressWarnings("serial")
public class CategoryNotFoundException extends Exception {

	public CategoryNotFoundException() {
		super("Sorry User not found");
	}
	
	public CategoryNotFoundException(String msg) {
		super(msg);
	}
	
}

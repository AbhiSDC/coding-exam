package com.hsbc.exception;

@SuppressWarnings("serial")
public class DuplicateEntryException extends Exception {

	public DuplicateEntryException() {
		super("Item with same code already exists.");
	}
	
	public DuplicateEntryException(String m) {
		super(m);
	}

}

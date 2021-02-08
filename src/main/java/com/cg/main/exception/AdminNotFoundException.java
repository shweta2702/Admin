package com.cg.main.exception;

public class AdminNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminNotFoundException() {
		
	}

	/**
	 * 
	 * @param message
	 */
	public AdminNotFoundException(String message) {
		super(message);
	}
}

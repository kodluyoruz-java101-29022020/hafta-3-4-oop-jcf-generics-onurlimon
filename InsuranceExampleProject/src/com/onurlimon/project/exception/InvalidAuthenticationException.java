package com.onurlimon.project.exception;

public class InvalidAuthenticationException extends Throwable {

	private String message;

	public InvalidAuthenticationException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

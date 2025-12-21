package com.zepto.banking.exception;

public class StatusInActiveException extends RuntimeException{
	public StatusInActiveException(String _message) {
		super(_message);
	}
}

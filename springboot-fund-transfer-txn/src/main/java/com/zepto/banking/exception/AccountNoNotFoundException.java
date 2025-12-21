package com.zepto.banking.exception;

public class AccountNoNotFoundException extends RuntimeException{
	public AccountNoNotFoundException(String _message) {
		super(_message);
	}
}

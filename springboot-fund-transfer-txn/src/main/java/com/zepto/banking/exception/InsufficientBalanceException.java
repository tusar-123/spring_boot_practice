package com.zepto.banking.exception;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String _message) {
		super(_message);
	}
}

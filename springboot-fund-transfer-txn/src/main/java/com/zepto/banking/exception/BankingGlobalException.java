package com.zepto.banking.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.zepto.banking.response.ExceptionResponse;

@RestControllerAdvice
public class BankingGlobalException {
	public ResponseEntity accNoNotFound(AccountNoNotFoundException accountNoNotFoundException) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setStatusCode("ACC001");
		exceptionResponse.setMessage(accountNoNotFoundException.getMessage());
		return ResponseEntity.ok(exceptionResponse);
		
	} 
	public ResponseEntity insufficientBalance(InsufficientBalanceException insufficientBalanceException) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setStatusCode("BAL0001");
		exceptionResponse.setMessage(insufficientBalanceException.getMessage());
		return ResponseEntity.ok(exceptionResponse);
	}
	public ResponseEntity statusInActive(StatusInActiveException statusInActiveException) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setStatusCode("STA000IN");
		exceptionResponse.setMessage(statusInActiveException.getMessage());
		return ResponseEntity.ok(exceptionResponse);
	}
}

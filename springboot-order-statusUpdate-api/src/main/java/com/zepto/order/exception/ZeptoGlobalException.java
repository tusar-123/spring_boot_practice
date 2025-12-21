package com.zepto.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ZeptoGlobalException {
	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<String> orderNotFoundHandler(OrderNotFoundException orderEx){
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(orderEx.getMessage());
		
	}
}

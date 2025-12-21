package com.zepto.order.controller;

import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.request.OrderRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class OrderProcessController {
	
	@PostMapping("orderProcess")
	public ResponseEntity postMethodName(@RequestBody OrderRequest orderRequest) {
	System.out.println("order in process will reached to u soon::::::::::::::::::::");
		
		return ResponseEntity.ok("your order under process and delivered soon...");
	}
	
}

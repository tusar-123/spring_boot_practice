package com.zepto.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
import com.zepto.order.exception.OrderNotFoundException;
import com.zepto.order.repository.OrderRepository;
import com.zepto.order.request.OrderRequest;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;

	public OrderEntity updateStatus(Integer order_id, OrderRequest orderRequest) {
		OrderEntity orderEntity = orderRepository.findById(order_id).orElseThrow(() -> new OrderNotFoundException("Order not found"));
		orderEntity.setStatus(orderRequest.getStatus());
		orderRepository.save(orderEntity);
		return orderEntity;
		
	}
}

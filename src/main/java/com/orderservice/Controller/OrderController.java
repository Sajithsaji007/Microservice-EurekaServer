package com.orderservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.Entity.Order;
import com.orderservice.Entity.Payment;
import com.orderservice.Entity.TranscationRequest;
import com.orderservice.Entity.TranscationResponse;
import com.orderservice.Service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService service;

	@PostMapping("/bookOrders")
	public TranscationResponse bookOrder(@RequestBody TranscationRequest request) {
		return service.saveOrder(request);
		// do a rest call to payment and pass the order id
	}
	
}

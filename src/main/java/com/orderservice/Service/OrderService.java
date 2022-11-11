package com.orderservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orderservice.Entity.Order;
import com.orderservice.Entity.Payment;
import com.orderservice.Entity.TranscationRequest;
import com.orderservice.Entity.TranscationResponse;
import com.orderservice.Repository.OrderRepository;

@Service
public class OrderService {
@Autowired
private OrderRepository repository;
@Autowired
private RestTemplate template;

public TranscationResponse saveOrder(TranscationRequest request) {;
	String response="";
	Order order=request.getOrder();
	Payment payment=request.getPayment();
	payment.setOrderId(order.getId());
	payment.setAmount(order.getPrice());
	//rest call
	Payment paymentResponse=template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
	response = paymentResponse.getPaymentStatus().equals("success")?"payment processing successful and order placed":"there is a failure in payment api , order added to cart";
	 repository.save(order);
	 return new TranscationResponse(order,paymentResponse.getAmount(),paymentResponse.getTranscationId(), response);
}
}

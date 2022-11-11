package com.orderservice.Entity;

public class TranscationRequest {

	private Order order;
	private Payment payment;
	public TranscationRequest(Order order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	
}

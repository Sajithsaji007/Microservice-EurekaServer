package com.orderservice.Entity;


public class Payment {

	private int paymentId;
	private String paymentStatus;
	private String transcationId;
	private int orderId;
	private double amount;

	public Payment(int paymentId, String paymentStatus, String transcationId, int orderId, double amount) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transcationId = transcationId;
		this.orderId = orderId;
		this.amount = amount;
	}
	public Payment() {
		super();
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTranscationId() {
		return transcationId;
	}
	public void setTranscationId(String transcationId) {
		this.transcationId = transcationId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}

package com.example.project4RabbitMq.Model;

public class Status {
	private Order order;
	private String status;
	private String message;
	public Status() {
		// TODO Auto-generated constructor stub
	}
	public Status(Order order, String status, String message) {
		super();
		this.order = order;
		this.status = status;
		this.message = message;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Status [order=" + order + ", status=" + status + ", message=" + message + "]";
	}
	
}

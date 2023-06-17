package com.example.project4RabbitMq.Model;

public class Order {
	private String orderid;
	private String name;
	private String qty;
	private String price;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(String orderid, String name, String qty, String price) {
		super();
		this.orderid = orderid;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
}

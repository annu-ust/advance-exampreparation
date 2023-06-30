package com.example.project5MS1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue
 private long id;
 private String name;
 private int price;
 public Book() {
	// TODO Auto-generated constructor stub
}
public Book(long id, String name, int price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
 
}

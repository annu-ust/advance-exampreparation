package com.example.project1ConsumerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1ConsumerService.interfaces.StudentInterface;
import com.example.project1ConsumerService.model.Book;

@RestController
@RequestMapping("/student")
public class StudentController {
 @Autowired
 StudentInterface iface;
 @GetMapping("/retrieve/all")
 public List<Book> getAll() {
	 
	  return iface.getBooks();
	  
 }
 																																												//http://localhost:7082/client/products-by-id/2
 @GetMapping("/fetch/{id}")
	public Book getProductById(@PathVariable ("id") long id) {
	   System.out.println(id);
	   return iface.getBooksById(id);
 }
 																																											// http://localhost:7082/client/products-by-category/Mobile
 @PutMapping("/update/{id}")
	public List<Book> getProductsById(@PathVariable("id") long id){
	 
	           return iface.getProductsById(id);
 }
}

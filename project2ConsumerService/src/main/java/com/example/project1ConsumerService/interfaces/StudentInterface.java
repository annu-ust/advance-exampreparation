package com.example.project1ConsumerService.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.project1ConsumerService.model.Book;

@FeignClient(name="bookservice")
public interface StudentInterface {
	@RequestMapping(method=RequestMethod.GET, value="book/retrieve/all")
	public List<Book> getBooks();
	
	@RequestMapping(method= RequestMethod.GET, value= "book/fetch/{id}", produces="application/json")
	public Book getBooksById(@PathVariable ("id") long id);
	
	@RequestMapping(method=RequestMethod.PUT, value="book/update/{id}", produces="application/json")
	public List<Book> getProductsById(@PathVariable ("id") long id);

}

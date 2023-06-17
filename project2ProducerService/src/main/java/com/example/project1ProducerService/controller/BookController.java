package com.example.project1ProducerService.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1ProducerService.Repository.BookRepository;
import com.example.project1ProducerService.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {
  @Autowired
  BookRepository bookrepo;
//create
@PostMapping("/create")
public ResponseEntity<?> createProduct(@RequestBody Book book){
	return ResponseEntity.status(HttpStatus.CREATED).body(bookrepo.save(book));}
//retrieve by id
@GetMapping("/fetch/{id}")

  public ResponseEntity<?> retrieve(@PathVariable long id) {
  Optional<Book>opt=bookrepo.findById(id); 
  if(opt.isPresent())
    {
	  return ResponseEntity.ok().body(opt.get());
	  } 
  else {
	  return ResponseEntity.noContent().build();
	  }
  }
 
	

@GetMapping("/retrieve/all")
public ResponseEntity<?>fetchall(){
	return ResponseEntity.ok().body(bookrepo.findAll());
	}

//update

@PutMapping("/update/{id}")
public ResponseEntity<?>update(@PathVariable long id,@RequestBody Book book){
	Optional<Book>opt=bookrepo.findById(id);
    Book p=null;
    if(opt.isPresent()) {
    	p=opt.get();
    	p.setId(book.getId());
    	p.setName(book.getName());
    	p.setPrice(book.getPrice());
    	return ResponseEntity.ok().body(bookrepo.save(p));
    }
    else {
	return null;}
}

//delete 
@DeleteMapping("/delete/{id}")
public ResponseEntity<?>delete(@PathVariable long id ){
	Optional<Book>opt=bookrepo.findById(id);
	if(opt.isPresent())
	{
	     bookrepo.deleteById(id);
		return ResponseEntity.ok().body(null);
	}
	else
		return ResponseEntity.notFound().build();
		
			
			
	
}
	

}

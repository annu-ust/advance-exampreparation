package com.example.project5MS1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project5MS1.Model.Book;
import com.example.project5MS1.Repository.BookRepository;

@Controller
@RequestMapping("/book")
public class BookController {
	@Autowired
	BookRepository repo;
	
//create
@PostMapping("/create")
public ResponseEntity<Book>Create(@RequestBody Book bk){
	return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(bk));
}

//fethall
@GetMapping("/fetchall")
public ResponseEntity<List<Book>> getAll(){
	return ResponseEntity.status(HttpStatus.ACCEPTED).body(repo.findAll());
}
//fetchbyid
@GetMapping("/fetch/{id}")
public ResponseEntity<Book>fetchById(@PathVariable long id){
	Optional<Book>opt=repo.findById(id);
	if(opt.isPresent()) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(opt.get());
	}
	else {
		return ResponseEntity.noContent().build();
	}
	
}
//update
@PutMapping("/update/{id}")
public ResponseEntity<Book>update(@PathVariable long id,@RequestBody Book bk){
	Optional<Book>opt=repo.findById(id);
	Book book=null;
	if(opt.isPresent()) {
		book=opt.get();
		book.setId(bk.getId());
		book.setName(bk.getName());
		book.setPrice(bk.getPrice());
		return ResponseEntity.status(HttpStatus.CREATED).body(repo.save(book));
		
	}else {
		return ResponseEntity.notFound().build();
	}
}
//delete
@DeleteMapping("/delete/{id}")
public ResponseEntity<?>delete(@PathVariable long id ){
	Optional<Book>opt=repo.findById(id);
	if(opt.isPresent())
	{
	    repo.deleteById(id);
		return ResponseEntity.ok().body(null);
	}
	else
		return ResponseEntity.notFound().build();
		
			
			
	
}
}


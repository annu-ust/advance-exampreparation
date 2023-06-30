package com.example.project5Consumer.Contoller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.project5Consumer.Model.StudentBook;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	RestTemplate restTemplate;
//fetching all book details from the Book Producer	
	@GetMapping("/fetchDetails")
	public List<StudentBook> getAllBook(){
		String url="http://localhost:8090/book/fetchall";
		ResponseEntity<List> response=restTemplate.getForEntity(url, List.class);
		List<StudentBook> bookJson=response.getBody();
		return bookJson;
		
	}
    @GetMapping("/fetchAllBook")
    public List<StudentBook>fetchAllBook(){
    	String url="http://localhost:8090/book/fetchall";
    	List<StudentBook>response=restTemplate.getForObject(url, List.class);
    	return response;
    }
    @GetMapping("/get")
    public ResponseEntity<List<StudentBook>> get()
    {
    	String url="http://localhost:8090/book/fetchall";
    	List<StudentBook>response=restTemplate.getForObject(url, List.class);
    	return ResponseEntity.ok(response);
    	
    }
    
//fetching book by id
   @GetMapping("/get/{bookid}")
   public StudentBook getbookbyid(@PathVariable long bookid) {
	   String url="http://localhost:8090/book/fetch/{bookid}";
	   ResponseEntity<StudentBook> response=restTemplate.getForEntity(url,StudentBook.class, bookid);
	   StudentBook bookJson=response.getBody();
	   return bookJson;
   }
  @GetMapping("/retrieve/{bkid}")
  public StudentBook getBookID(@PathVariable long bkid) {
	  String url="http://localhost:8090/book/fetch/{bkid}";
	  return restTemplate.getForObject(url,StudentBook.class, bkid);
	 
  }
  @GetMapping("/getbyid/{id}")
  public ResponseEntity<StudentBook> getbyid(@PathVariable long id){
	  String url="http://localhost:8090/book/fetch/{id}";
	  StudentBook response= restTemplate.getForObject(url, StudentBook.class,id);
	  return ResponseEntity.ok(response);
  }
  
  //create book
  @PostMapping("/addBook")
  public StudentBook addBook(@RequestBody StudentBook stbk ) {
	  String url="http://localhost:8090/book/create";
	  ResponseEntity<StudentBook> response=restTemplate.postForEntity(url, stbk, StudentBook.class);
	  return response.getBody();
  }
  
  @PostMapping("/add")
  public StudentBook addBooks(@RequestBody StudentBook stbk) {
	  String url="http://localhost:8090/book/create";
	  return restTemplate.postForObject(url, stbk, StudentBook.class);
  }
  @PostMapping("/createBook")
  public ResponseEntity<StudentBook>createBook(@RequestBody StudentBook book){
	  String url="http://localhost:8090/book/create";
	  StudentBook response=restTemplate.postForObject(url,book,StudentBook.class);
	  return ResponseEntity.ok(response);
  }
  //update book details
  @PutMapping("/update/{id}")
  public StudentBook updateBoook(@PathVariable long id,@RequestBody StudentBook stbk) {
	  String url="http://localhost:8090/book/update/{id}";
	  restTemplate.put(url,stbk,id, StudentBook.class);
	  return stbk;
  }
  
  //delete the book
  @DeleteMapping("/delete/{id}")
  public ResponseEntity<String> deleteBook(@PathVariable long id){
	  String url="http://localhost:8090/book/delete/{id}";
	  restTemplate.delete(url, id,StudentBook.class);
	  return ResponseEntity.ok("Book deleted");
	  
  }
}

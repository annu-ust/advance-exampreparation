package com.example.project1ProducerService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project1ProducerService.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

}

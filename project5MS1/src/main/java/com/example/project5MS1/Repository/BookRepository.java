package com.example.project5MS1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project5MS1.Model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

}

package com.booksimplementation.demo.repository;

import com.booksimplementation.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}





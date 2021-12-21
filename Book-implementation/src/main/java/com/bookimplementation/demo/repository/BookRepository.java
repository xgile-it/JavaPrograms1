package com.bookimplementation.demo.repository;

import com.bookimplementation.demo.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer>{
    public Book findById(int id);
}

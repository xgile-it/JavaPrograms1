package com.bookimplementation.demo.service;

import com.bookimplementation.demo.entity.Book;
import com.bookimplementation.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    //get all books
    public List<Book>getAllBooks()
    {
        return (List<Book>) this.bookRepository.findAll();
    }

    //get single book by id
    public Book getBookById(int id){
        Book book = null;
        try{
          book=  this.bookRepository.findById(id);
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
        return book;
    }

    //adding the book
    public Book addBook(Book b)
    {
        return bookRepository.save(b);
    }

    //delete book
    public void deleteBook(int bid)
    {
        bookRepository.deleteById(bid);
    }

    //update book
    public void updateBook(Book book,int bookId)
    {
        book.setId(bookId);
        bookRepository.save(book);
    }
}





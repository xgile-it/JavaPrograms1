package com.bookimplementation.demo.entity;

import javax.persistence.*;

//@Entity annotation indicates that the class is a persistent Java class.
//@Table annotation provides the table that maps this entity.
//@Id annotation is for the primary key.
//@Column annotation is used to define the column in database that maps annotated field.

@Entity
@Table(name="bookssequence")
public class Book {

    @Id
    @Column(name="book_id")
    private int id;

    @Column(name="book_title")
    private String title;

    @Column(name="book_author")
    private String author;

    public Book(int id,String title,String author)
    {
        this.id=id;
        this.title=title;
        this.author=author;
    }
    public Book()
    {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book[id=" + id+ ", title=" + title+ ",author=" + author + "]";
    }
    public static boolean isPresent() {
        return false;
    }
}


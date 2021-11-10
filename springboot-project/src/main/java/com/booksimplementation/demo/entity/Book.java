package com.booksimplementation.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity annotation indicates that the class is a persistent Java class.
//@Table annotation provides the table that maps this entity.
//@Id annotation is for the primary key.
//@Column annotation is used to define the column in database that maps annotated field.

    @Entity
    @Table(name="subject")
    public class Book {

        @Id
        @Column(name="sid")
        private int id;

        @Column(name="stitle")
        private String title;

        @Column(name="sauthor")
        private String author;

        public Book(int id,String title,String author)
        {
            this.id=id;
            this.title=title;
            this.author=author;
        }
        public Book()
        {}

        //Using getter and setter
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
            return "Book{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
        public static boolean isPresent() {
            return false;
        }
    }


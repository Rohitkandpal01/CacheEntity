package com.example.QuadTable.Model;

import org.springframework.data.relational.core.sql.In;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;
    private String Book_name;
    private  String auther_of_book;

    public Book() {
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return Book_name;
    }

    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public String getAuther_of_book() {
        return auther_of_book;
    }

    public void setAuther_of_book(String auther_of_book) {
        this.auther_of_book = auther_of_book;
    }
}

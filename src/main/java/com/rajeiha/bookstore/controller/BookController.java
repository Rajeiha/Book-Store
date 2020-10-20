package com.rajeiha.bookstore.controller;

import com.rajeiha.bookstore.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @RequestMapping(value = "/books")
    public List<Book> getBooks(){

        List<Book> bookList;
        bookList = Arrays.asList(
                new Book(1,"Book01", "Author01"),
                new Book(2, "Book02", "Author02"),
                new Book(3,"Book03", "Author03")
        );
        return bookList;
    }

}

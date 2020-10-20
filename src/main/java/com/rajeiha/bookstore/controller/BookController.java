package com.rajeiha.bookstore.controller;

import com.rajeiha.bookstore.entity.Book;
import com.rajeiha.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

}

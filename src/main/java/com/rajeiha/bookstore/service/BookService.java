package com.rajeiha.bookstore.service;


import com.rajeiha.bookstore.entity.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    static List<Book> bookList = Arrays.asList(
            new Book(1,"Book01", "Author01"),
            new Book(2, "Book02", "Author02"),
            new Book(3,"Book03", "Author03")
    );

    public List<Book> getBooks(){
        return bookList;
    }
}

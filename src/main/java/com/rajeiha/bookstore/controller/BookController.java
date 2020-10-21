package com.rajeiha.bookstore.controller;

import com.rajeiha.bookstore.entity.Book;
import com.rajeiha.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/get/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @RequestMapping(value = "/post/book",method = RequestMethod.POST)
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    @RequestMapping(value = "/put/book/{bookId}",method = RequestMethod.PUT)
    public Book updateBook(@RequestBody Book putBook, @PathVariable Integer bookId){
        bookService.updateBook(bookId, putBook);
        return putBook;
    }

    @RequestMapping(value = "/delete/book/{bookId}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable Integer bookId){
        return bookService.deleteById(bookId);
    }


}

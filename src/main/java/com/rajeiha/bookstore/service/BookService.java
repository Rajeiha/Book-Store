package com.rajeiha.bookstore.service;


import com.rajeiha.bookstore.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    static List<Book> bookList = new ArrayList<>( Arrays.asList(
            new Book(1,"Book01", "Author01"),
            new Book(2, "Book02", "Author02"),
            new Book(3,"Book03", "Author03")
    ));

    public List<Book> getBooks(){
        return bookList;
    }

    public Book createBook(Book book) {
         bookList.add(book);
         return book;
    }

    public Book updateBook(Integer bookId, Book putBook) {
        for(int i=0; i<bookList.size();i++) {
            Book b = bookList.get(i);
            if (b.getId().equals(bookId)) {
                bookList.set(i, putBook);
            }
        }
        return putBook;
    }

    public String deleteById(Integer bookId) {
        bookList.removeIf(b ->b.getId().equals(bookId));
        return ("Deleted Successfully");
    }
}

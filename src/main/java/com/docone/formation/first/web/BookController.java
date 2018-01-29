package com.docone.formation.first.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docone.formation.first.model.Book;
import com.docone.formation.first.service.BookService;

@RestController
public class BookController {
    
    @Autowired BookService bookService;
    
    @GetMapping("/books")
    public Iterable<Book> getBooks() {
        return bookService.getBooks();
    }
    
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
        
    }
    
    @PostMapping("/books")
    public Book postBook(@RequestBody Book book) {
        return bookService.add(book);        
    }

}

package com.docone.formation.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    
    @Autowired BookService bookService;
    
    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
    
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
        
    }

}

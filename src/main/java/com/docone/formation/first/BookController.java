package com.docone.formation.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    
    @PostMapping("/books")
    public void postBook(@RequestBody Book book) {
        bookService.insertOrUpdate(book);        
    }

}

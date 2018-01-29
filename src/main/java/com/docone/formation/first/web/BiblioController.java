package com.docone.formation.first.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docone.formation.first.model.Author;
import com.docone.formation.first.model.Book;
import com.docone.formation.first.service.BiblioService;

@RestController
public class BiblioController {
    
    @Autowired BiblioService biblioService;
    
    @GetMapping("/authors")
    public Iterable<Author> getAuthors() {
        return biblioService.getAuthors();
    }
    
    
    @GetMapping("/books")
    public Iterable<Book> getBooks() {
        return biblioService.getBooks();
    }
    
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return biblioService.getBook(id);
        
    }
    
    @PostMapping("/books")
    public Book postBook(@RequestBody Book book) {
        return biblioService.add(book);        
    }

}

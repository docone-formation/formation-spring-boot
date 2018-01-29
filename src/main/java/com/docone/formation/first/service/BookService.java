package com.docone.formation.first.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docone.formation.first.model.Book;
import com.docone.formation.first.repository.BookRepository;

@Service
public class BookService {
    
    @Autowired BookRepository bookRepo;
    
    public Book getBook(long id) {
        return bookRepo.findOne(id);
    }

    public Iterable<Book> getBooks() {
        return bookRepo.findAll();
    }
    
    public Book add(Book book) {
        return bookRepo.save(book);
    }
    
    @PostConstruct
    public void insertData( ) {
        addBook("The Jungle Book", "Rudyard Kipling");
        addBook("2010 : Odyssey Two", "Arthur C. Clarke");
        addBook("Les Misérables", "Victor Hudo");
    }
    
    private void addBook(String title, String author) {
        bookRepo.save(new Book(title, author));
    }
}



package com.docone.formation.first.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docone.formation.first.model.Author;
import com.docone.formation.first.model.Book;
import com.docone.formation.first.repository.AuthorRepository;
import com.docone.formation.first.repository.BookRepository;

@Service
public class BiblioService {
    
    @Autowired BookRepository bookRepo;
    @Autowired AuthorRepository authorRepo;
    
    public Iterable<Author> getAuthors() {
        return authorRepo.findAll();
    }

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
        Author author;
        
        author = addAuthor("Rudyard", "Kipling");
        addBook("The Jungle Book", author);
        
        author = addAuthor("Arthur", " C. Clarke");
        addBook("2010 : Odyssey Two", author);
        addBook("2011 : Odyssey Three", author);
        
        author = addAuthor("Victor", "Hudo");
        addBook("Les Misérables", author);
        addBook("Le Dernier Jour d'un condamné", author);
    }
    
    private Author addAuthor(String firstName, String lastName) {
        return authorRepo.save(new Author(firstName, lastName));
    }

    private void addBook(String title, Author author) {
        Book book = new Book(title, author);
        book.addChapter("Intro");
        book.addChapter("Chaptitre 1");
        book = bookRepo.save(book);
    }
}



package com.docone.formation.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    private long maxId = 0;
    private Map<Long, Book> books = new HashMap<>();
    
    public BookService() {
        addBook("The Jungle Book", "Rudyard Kipling");
        addBook("2010 : Odyssey Two", "Arthur C. Clarke");
        addBook("Les Misérables", "Victor Hudo");
    }
    
    public Book getBook(long id) {
        return books.get(id);
        
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books.values());
    }
    
    private void addBook(String title, String author) {
        long id = maxId++;
        books.put(id, new Book(id, title, author));
    }

}



package com.docone.formation.first.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Book {

    @Id
    @GeneratedValue(generator="BOOK_SEQ")
    @SequenceGenerator(name="BOOK_SEQ", sequenceName="BOOK_SEQ", allocationSize = 1)
    private Long id;
    private String titre;
    @ManyToOne private Author author;
    
    @SuppressWarnings("unused")
    private Book() {
        // Empty constructor for serializer
    }
    
    public Book(String titre, Author author) {
        this.titre = titre;
        this.author = author;
    }
    
    
    /* ... Getter and Setter ... */
    

    public Long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}

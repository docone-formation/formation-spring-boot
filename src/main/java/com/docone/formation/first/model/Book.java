package com.docone.formation.first.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Book {

    @Id
    @GeneratedValue(generator="BOOK_SEQ")
    @SequenceGenerator(name="BOOK_SEQ", sequenceName="BOOK_SEQ", allocationSize = 1)
    private Long id;
    
    private String titre;
    
    @ManyToOne
    private Author author;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="BOOK_ID", nullable = false)
    private List<Chapter> chapters = new ArrayList<>();
    

    @SuppressWarnings("unused")
    private Book() {
        // Empty constructor for serializer
    }
    
    public Book(String titre, Author author) {
        this.titre = titre;
        this.author = author;
    }
    

    public void addChapter(String titre) {
        chapters.add(new Chapter(titre));
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
    
    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

}

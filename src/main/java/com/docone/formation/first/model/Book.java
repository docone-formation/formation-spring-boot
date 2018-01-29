package com.docone.formation.first.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Book {

    @Id
    @GeneratedValue(generator="BOOK_SEQ")
    @SequenceGenerator(name="BOOK_SEQ", sequenceName="BOOK_SEQ", allocationSize = 1)
    private Long id;
    private String titre;
    private String auteur;
    
    @SuppressWarnings("unused")
    private Book() {
        // Empty constructor for serializer
    }
    
    public Book(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
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

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

}

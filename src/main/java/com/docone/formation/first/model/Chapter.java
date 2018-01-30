package com.docone.formation.first.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Chapter {
    
    @Id
    @GeneratedValue(generator="CHAPTER_SEQ")
    @SequenceGenerator(name="CHAPTER_SEQ", sequenceName="CHAPTER_SEQ", allocationSize = 1)
    private Long id;
    private String titre;
    
    @SuppressWarnings("unused")
    private Chapter() {
        // Empty constructor for serializer
    }
    
    public Chapter(String titre) {
        this.setTitre(titre);
    }
    
    /* ... Getter and Setter ... */

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    

}

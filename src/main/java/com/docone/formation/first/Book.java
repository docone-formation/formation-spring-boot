package com.docone.formation.first;

public class Book {

    private Long id;
    private String titre;
    private String auteur;
    
    @SuppressWarnings("unused")
    private Book() {
        // Empty constructor for serializer
    }
    
    public Book(long id, String titre, String auteur) {
        this.id = id;
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

package com.docone.formation.first;

public class Book {

    private final long id;
    private String titre;
    private String auteur;
    
    public Book(long id, String titre, String auteur) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
    }
    
    /* ... Getter and Setter ... */
    
    public long getId() {
        return id;
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

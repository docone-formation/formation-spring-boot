package com.docone.formation.first.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Author {
    
    @Id
    @GeneratedValue(generator="AUTHOR_SEQ")
    @SequenceGenerator(name="AUTHOR_SEQ", sequenceName="AUTHOR_SEQ", allocationSize = 1)
    private Long id;
    private String firstName;
    private String lastName;
    
    @SuppressWarnings("unused")
    private Author() {
        // Empty constructor for serializer
    }
    
    public Author(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
    
    
    /* ... Getter and Setter ... */
    

    public Long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

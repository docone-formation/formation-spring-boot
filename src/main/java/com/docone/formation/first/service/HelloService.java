package com.docone.formation.first.service;

import org.springframework.stereotype.Service;


@Service
public class HelloService {
    
    public String sayHello(String firstName, String lastName) {
        return "Hello " + firstName + " " 
            + lastName + " from service";
    }

}

package com.docone.formation.first;

import org.springframework.stereotype.Service;


@Service
public class HelloService {
    
    public String sayHello() {
        return "hello from service";
    }

}

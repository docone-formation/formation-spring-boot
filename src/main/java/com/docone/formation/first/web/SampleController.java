package com.docone.formation.first.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docone.formation.first.service.HelloService;

@RestController
public class SampleController {
    
    @Autowired HelloService helloService;
    
    @GetMapping("/hello")
    public String hello(String firstName, String lastName) {
        return helloService.sayHello(firstName, lastName);
    }
    

}
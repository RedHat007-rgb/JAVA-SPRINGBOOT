package com.example.javaspringboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello() {
        return "Hello Java folks";
    }

    @RequestMapping(value = "/hello/{id}",method = RequestMethod.GET)
    public String say(@PathVariable String id) {
        return "Hello "+ id +" " + "Welcome to Java Spring Boot";
    }

}
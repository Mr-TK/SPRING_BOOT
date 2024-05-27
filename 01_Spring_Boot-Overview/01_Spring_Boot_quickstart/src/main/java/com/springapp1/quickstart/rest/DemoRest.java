package com.springapp1.quickstart.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {
    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String greethello(){
        return "Hello World";
    }
}

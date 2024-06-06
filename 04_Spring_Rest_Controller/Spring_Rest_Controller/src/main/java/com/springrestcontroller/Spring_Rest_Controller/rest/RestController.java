package com.springrestcontroller.Spring_Rest_Controller.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/test")
public class RestController {
    @GetMapping("/helo")
    public String sayHello(){
        return "Hello";
    }
}

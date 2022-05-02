package com.example.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public String hello() {
        return "하이";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloBean() {
        return new HelloWorldBean("hello_world");
    }
}

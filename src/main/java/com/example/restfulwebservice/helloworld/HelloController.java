package com.example.restfulwebservice.helloworld;

import lombok.RequiredArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RequiredArgsConstructor
@RestController
public class HelloController {

    private final MessageSource messageSource;

    @GetMapping("/hello-world")
    public String hello() {
        return "하이";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloBean() {
        return new HelloWorldBean("hello_world");
    }

    @GetMapping("/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("greeting.message", null, locale);
    }
}

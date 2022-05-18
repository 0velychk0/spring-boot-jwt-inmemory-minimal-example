package com.ovelychko.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@CrossOrigin()
public class HelloWorldController {

    @RequestMapping({"/hello"})
    public String hello(Principal principal) {
        return "Hello World";
    }

}

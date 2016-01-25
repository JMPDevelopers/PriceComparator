package com.jmpdev.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacek on 10.01.16.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String index() {
        return "Greetings from Spring Boot!";
    }

}


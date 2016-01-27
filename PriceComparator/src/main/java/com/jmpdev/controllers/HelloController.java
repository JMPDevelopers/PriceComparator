package com.jmpdev.controllers;

import com.jmpdev.domain.User;
import com.jmpdev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacek on 10.01.16.
 */
@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String index() {
        User user = new User("Jaro", "Kardo", "jaro@gmail.com");
        userRepository.save(user);
        return "Greetings from Spring Boot!";
    }

}


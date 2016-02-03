package com.jmpdev.service;

import com.jmpdev.domain.User;
import com.jmpdev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by HP on 2016-01-29.
 */
@Component
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public void register(User user){
        User userToSave = new User(user.getUsername(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword());
        userRepository.save(userToSave);
        //send email and do not enable user on registration but on link from email
    }
}

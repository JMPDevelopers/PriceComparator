package com.jmpdev.service;

import com.jmpdev.domain.User;
import com.jmpdev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Created by HP on 2016-01-31.
 */
@Component
public class AuthenticationService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user.equals(null)) {
            throw new UsernameNotFoundException("No user, dude!");
        } else {

                    return null;
        }
    }
}

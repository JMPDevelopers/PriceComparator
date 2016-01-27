package com.jmpdev;

import com.jmpdev.domain.User;
import com.jmpdev.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by jacek on 10.01.16.
 */
@SpringBootApplication
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner demo(UserRepository repository) {
        return (args) -> {

            repository.save(new User("Jack", "Bauer", "jaro@gmail.com"));
            repository.save(new User("Jack", "Karo", "jaro2@gmail.com"));

        };
    }

}
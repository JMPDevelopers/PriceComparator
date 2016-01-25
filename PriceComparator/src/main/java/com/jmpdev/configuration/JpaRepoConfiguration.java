package com.jmpdev.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by HP on 2016-01-25.
 */
@Configuration
@EnableJpaRepositories(basePackages = {"org.jmpdev.repository"})
public class JpaRepoConfiguration {
}
package com.jmpdev.configuration;

import com.jmpdev.controller.ControllerBase;
import com.jmpdev.service.AuthenticationService;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Created by HP on 2016-01-28.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    protected void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .exceptionHandling().and()
                .anonymous().and()  //for all roles, default but good practise deny-by-default
                .authorizeRequests()
                .antMatchers(ControllerBase.MAPPING_AUTH_ALL).permitAll()
                .anyRequest().authenticated().and()
                .authorizeRequests().antMatchers("/console/**").permitAll().and()
                .formLogin()
                .loginPage(ControllerBase.MAPPING_LOGIN).permitAll()
                .and()
                .logout().permitAll();


    }
}

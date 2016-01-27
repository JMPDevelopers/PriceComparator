package com.jmpdev.domain;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

/**
 * Created by HP on 2016-01-25.
 */
@Entity()
@Table(name = "USER_DATA")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID", unique = true, nullable = false)
    private long id;

    @Column(nullable = false, name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    @Email
    private String email;

    public User() {
    }

    public User(String firstName, String lastName, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + " first name: " + this.firstName + " surname: " + this.lastName + " email: " + this.email + ".";
    }
}

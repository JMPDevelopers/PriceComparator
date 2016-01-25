package com.jmpdev.domain;

import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

/**
 * Created by HP on 2016-01-25.
 */
@Entity()
@Table(name = "userData")
public class User {

    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    @Email
    private String email;

    private User() {
    }

    private User(String firstName, String LastName, String email) {
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

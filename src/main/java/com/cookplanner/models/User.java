package com.cookplanner.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * @author Created by Yassine on 2/17/17.
 */

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotBlank(message = "Enter a first name")
    private String first_name;

    @Column(nullable = false)
    @NotBlank(message = "Enter a last name")
    private String last_name;

    @Column(nullable = false)
    @NotBlank(message = "Enter a username")
    private String username;

    @Column(nullable = false)
    @NotBlank(message = "Enter an email")
    @Email(message = "Enter a valid email")
    private String email;

    @Column
    private String phone_number;

    @Column(nullable = false)
    @NotBlank(message = "Your password cannot be empty ")
    @Size(min = 8, message = "Your password must be at least 8 characters")
    @JsonIgnore
    private String password;

    public User() {
    }

    public User(User user) {
        id= user.id;
        username= user.username;
        first_name= user.first_name;
        last_name= user.last_name;
        email= user.email;
        phone_number= user.phone_number;
        password= user.password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

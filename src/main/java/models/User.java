package models;

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

}

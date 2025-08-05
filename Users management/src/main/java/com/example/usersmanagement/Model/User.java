package com.example.usersmanagement.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;


    @NotEmpty(message = "Name cannot be empty")
    @Size(min = 5, message = "Name size must be greater than 4")
    @Column(nullable = false)
    private String name;

    @NotEmpty(message = "UserName cannot be empty")
    @Size(min = 5, message = "Username size must be greater than 4")
    @Column(nullable = false, unique = true)
    private String username;

    @NotEmpty(message = "Password cannot be empty")
    @Column(nullable = false)
    private String password;


    @NotEmpty(message = "Email cannot be empty")
    @Column(nullable = false, unique = true)
    @Email(message = "Email must be valid")
    private String email;


    @NotEmpty(message = "role cannot be empty")
    @Pattern(regexp = "^(user|admin)$", message = "Role must be either 'user' or 'admin'")
    @Column(nullable = false)
    private String role;

    @NotNull(message = "Age cannot be null")
    @Column(nullable = false)
    @Min(value = 0, message = "Age must be a non-negative integer")
    private Integer age;
}


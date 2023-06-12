package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;
    private String email;
    private int age;

    // Getters and setters

    // Constructors

    // Other methods
}


package com.example.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "Medications")
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicationId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String name;
    private String dosage;
    private String frequency;
    private LocalDate startDate;
    private LocalDate endDate;

    // Getters and setters

    // Constructors

    // Other methods
}


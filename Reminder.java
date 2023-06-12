package com.example.demo.entities;

import java.time.LocalTime;

import jakarta.persistence.*;

@Entity
@Table(name = "Reminders")
public class Reminder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reminderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "medication_id")
    private Medication medication;

    private LocalTime reminderTime;
    private boolean completed;

    // Getters and setters

    // Constructors

    // Other methods
}


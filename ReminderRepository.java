package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Reminder;


public interface ReminderRepository extends JpaRepository<Reminder, Long> {
    // Add any custom methods if needed
}


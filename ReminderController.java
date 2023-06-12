package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reminders")
public class ReminderController {

    @Autowired
    private ReminderRepository reminderRepository;

    @GetMapping("/")
    public List<Reminder> getAllReminders() {
        return reminderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Reminder getReminderById(@PathVariable Long id) {
        return reminderRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Reminder not found with id: " + id));
    }

    // Add other CRUD operations for Reminder entity
}

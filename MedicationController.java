package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {

    @Autowired
    private MedicationRepository medicationRepository;

    @GetMapping("/")
    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    @GetMapping("/{id}")
    public Medication getMedicationById(@PathVariable Long id) {
        return medicationRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Medication not found with id: " + id));
    }

    // Add other CRUD operations for Medication entity
}


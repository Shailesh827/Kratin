package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Medication;


public interface MedicationRepository extends JpaRepository<Medication, Long> {
    // Add any custom methods if needed
}


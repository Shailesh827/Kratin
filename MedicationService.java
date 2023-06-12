package com.example.demo.services;

@Service
public class MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    public Medication getMedicationById(Long id) {
        return medicationRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Medication not found with id: " + id));
    }

    public Medication createMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    public Medication updateMedication(Long id, Medication medicationDetails) {
        Medication medication = getMedicationById(id);
        medication.setName(medicationDetails.getName());
        medication.setDescription(medicationDetails.getDescription());
        // Update other fields as needed
        return medicationRepository.save(medication);
    }

    public void deleteMedication(Long id) {
        Medication medication = getMedicationById(id);
        medicationRepository.delete(medication);
    }
}


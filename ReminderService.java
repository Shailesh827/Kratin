package com.example.demo.services;

@Service
public class ReminderService {

    @Autowired
    private ReminderRepository reminderRepository;

    public List<Reminder> getAllReminders() {
        return reminderRepository.findAll();
    }

    public Reminder getReminderById(Long id) {
        return reminderRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Reminder not found with id: " + id));
    }

    public Reminder createReminder(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public Reminder updateReminder(Long id, Reminder reminderDetails) {
        Reminder reminder = getReminderById(id);
        reminder.setUserId(reminderDetails.getUserId());
        reminder.setMedicationId(reminderDetails.getMedicationId());
        reminder.setReminderTime(reminderDetails.getReminderTime());
        reminder.setCompleted(reminderDetails.isCompleted());
        return reminderRepository.save(reminder);
    }

    public void deleteReminder(Long id) {
        Reminder reminder = getReminderById(id);
        reminderRepository.delete(reminder);
    }
}


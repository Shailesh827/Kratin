import React, { useEffect, useState } from 'react';
import axios from 'axios';

const ReminderForm = () => {
  const [reminders, setReminders] = useState([]);
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  

  

  const fetchReminders = async () => {
    try {
      const response = await axios.get('http://localhost:8080/api/reminders');
      setReminders(response.data);
    } catch (error) {
      console.error('Error fetching reminders:', error);
    }
  };

  const createReminder = async () => {
    try {
      const reminderData = {
        // Provide the necessary reminder data (e.g., name, description)
      };

      await axios.post('http://localhost:8080/api/create-reminder', reminderData);

      console.log('Reminder created successfully');

      fetchReminders();
    } catch (error) {
      console.error('Error creating reminder:', error);
    }
  };

  const handleLogout = async () => {
    try {
      await axios.post('http://localhost:8080/api/logout');
      setIsLoggedIn(false);
      setReminders([]);
    } catch (error) {
      console.error('Error logging out:', error);
    }
  };

  return (
    <div>
      {isLoggedIn ? (
        <>
          <h1>Reminders</h1>
          <button onClick={createReminder}>Create Reminder</button>
          <button onClick={handleLogout}>Logout</button>

          <h2>Reminder List</h2>
          <ul>
            {reminders.map((reminder) => (
              <li key={reminder.id}>{reminder.name}</li>
            ))}
          </ul>
        </>
      ) : (
        <h1>Please log in to view reminders</h1>
      )}
    </div>
  );
};

export default ReminderForm;

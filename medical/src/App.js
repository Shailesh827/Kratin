import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import Login from './Login';
import MedicineList from './MedicineList';
import ReminderForm from './ReminderForm';
import UserProfile from './UserProfile';
import RegistrationForm from './RegistrationForm';

const App = () => {
  return (
    
      <div className="container">
        <h1>Medication Reminder System</h1>
        <nav className="navbar navbar-expand-lg navbar-light bg-light mb-3">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item">
              <Link to="/register" className="nav-link">Register</Link>
            </li>
            <li className="nav-item">
              <Link to="/login" className="nav-link">Login</Link>
            </li>
            <li className="nav-item">
              <Link to="/medicines" className="nav-link">Medicine List</Link>
            </li>
            <li className="nav-item">
              <Link to="/reminders/create" className="nav-link">Create Reminder</Link>
            </li>
          </ul>
        </nav>

        <Routes>
          <Route path="/register" element={<RegistrationForm/>} />
          <Route path="/login" element={<Login />} />
          <Route path="/medicines" element={<MedicineList />} />
          <Route path="/reminders/create" element={<ReminderForm />} />
          <Route path="/userProfile" element={<UserProfile />} />
        </Routes>
      </div>
  );
};

export default App;

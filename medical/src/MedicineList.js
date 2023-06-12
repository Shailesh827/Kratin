import React, { useEffect, useState } from 'react';
import axios from 'axios';

const MedicineList = () => {
  const [medications, setMedications] = useState([]);

  useEffect(() => {
    fetchMedications();
  }, []);

  const fetchMedications = async () => {
    try {
      const response = await axios.get('http://localhost:8080/medications');
      setMedications(response.data);
    } catch (error) {
      console.error('Error fetching medications:', error);
    }
  };

  return (
    <div>
      <h1>Medicine List</h1>

      <table>
        <thead>
          <tr>
            <th>Medicine ID</th>
            <th>User ID</th>
            <th>Name</th>
            <th>Dosage</th>
            <th>Frequency</th>
            <th>Start Date</th>
            <th>End Date</th>
          </tr>
        </thead>
        <tbody>
          {medications.map(medicine => (
            <tr key={medicine.medication_id}>
              <td>{medicine.medication_id}</td>
              <td>{medicine.user_id}</td>
              <td>{medicine.name}</td>
              <td>{medicine.dosage}</td>
              <td>{medicine.frequency}</td>
              <td>{medicine.start_date}</td>
              <td>{medicine.end_date}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default MedicineList;

import React, { useState, useEffect } from 'react';
import axios from 'axios';
import '../CSS/StudentProfilePage.css'

const ShowStudentProfile = () => {
  const [profiles, setProfiles] = useState([]);

  useEffect(() => {
    const fetchProfiles = async () => {
      try {
        const response = await axios.get('http://localhost:8080/student/');
        setProfiles(response.data);
      } catch (error) {
        console.error('Error fetching Student profiles:', error);
      }
    };

    fetchProfiles();
  }, []);

  return (
    <div>
      <br></br>
    <div className="student-list-page">
      
      <h1>Student List</h1>
      <ul className="student-list">
        {profiles.map(e => (
          <li key={e.studId} className="student-item">
            <h2>{e.studFirstName}</h2>
            <p><strong>Student ID:</strong> {e.studId}</p>
            <p><strong>City:</strong> {e.studCity}</p>
            <p><strong>Entrance Exam:</strong> {e.studEntranceExam}</p>
            <p><strong>Exam Score:</strong> {e.studExamScore}</p>
            <p><strong>Student First Name:</strong> {e.studFirstName}</p>
            <p><strong>Student Last Name:</strong> {e.studLastName}</p>
            <p><strong>Student Qualification:</strong> {e.studQualification}</p>
            <p><strong>State:</strong> {e.studState}</p>

            <hr />
          </li>
        ))}
      </ul>
    </div>
    </div>
  );
};

export default ShowStudentProfile;
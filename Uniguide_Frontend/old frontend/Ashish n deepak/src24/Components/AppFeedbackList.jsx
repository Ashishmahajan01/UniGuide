import React, { useState, useEffect } from 'react';
import axios from "axios";
import {URL} from "../config"

const AppFeedbackList = () => {
  const [feedbackData, setFeedbackData] = useState([]);
    
      const fetchFeedback = async () => { 
        try {
        const response = await axios.get(`${URL}/appfeedback/`);
            //console.log(response.data);
          let arr = response.data;
            setFeedbackData(arr);
            console.log(feedbackData);
            //console.log(arr[0].evtDescription)

      } catch (error) {
        console.error('Error fetching data:', error);
      }
        
    }
  useEffect(() => {
      fetchFeedback();
  }, []);

 

 

  return (
    <div>
      <h1 style={{ fontSize: '24px', marginBottom: '20px' }}>Feedback App</h1>
      <table style={{ width: '100%', borderCollapse: 'collapse' }}>
        <thead>
          <tr>
            <th>Date</th>
            <th>Description</th>
            <th>Rating</th>
          </tr>
        </thead>
        <tbody>
          {feedbackData.map((feedback) => (
            <tr key={feedback.id}>
              <td style={styles.tableCell}>{feedback.date}</td>
              <td style={styles.tableCell}>{feedback.description}</td>
              <td style={styles.tableCell}>{feedback.rating}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

const styles = {
  tableCell: {
    padding: '10px',
    border: '1px solid #ccc',
  },
};

export default AppFeedbackList; 
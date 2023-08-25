import React, { useState, useEffect } from 'react';
import { URL } from "../config";
import axios from "axios";

import '../CSS/Branch.css'; 

const RecruitersList = () => {
  
  const [RecruitersData, setrecruitersData] = useState([]);

    useEffect(() => {
     
    const fetchData = async () => {
      try {
        const response = await axios.get(`${URL}/recruitment/`);
        
        setrecruitersData(response.data);
        console.log("RecruitersData=========",RecruitersData)

      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };

    

    fetchData();
  }, []);
  


  return (
    <div className="branch-page">
      <br></br>
      <table className="branch-table">
        <thead>
          <tr>
            <th>Recruiters Name</th>
            <th>Job PRofile</th>
            <th>Job Description</th>
            <th>Registration Date</th>
            <th>Registration Last Date</th>
            <th>Apply</th>

          </tr>
        </thead>
        <tbody>
          {RecruitersData.map((recu) => (
            <tr key={recu.recuId}>
              <td>{recu.recuName}</td>
              <td>{recu.recuJobProfile}</td>
              <td>{recu.recuJobDesc}</td>
              <td>{recu.recuRegDate}</td>
              <td>{recu.recuEndDate}</td>
              {/* <td><a href={recu.recuLink}></a></td> */}
              <td>
                <a href={recu.recuLink} target="_blank" rel="noopener noreferrer">
                {recu.recuLink}
                </a>
              </td>
              
            </tr>
          ))}
          
        </tbody>
      </table>
      <br></br>
      <center><a href="/recruit"><button >Add Recruitment</button></a></center>
    </div>
  );
};

export default RecruitersList;

import React, { useState, useEffect } from 'react';
import { URL } from "../config";
import axios from "axios";

import '../CSS/Branch.css'; 

const Branch = () => {
  
  const [branchData, setBranchData] = useState([]);

    useEffect(() => {
     
    const fetchData = async () => {
      try {
        const response = await axios.get(`${URL}/branch/`);
        
        setBranchData(response.data);
        console.log("branch data=========",branchData)

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
            <th>Branch Name</th>
            <th>Branch Duration</th>
          </tr>
        </thead>
        <tbody>
          {branchData.map((branch) => (
            <tr key={branch.brchId}>
              <td>{branch.brchName}</td>
              <td>{branch.brchDuration}</td>
            </tr>
          ))}
          
        </tbody>
      </table>
    </div>
  );
};

export default Branch;

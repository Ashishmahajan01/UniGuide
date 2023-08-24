import React, { useState, useEffect } from 'react';
import axios from "axios";
import { URL } from "../config";


import '../CSS/Stream.css'; 

const Stream = () => {

  const [streamData, setStreamData] = useState([]);

  useEffect(() => {
    
    const fetchData = async () => {
      try {
        const response = await axios.get(`${URL}/stream/`);
        
        setStreamData(response.data);
        
      } catch (error) {
        console.error('Error fetching stream data:', error);
      }
    };

    fetchData();
  }, []);

  return (
    <div className="stream-page">
     <br></br>
      <table className="stream-table">
        <thead>
          <tr>
            <th>Stream Name</th>
            <th>Stream Scope</th>
          </tr>
        </thead>
        <tbody>
          {streamData.map((stream) => (
            <tr key={stream.strmId}>
              <td>{stream.strmName}</td>
              <td>{stream.strmScope}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default Stream;

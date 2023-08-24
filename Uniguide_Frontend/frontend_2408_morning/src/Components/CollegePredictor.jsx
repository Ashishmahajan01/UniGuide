import React, { useState } from 'react';

const CollegeList = () => {
  const [userPercentage, setUserPercentage] = useState('');
  const [nearbyColleges, setNearbyColleges] = useState([]);

  const colleges = [
    { name: 'College A', cutoffPercentage: 85 },
    { name: 'College B', cutoffPercentage: 80 },
    { name: 'College C', cutoffPercentage: 90 },
    { name: 'College D', cutoffPercentage: 78 },
    // Add more colleges here
  ];

  const handlePercentageChange = (event) => {
    const percentage = event.target.value;
    setUserPercentage(percentage);

    // Calculate nearby colleges based on a tolerance value (e.g., +/- 5%)
    const tolerance = 5;
    const minCutoff = percentage - tolerance;
    const maxCutoff = percentage + tolerance;

    const nearbyColleges = colleges.filter(
      (college) => college.cutoffPercentage >= minCutoff && college.cutoffPercentage <= maxCutoff
    );

    setNearbyColleges(nearbyColleges);
  };

  return (
    <div className="container mt-5 ">
        <center>
        <div className="col-md-6">
        <center>
      <h1>College Predictor</h1>
      </center>
      <div className="card-body box">
      <label className="college-predictor-label" htmlFor="percentage">Enter Your Percentage: </label>
      <input
        className="college-predictor-input"
        type="number"
        id="percentage"
        value={userPercentage}
        onChange={handlePercentageChange}
      />
      <h2>Nearby Colleges:</h2>
      {nearbyColleges.length > 0 ? (
        <ul>
          {nearbyColleges.map((college, index) => (
            <li key={index}>{`${college.name} - Cutoff Percentage: ${college.cutoffPercentage}`}</li>
          ))}
        </ul>
      ) : (
        <p>No nearby colleges found.</p>
      )}
      </div>
      </div>
      </center>
    </div>
  );
};

export default CollegeList;

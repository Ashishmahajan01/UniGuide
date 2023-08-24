import React, { useState, useEffect } from 'react'
import '../../CSS/Home/RectangularBoxes.css'

const Box = ({ title, count }) => {

  return (
    <div className="box">
      <h2>{title}</h2>
      <p>Count: {count}</p>
    </div>
  );
};

const RectangularBoxes = () => {


  const counts = [
    { title: 'Universities', count: 25 },
    { title: 'Colleges', count: 80 },
    { title: 'Streams', count: 50 },
    { title: 'Branches', count: 150 }
  ];


  return (
    <div className="rectangular-boxes">
      {counts.map((box, index) => (
        <Box key={index} title={box.title} count={box.count} />
      ))}
    </div>
  );
};

export default RectangularBoxes;

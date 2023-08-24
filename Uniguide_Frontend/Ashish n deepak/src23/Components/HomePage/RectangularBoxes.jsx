import React, { useState, useEffect } from 'react';
import '../../CSS/Home/RectangularBoxes.css';
import { URL } from "../../config";
import axios from "axios";

const Box = ({ title, count }) => {

  return (
    <div className="box"><center>
      <h2>{title}</h2>
      <p>Count: {count}</p>
      </center>
    </div>
  );
};

const RectangularBoxes = () => {
  const [unicount, setUnicount] = useState(0);
  const[collegecount,setCollegecount]=useState(0);
  const[streamcount,setStreamcount]=useState(0);
  const[branchcount,setBranchcount]=useState(0);
        const counts = [
    { title: 'Universities', count: unicount },
    { title: 'Colleges', count: collegecount },
    { title: 'Streams', count: streamcount },
    { title: 'Branches', count: branchcount }
  ];
  const getcount=async()=>{

        axios.get(`${URL}/university/getcount`).then((response) => {
          const { Collegecount, Unicount, Streamcount, Branchcount } = response.data;
         setUnicount(Unicount)
         setCollegecount(Collegecount)
         setStreamcount(Streamcount)
         setBranchcount(Branchcount)
        //   console.log(unicount)
        //  console.log(collegecount)
        //  console.log(streamcount)
        //  console.log(branchcount) 
        })
    }

    useEffect(() => {
        getcount();
      }, []);

 


  return (
    <div className="rectangular-boxes">
      {counts.map((box, index) => (
        <Box key={index} title={box.title} count={box.count} />
      ))}
    </div>
  );
};

export default RectangularBoxes;

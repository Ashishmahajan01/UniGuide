import React, { useState, useEffect } from 'react';
import axios from "axios";
import {URL} from "../config"

const CollegePredictor = () => {
  const [userPercentage, setUserPercentage] = useState(0);
    const [nearbyColleges, setNearbyColleges] = useState([]);
    const [exams, setExams] = useState([])
    const [seexam, setSeexam] = useState("");
    const [mintol, setMintol] = useState(0);
    const [maxtol, setMaxtol] = useState(0);
    const [sortedcolleges, setSortedcolleges] = useState([])
 

const getExams=async()=>{
    await axios.get(`${URL}/collegepredictor/exams`).then((response) => {
        console.log(response.data);
        let arr = response.data;
        setExams(response.data);
            
        // console.log(exams);

        //setevent(response.data);
        //console.log("Events", event);
        // event.map((eve)=>{console.log(eve.evtDescription)})
    }).catch();
  }
  useEffect(() => {
        getExams();
  }, []);
    
    
    const getColleges = async () => { 
        console.log(seexam);
        await axios.get(`${URL}/collegepredictor/exams/${seexam}`).then((response) => { 
            let arr = response.data;
            console.log(response.data)
            setSortedcolleges(arr);
            console.log((userPercentage - mintol),(parseInt(userPercentage) + parseInt(mintol)));
            // console.log(response.data); 
           //console.log(sortedcolleges[0].clgId.clgName,userPercentage)
            const nearbyColleges = sortedcolleges.filter(
                (college) => college.average>= (parseInt(userPercentage) - parseInt(mintol)) && college.average <= (parseInt(userPercentage) + parseInt(mintol))    
            );
            console.log(nearbyColleges)
            setNearbyColleges(nearbyColleges);

        });
    }

//   const handlePercentageChange = (event) => {
//     const percentage = event.target.value;
//     setUserPercentage(percentage);

//     // Calculate nearby colleges based on a tolerance value (e.g., +/- 5%)
//     const tolerance = 5;
//     const minCutoff = percentage - tolerance;
//     const maxCutoff = percentage + tolerance;

    // const nearbyColleges = colleges.filter(
    //   (college) => college.cutoffPercentage >= minCutoff && college.cutoffPercentage <= maxCutoff
    // );

//     setNearbyColleges(nearbyColleges);
//   };

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
        onBlur={(event)=>{setUserPercentage(event.target.value)}}/><br></br>
                      <h2>Entrance Exam</h2>
                      <select onBlur={(eve) => { setSeexam(eve.target.value) }}>
                      <option value=""> Select Entrance Exam</option>
                      {exams.map((exam, index) => (<option key={index} value={exam}>{exam}</option>))}
                      </select>
                      <h2>Select Range</h2>
                      <select onBlur={(event) => {setMintol(event.target.value)}}>
                          <option value="">Tolerance value</option>
                          <option value="5">5</option>
                          <option value="10">10</option>
                          <option value="15">15</option>
                      </select>

                      <center><button onClick={getColleges}> Get Colleges</button></center>
                      
                     
                     <h2>Nearby Colleges:</h2>
          {nearbyColleges.length > 0 ? (            
        <table class="table table-striped table-striped-columns "  border="2px"style={{ marginTop:"50px",border:"2px"}}>
        <thead>
          <tr>
            <th>Id</th>
            <th>University</th>
            <th> College Name</th>
            <th> Stream</th>
            <th> Branch</th>
            <th>City</th>
            <th>Predicted Cuttoff Score</th>
            {/* Add other headers here */}
          </tr>
        </thead>
        <tbody>
          {nearbyColleges.map((event,index) => (
              <tr key={event.clgId.ClgId}>
                  <td>{index + 1}</td>
                    <td>{event.clgId.uniId.uniName}</td>
                   <td>{event.clgId.clgName}</td>
                  <td>{event.strmId.strmName}</td>
                  <td>{event.brchId.brchName}</td>
                  <td>{event.clgId.clgCity}</td>
                   <td>{event.average}</td>
              <td>{/* Event organizer data */}</td>
              {/* Add other table data here */}
            </tr>
          ))}
        </tbody>
      </table>
      
        // <ul>
        //   {nearbyColleges.map((college, index) => (
        //     <li key={index}>{college.clgId.clgName}</li>
        //   ))}
        // </ul>*/}
                      ) 
                          : (
        <p>No nearby colleges found.</p>
      )}
                  </div>
                 
          
      </div>
      </center>
    </div>
  );
};

export default CollegePredictor;

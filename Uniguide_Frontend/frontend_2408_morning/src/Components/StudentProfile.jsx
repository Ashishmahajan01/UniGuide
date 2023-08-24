// RegistrationForm.js
import React, { useState } from 'react';
import { toast } from "react-toastify";
// import { useNavigate } from 'react-router';
import {useNavigate} from "react-router-dom"

import axios from "axios";
import { URL } from "../config";



function StudentProfile() {
    const [studFirstName, setfirstname] = useState('');
    const [studLastName, setlastname] = useState('');
    const [studCity, setcityname] = useState('');
    const [studState, setstatename] = useState('');
    const [studQualification, setqualification] = useState('');
    const [studEntranceExam, setExamname] = useState('');
    const [studExamScore, setExamscore] = useState('');
    
     const navigate = useNavigate()
  
    const handleRegistration = (e) => {
        e.preventDefault();

        if (studFirstName.length === 0) {
   
          toast.warning('please enter Student first Name')
        } 
        else  if(studLastName.length===0)
        {
          toast.warning('please enter Last Name')
        }
        else if (studCity.length === 0) {
          toast.warning('please enter City name')
        }else  if(studState.length===0)
        {
          toast.warning('please enter State')
        }
        else  if(studQualification.length===0)
        {
          toast.warning('please enter Qualification')
        }
        else  if(studEntranceExam.length===0)
        {
          toast.warning('please enter Enterance Exam name')
        }
        else  if(studExamScore.length===0)
        {
          toast.warning('please enter Exam Score')
        }
        else{
   
    const myObj = {
        studFirstName: studFirstName,
        studLastName: studLastName,
        studCity: studCity,
        studState: studState,
        studQualification:studQualification,
        studEntranceExam:studEntranceExam,
        studExamScore:studExamScore
     } ;

     console.log(myObj)

   
   axios.post(`${URL}/student/`, myObj).then((response)=>
        {
        if(response.data == 'success'){
            console.log(response.data);
            toast.success('Student Added Successfully');
            // navigate("/")
            
        }
        // else if(response.data=='fail'){
        //   toast.warning("email already present");
        // }
        
        else
        {
            toast.error('error')
        }
        })

    }}; 

    return (
        <div className="container5 mt-5">
        <h2>Student Profile</h2>
        <form>
          <div className="mb-3">
            <label htmlFor="username" className="form-label">firstname of student </label>
            <input type="text" className="form-control" id="studFirstName" placeholder='enter first name'
               value={studFirstName}
               onChange={(e) => setfirstname(e.target.value)} required="true"
            />
          </div>  


          <div className="mb-3">
            <label htmlFor="username" className="form-label">lastname of student</label>
            <input type="text" className="form-control" id="studLastName" placeholder='enter last name'
               value={studLastName}
               onChange={(e) => setlastname(e.target.value)} required
            />
          </div>

          <div className="mb-3">
            <label htmlFor="username" className="form-label">City</label>
            <input type="text" className="form-control" id="studCity" placeholder='enter city name'
               value={studCity}
               onChange={(e) => setcityname(e.target.value)} required
            />
          </div>

          <div className="mb-3">
            <label htmlFor="username" className="form-label">State</label>
            <input type="text" className="form-control" id="studState" placeholder='enter state name'
               value={studState}
               onChange={(e) => setstatename(e.target.value)} required
            />
          </div>


          <div className="mb-3">
            <label htmlFor="username" className="form-label">Qualification</label>
            <input type="text" className="form-control" id="studQualification" placeholder='enter Qulification'
               value={studQualification}
               onChange={(e) => setqualification(e.target.value)} required
            />
          </div>

          <div className="mb-3">
            <label htmlFor="username" className="form-label">EntranceExam</label>
            <input type="text" className="form-control" id="studEntranceExam" placeholder='enter Exam name'
               value={studEntranceExam}
               onChange={(e) => setExamname(e.target.value)} required
            />
          </div>


          <div className="mb-3">
            <label htmlFor="username" className="form-label">Exam score</label>
            <input type="text" className="form-control" id="studExamScore" placeholder='enter Exam score'
               value={studExamScore}
               onChange={(e) => setExamscore(e.target.value)} required
            />
          </div>

          <button type="submit" className="btn btn-primary" onClick={handleRegistration}>Submit</button>
        </form>
      </div>
    );
}

export default StudentProfile;

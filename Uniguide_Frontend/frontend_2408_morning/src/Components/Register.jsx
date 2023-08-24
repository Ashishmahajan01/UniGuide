// RegistrationForm.js
import React, { useState } from 'react';
import { toast } from "react-toastify";
// import { useNavigate } from 'react-router';
import {useNavigate} from "react-router-dom"

import axios from "axios";
import { URL } from "../config";



function RegistrationForm() {
    const [userName, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [emailId, setEmail] = useState('');
    const [role, setRole] = useState('');
     const navigate = useNavigate()
  
    const handleRegistration = (e) => {
        e.preventDefault();
        if (emailId.length == 0) {
          console.log("inside length verification")
       
        toast.warning('please enter email')
      } 
      else  if(!emailId.includes("@"))
      {
        toast.warning('please enter correct email, @ is missing')
      }
      else if (password.length == 0) {
        toast.warning('please enter password')
      }else if(role.length==0){
        toast.warning('please select role')
      }else{


    const myObj = {
        emailId: emailId,
        password: password,
        role: role,
        userName: userName
     } ;

     console.log("in portal",myObj)

   
   axios.post(`${URL}/registration`, myObj).then((response)=>
        {
        if(response.data == 'success'){
            console.log(response.data);
            toast.success('User Added Successfully');
            if(role=="student"){
              navigate("/regstudentprofile")
            }else{
            navigate("/login")}
            // navigate('/')
        }
        else if(response.data=='fail'){
          toast.warning("email already present");
        }
        // else
        // {
        //     toast.error('error')
        // }
     })
    }

}; 

    return (
      <div className="container mt-5">
      <div className="row justify-content-center">
        <div className="col-md-6">
          <div className="card">
            <div className="card-body">
              <h2 align="center" className="card-title">Register</h2>
              <br></br>
              <form>
                <div className="mb-3">
                  <label htmlFor="userName" className="form-label"><b>Username:</b></label>
                  <input
                    type="text"
                    className="form-control"
                    id="userName"
                    placeholder="Enter username"
                    value={userName}
                    onChange={(e) => setUsername(e.target.value)}
                    required
                  />
                </div>

                <div className="mb-3">
                  <label htmlFor="emailId" className="form-label"><b>Email Address:</b></label>
                  <input
                    type="email"
                    className="form-control"
                    id="emailId"
                    placeholder="abc@gmail.com"
                    value={emailId}
                    onChange={(e) => setEmail(e.target.value)}
                    required
                  />
                </div>

                <div className="mb-3">
                  <label htmlFor="password" className="form-label"><b>Password:</b></label>
                  <input
                    type="password"
                    className="form-control"
                    id="password"
                    placeholder="************"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    required
                  />
                </div>

                <div className="mb-3">
                  <label htmlFor="role" className="form-label"><b>Role:</b></label>
                  <select
                    className="form-select"
                    id="role"
                    onChange={(e) => setRole(e.target.value)}
                    required
                  >
                    <option value="select">Select </option>
                    <option value="student">Student</option>
                    <option value="hr">HR</option>
                  </select>
                </div>

                <div className="d-grid">
                  <button
                    type="submit"
                    className="btn btn-primary btn-lg"
                    onClick={handleRegistration}
                  >
                    Register
                  </button>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
    );
}

export default RegistrationForm;

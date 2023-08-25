import React, { useState } from 'react';
import "../CSS/CollegeLogin.css";
import { toast } from 'react-toastify';
import {useNavigate} from "react-router-dom"
import axios from "axios";

const CollegeLogin = () => {
     
  
    const[emailId,setEmailId]=useState("");
    const [password, setPassword] = useState("");
    
  const navigate = useNavigate()
    const handleSubmit = (e) => {
        e.preventDefault();


        if (emailId.length == 0) {
          console.log("inside length verification")
       
        toast.warning('please enter email')
      } 
      else  if(!emailId.includes("@"))
      {
        toast.warning('please enter correct email')
      }
      else if (password.length == 0) {
        toast.warning('please enter password')
      } else {
          console.log(emailId);
          console.log(password);
       
          const body = {
            emailId,
            password,
          }
          axios.post(`${URL}/login`, body).then((response) => {
            const result = response.data
          //   const status = response.status
              
              const { userId, userName, emailId, password, role } = result
              
            if (response.data=='success') {
              
              toast.success('Welcome to the application')
               
              navigate("/collegereg");
            }
            
          })
          .catch(); {
            console.log("event fired")
            navigate()
        }
          
        }
        
        
    };
  return (
    <div className="boxes">
            <h2>College Login</h2>
            <form onSubmit={handleSubmit}>
                <label>email:</label>
                <input type="email" name="username" 
                value={emailId}
                onChange={(e) => setEmailId(e.target.value)}
                />

                <label>Password:</label>
                <input type="password" name="password" 
                value={password}
                onChange={(e) => setPassword(e.target.value)}
                />

                <label>Role:</label>
                <input type="text" name="role" value="College" readOnly />

                <button type="submit">Login</button>
            </form>
        </div>
  )
}

export default CollegeLogin

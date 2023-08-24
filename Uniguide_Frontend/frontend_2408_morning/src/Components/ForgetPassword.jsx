import React, { useState } from 'react';
import axios from 'axios';
import { toast } from "react-toastify";
import {URL} from "../config";
import {useNavigate} from "react-router-dom"

const ForgotPassword = () => {
  const [email, setEmail] = useState('');
  const [username, setUsername] = useState('');
  const [password, setpassword] = useState('');
  const navigate = useNavigate()
  
  const handleResetPassword = async () => {

    if (email.length == 0) {
      
   
    toast.warning('please enter email')
  } 
  else  if(!email.includes("@"))
  {
    toast.warning('please enter correct email')
  }
  else if (username.length == 0) {
    
 
  toast.warning('please enter username')
} 
  else if (password.length == 0) {
    toast.warning('please enter password')
  } else {

    const details={emailId:email,
                    password:password,
                    userName:username};
        console.log(details);
      //const response = await axios.put('${URL}/reset', details);
      axios.put(`${URL}/reset`, details).then((response) => {          
        if (response.data=='success') {
          toast.success('Password reset succcessfully')
          navigate('/login')
        }else{
            toast.warning("Please Enter valid values.");
        }
        
      }).catch(); {
        console.log("event fired")
        //navigate("/home")
      }
  }};
      
    
  

  return (
    <div className="container mt-5">
      <div className="row justify-content-center">
        <div className="col-md-6">
          <div className="card">
            <div className="card-body">   
            <center><h2 className="card-title">Forgot Password</h2></center>
              
              <div className="form-group">
                <b>Username: </b>
                <br></br>
                <input
                  type="text"
                  className="form-control"
                  placeholder="Enter your username"
                  value={username}
                  onChange={(e) => setUsername(e.target.value)} required
                />
                 <br></br>
                 <b>Email: </b>
                 <br></br>
                 <input
                  type="email"
                  className="form-control"
                  placeholder="Enter your email"
                  value={email}
                  onChange={(e) => setEmail(e.target.value)} required
                />

                 <br></br>
                 <b>Password: </b>
                 <br></br>
                 <input
                  type="text"
                  className="form-control"
                  placeholder="Enter your new password"
                  value={password}
                  onChange={(e) => setpassword(e.target.value)} required
                />

               <br></br>
              </div>
             <center> <button className="btn btn-primary" onClick={handleResetPassword}>Reset Password</button></center>
              
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default ForgotPassword;

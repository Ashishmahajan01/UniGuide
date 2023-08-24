import React, { useState } from 'react';
import axios from 'axios';
import {useNavigate} from "react-router-dom"
import { toast } from 'react-toastify';
import { ToastContainer } from 'react-toastify';
import { URL } from '../config';


import loginBackground from '../Images/WhatsApp Image 2023-08-21 at 3.27.51 PM.jpeg';




const Login = () => {


   const[emailId,setEmailId]=useState("");
    const [password, setPassword] = useState("");
    const [userLogin, setUserLogin] = useState("");
  const navigate = useNavigate()
  

const LoginFunction=(e)=>
{
    e.preventDefault();
    console.log("Inside function");
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
             
            navigate('/')
          }else{
            toast.warning('Wrong credential')
            navigate('/login')
          }
          
        })
        .catch() 
        {
        //   console.log("event fired")
          
      }
        
      }
     
};
  return (
  
    <div className="container mt-5 " >
      <div className="row justify-content-center ">
        <div className="col-md-6">
          {/* <div className="card box"> */}
            <div className="card-body box">
              <form className="login-form">
                <h2 className="text-center login-heading">Login</h2>
                <div className="form-group">
                 <b> <label htmlFor="email" className="font-weight-bold">Email:</label></b>
                 
                  <input
                    type="email"
                    className="form-control"
                    placeholder="abc@gmail.com"
                    value={emailId}
                    onChange={(e) => setEmailId(e.target.value)}
                  />
                </div>
                <br />
                <div className="form-group">
                <b> <label htmlFor="password" className="font-weight-bold">Password:</label></b>
                  
                  <input
                    type="password"
                    className="form-control"
                    placeholder="**********"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                  />
                </div>
                <div className="text-center mt-4">
                  <button className="btn btn-primary" onClick={LoginFunction}>Login</button>
                </div>
                <br />
                <div className="text-center mt-3">
                  <a href="/forgetpassword" className="forgot-password-link">
                    Forgot Password?
                  </a>
                </div>
                <p className="text-center mt-3 new-user">
                  New user? <a href="/registration">Sign up</a>
                </p>
              </form>
            </div>
          </div>
        </div>
      {/* </div> */}
    </div>
    
  );
}

export default Login;

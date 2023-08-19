import React, { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router';
import { toast } from 'react-toastify';
import { ToastContainer } from 'react-toastify';
import { URL } from '../config';
import "../CSS/Login.css"


const Login = () => {

const[emailId,setEmailId]=useState("");
    const [password, setPassword] = useState("");
    const [userLogin, setUserLogin] = useState("");
 const navigate = useNavigate()

const LoginFunction=()=>
{
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
            console.log(result);
            const { userId, userName, emailId, password, role } = result
            console.log(userId);
            console.log("ashish is mc", response.data);
            //console.log(result['status'])
            if (result['status'] == 'success') {
                console.log("gffdgd1213");
                toast.success('Welcome to the application')
            
                navigate('/home')
            } else {
          
                console.log("gffdgd");
                navigate('/home')
                console.log("error");
            }
          
        })
            //.catch(); { console.log("event fired") }
        
      }
     
}



  return (
   <div className="container">
            {/* <img src="cool_image.jpg" alt="Cool Image" /> */}
            <form className="login-form">
                <h2 className="login-heading">Login</h2>
                <label htmlFor="email">Email:</label>
                <input onChange={(e)=>{setEmailId(e.target.value)}} type="email"   placeholder='abc@gmail.com'  />
             
                {/* <input type="email" id="email" name="email" required /> */}
                <label htmlFor="password">Password:</label>
              {/* <input type="password" id="password" name="password" required /> */}
               <input onChange={(e)=>{setPassword(e.target.value)}} type="password"   placeholder='**********'  />
              
                <div className="buttons">
                    <button  onClick={LoginFunction}>Login</button>
                    <a href="#">Forgot Password?</a>
                </div>
                <p className="new-user">New user? <a href="#">Sign up</a></p>
            </form>
        </div>
  );
}

export default Login;

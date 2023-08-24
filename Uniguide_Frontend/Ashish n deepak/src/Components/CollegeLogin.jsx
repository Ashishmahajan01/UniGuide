import React from 'react';
import "../CSS/CollegeLogin.css";
import {useNavigate} from "react-router-dom"

const CollegeLogin = () => {
  const navigate = useNavigate()
    const handleSubmit = (e) => {
        e.preventDefault();
        // Handle form submission logic here
        navigate("/collegereg");
        
    };
  return (
    <div className="boxes">
            <h2>College Login</h2>
            <form onSubmit={handleSubmit}>
                <label>User Name:</label>
                <input type="text" name="username" />

                <label>Password:</label>
                <input type="password" name="password" />

                <label>Role:</label>
                <input type="text" name="role" value="College" readOnly />

                <button type="submit">Login</button>
            </form>
        </div>
  )
}

export default CollegeLogin

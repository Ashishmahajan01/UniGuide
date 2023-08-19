import axios from "axios";
import { useEffect, useState } from "react";
import { URL } from "../config";
import "../CSS/Forgot.css";

const Forgot = () => { 




    return (<div className="container">
            <h1>Forgot Password</h1>
            <form id="forgotPasswordForm" action="/reset-password" method="post">
                <label htmlFor="username">Username:</label>
                <input type="text" id="username" name="username" required />
                
                <label htmlFor="email">Email address:</label>
                <input type="email" id="email" name="email" required />
                
                <label htmlFor="newPassword">New password:</label>
                <input type="password" id="newPassword" name="newPassword" required />
            <button type="submit">Reset Password</button>
            </form>
            </div>)
}

export default Forgot;
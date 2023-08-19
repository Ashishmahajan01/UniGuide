import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes, Link } from 'react-router-dom'
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css'
import Login from "./Pages/Login";
import Home from "./Pages/Home";
import Forgot from "./Pages/Forgot";
import Feedback from "./Pages/Feedback";
// import Container from 'react-bootstrap/Container';
// import Nav from 'react-bootstrap/Nav';
// import Navbar from 'react-bootstrap/Navbar';
// import NavDropdown from 'react-bootstrap/NavDropdown';


function App() {
  return (
     <div>
  
     
        <ToastContainer position="top-right" theme="colored" />
        <Routes>
          <Route path="/" element={<Login />} />
        <Route path="/home" element={<Home />} />
        <Route path="/forgot" element={<Forgot />} />
         <Route path="/feedback" element={<Feedback />} />
        </Routes>
      
   
      </div>
  );
}

export default App;

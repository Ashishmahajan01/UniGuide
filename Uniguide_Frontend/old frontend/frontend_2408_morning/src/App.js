import 'react-toastify/dist/ReactToastify.css'
import { ToastContainer } from 'react-toastify';
import { BrowserRouter, Route, Routes, Link } from 'react-router-dom'
import Register from "./Components/Register";
import Login from './Components/Login';
import StudentProfile from './Components/StudentProfile';
import ShowStudentProfile from './Components/ShowStudentProfile';
import ForgetPassword from './Components/ForgetPassword';
import Navbar from "./Components/Navbar";
import AppFeedbackForm from './Components/AppFeedback';
import College from "./Components/College"
import CollegeRegister from './Components/CollegeRegister';
import CollegeLogin from './Components/CollegeLogin';
import Stream from './Components/Stream';
import Branch from './Components/Branch';
import Recruiters from './Components/Recruiters';
import University from './Components/University';
import RecruitersList from './Components/RecruitersList';
import UserProfile from './Components/UserProfile';
import Footer from './Components/Footer';
import SearchBar from './Components/HomePage/SearchBar';
import CollegePredictor from './Components/CollegePredictor';

function App() {


  return (
    
    <div>
    <BrowserRouter>
    <Navbar></Navbar>
          <Routes>
          <Route path="/" element={<SearchBar />} />
            <Route path="/login" element={<Login />} />
            <Route path="/registration" element= { <Register/>} />
            <Route path="/regstudentprofile" element= { <StudentProfile/>} />
            <Route path="/showstudentprofile" element= { <ShowStudentProfile/>} />
            <Route path="/forgetpassword" element= { <ForgetPassword/>} />
            <Route path="/appfeedback" element= { <AppFeedbackForm/>} />
            <Route path="/college" element= { <College/>} />
            <Route path="/collegereg" element= { <CollegeRegister/>} />
            <Route path="/collegelogin" element= { <CollegeLogin/>} />
            <Route path="/stream" element= { <Stream/>} />
            <Route path="/branch" element= { <Branch/>} />
            <Route path="/recruit" element= { <Recruiters/>} />
            <Route path="/university" element= { <University/>} />
            <Route path="/recruitlist" element= { <RecruitersList/>} />
            <Route path="/profile" element= { <UserProfile/>} />
            <Route path="/predictor" element= { <CollegePredictor/>} />
            
           
          </Routes>
        
      </BrowserRouter>
      <Footer></Footer>
      <ToastContainer />
    
  </div>

  );
}

export default App;

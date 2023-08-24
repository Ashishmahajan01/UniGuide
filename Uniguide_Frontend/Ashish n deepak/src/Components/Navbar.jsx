import React from 'react';
import { Link } from 'react-router-dom'; // If you're using React Router
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faUser } from '@fortawesome/free-solid-svg-icons';
import '../CSS/Navbar.css';
import uniguideLogo from '../Images/uniguide.jpg';

const Navbar = () => {
  return (
    <nav className="navbar">
      <div className="nav-left">
        <span className="website-name">Uniguide</span>
        <img src={uniguideLogo} alt="Uniguide Logo" className="logo" />
      </div>
      <ul className="nav-list">
        <li><Link to="/">Home</Link></li>
        <li><Link to="/about">About Us</Link></li>
        <li><Link to="/university">Universities</Link></li>
        <li><Link to="/college">Colleges</Link></li>
        <li><Link to="/stream">Streams</Link></li>
        <li><Link to="/test">Test</Link></li>
        <li><Link to="/recruitlist">Recruitment</Link></li>
        <li className="dropdown">
          <span className="account-link">Account</span>
          <div className="dropdown-content">
            <Link to="/login">Login</Link>
            <Link to="/profile">
              Profile <FontAwesomeIcon icon={faUser} className="profile-icon" />
            </Link>
            <Link to="/appfeedback">Feedback</Link>
            <Link to="/signout">Sign Out</Link>
          </div>
        </li>
      </ul>
    </nav>
  );
};

export default Navbar;


 
import React from 'react';
import '../CSS/Footer.css';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faFacebook, faTwitter, faInstagram } from '@fortawesome/free-brands-svg-icons';
import { faEnvelope } from '@fortawesome/free-solid-svg-icons';
import uniguideLogo from '../Images/uniguide.jpg';

const Footer = () => {
  return (
    <footer className="footer">
      <div className="footer-content">
        <div className="footer-logo">
          <img src={uniguideLogo} alt="Uniguide Logo" className="logo" /><h2>Uniguide</h2>
          <p>Your Educational Guide</p>
        </div>
        <center>ALL TRADE MARKS BELONG TO THE UNIGUIDE.</center>
        <div className="footer-social">
            <a href="https://www.gmail.com/" target="_blank" rel="noopener noreferrer">
            <FontAwesomeIcon icon={faEnvelope} />
        </a><a href="https://www.facebook.com/" target="_blank" rel="noopener noreferrer">
            <FontAwesomeIcon icon={faFacebook} />
          </a>
          <a href="https://www.twitter.com/" target="_blank" rel="noopener noreferrer">
            <FontAwesomeIcon icon={faTwitter} />
          </a>
          <a href="https://www.instagram.com/" target="_blank" rel="noopener noreferrer">
            <FontAwesomeIcon icon={faInstagram} />
          </a>
        </div>
      </div>
      <div className="footer-bottom">
        <p>&copy; 2023 Uniguide. All rights reserved.</p>
      </div>
    </footer>
  );
};

export default Footer;

import axios from "axios";
import { useEffect, useState } from "react";
import { URL } from "../config";
//import "../CSS/Home.css";
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import NavDropdown from 'react-bootstrap/NavDropdown';

const Home = () => {
    return (
        <div>
            {/* <div className="navbar">
                <a className="logo" href="#home">Uniguide</a>
                <a href="#home">Home</a>
                <a href="#takeatest">Take a Test</a>
                <a href="#event">Event</a>
                <a href="#feedback">Feedback</a>
                <a href="#more">More</a>
                <a href="#streammore">Stream More</a>
                <a href="#login">Login</a>
            </div> */}
 <Navbar expand="lg" className="bg-body-tertiary">
      <Container>
        <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#home">Home</Nav.Link>
            <Nav.Link href="#link">Link</Nav.Link>
            <NavDropdown title="Dropdown" id="basic-nav-dropdown">
              <NavDropdown.Item href="#action/3.1">Action</NavDropdown.Item>
              <NavDropdown.Item href="#action/3.2">
                Another action
              </NavDropdown.Item>
              <NavDropdown.Item href="#action/3.3">Something</NavDropdown.Item>
              <NavDropdown.Divider />
              <NavDropdown.Item href="#action/3.4">
                Separated link
              </NavDropdown.Item>
            </NavDropdown>
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
            {/* <div className="search-container">
                <input type="text" className="search-input" placeholder="Search..." />
                <button className="search-button">Search</button>
            </div>

            <div className="college-predictor-button">
                <button>College Predictor</button>
            </div> */}
        </div>
    );
};


export default Home;
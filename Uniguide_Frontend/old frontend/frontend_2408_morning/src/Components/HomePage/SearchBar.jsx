import React from 'react';
import '../../CSS/Home/SearchBar.css';
import RectangularBoxes from './RectangularBoxes';
import Testimonials from './Testimonials';
import Events from './Events';
import ImageCarousel from './ImageCarousel';

const SearchBar = () => {
  return (
    <div>
    <div className="search-bar">
        <br></br>
      <div className="search-input-box">
        <input type="text" placeholder="Search colleges" className="search-input" />
        <button className="search-button">Search</button>
      </div>
      <br></br>
      <div className="educational-content">
        <h2>Discover Educational Opportunities</h2>
        <p>
          Explore a wide range of educational opportunities, courses, and resources to help you achieve your learning goals.
        </p>
      </div>
    </div>
    <ImageCarousel></ImageCarousel>
    <RectangularBoxes></RectangularBoxes>
    <Events></Events>
    <Testimonials></Testimonials>
    </div>
  );
};

export default SearchBar;

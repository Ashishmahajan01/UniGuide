import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import '../../CSS/Home/Testimonials.css';
import image1 from '../../Images/testimonial-1.jpg';
import image2 from '../../Images/testimonial-4.jpg';
import image3 from '../../Images/testimonial-3.jpg';
import image4 from '../../Images/testimonial-2.jpg';

const TestimonialCard = ({ name, feedback, image }) => {
  return (
    <div className="testimonial-card">
      <img src={image} alt={`${name}`} className="testimonial-image" />
      <h3>{name}</h3>
      <p>{feedback}</p>
    </div>
  );
};

const Testimonials = () => {
  const testimonials = [
    { name: 'John Doe', feedback: 'Great platform for learning!', image: image1 },
    { name: 'Jane Smith', feedback: 'I found the resources very helpful.', image: image2 },
    { name: 'Jane Smith', feedback: 'I found the resources very helpful.', image: image3 },
    { name: 'Jane Smith', feedback: 'I found the resources very helpful.', image: image4 },
    // Add more testimonials
  ];


 

  return (
    <div className="testimonials">
      <b><h2>Testimonials</h2></b>
      <div className="testimonial-cards-container">
        {testimonials.map((testimonial, index) => (
          <TestimonialCard
            key={index}
            name={testimonial.name}
            feedback={testimonial.feedback}
            image={testimonial.image}
          />
        ))}
      </div>
      <Link to="/feedback" className="show-more-link">Show More</Link>
    </div>
  );
};

export default Testimonials;

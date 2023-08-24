import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import axios from "axios";
import {URL} from "../../config"
import '../../CSS/Home/Testimonials.css';
import image1 from '../../Images/testimonial-1.jpg';
import image2 from '../../Images/testimonial-4.jpg';
import image3 from '../../Images/testimonial-3.jpg';
import image4 from '../../Images/testimonial-2.jpg';

const TestimonialCard = ({ name, feedback,feedid,rating}) => {
  return (
    
    <div className="testimonial-card">
      {feedid % 4 == 0 ? <> <img src={image1} alt={`${name}`} className="testimonial-image" /><h3>{name}</h3><p>{feedback}</p><p>{rating}/5</p></>
        : feedid % 4 == 1 ? <><img src={image2} alt={`${name}`} className="testimonial-image" /><h3>{name}</h3> <p>{feedback}</p><p>{rating}/5</p></>
         : feedid % 4 == 2 ? <><img src={image3} alt={`${name}`} className="testimonial-image" /> <h3>{name}</h3><p>{feedback}</p><p>{rating}/5</p></>
        :<><img src={image4} alt={`${name}`} className="testimonial-image" /><h3>{name}</h3><p>{feedback}</p><p>{rating}/5</p></>
      }
    </div>
  );
};

const Testimonials = () => {
  
   const [feedback, setfeedback] = useState([]);

const getRecent=async()=>{
        await axios.get(`${URL}/appfeedback/recent`).then((response) => {
          console.log(response.data);
      
          setfeedback(response.data);
        
          console.log("Events", feedback);
       feedback.map((eve)=>{console.log(eve.userId.userName)})
             })
  }
  useEffect(() => {
    
        getRecent();
      }, []);



 

  return (
    <div className="testimonials" >
      <b><h2>Testimonials</h2></b>
      <div className="testimonial-cards-container" >
        {feedback.map((feed, index) => (
          <TestimonialCard
            key={index}
            name={feed.userId.userName}
            feedback={feed.appfeedDesc}
            feedid={feed.appfeedId}
            rating={ feed.appfeedRating}
            
          />
        ))}
      </div>
      <Link to="/appfeedlist" className="show-more-link">Show More</Link>
    </div>
  );
};

export default Testimonials;

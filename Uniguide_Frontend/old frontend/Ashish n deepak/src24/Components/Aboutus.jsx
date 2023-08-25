import React from 'react';
import "../CSS/Aboutus.css";
const Aboutus = () => { 

    return (
        <section className="about" id="about1">
  <div className="heading-section" data-aos="fade-up" data-aos-offset={100}>
    <h2>
      ABOUT <span>US</span>
    </h2>
  </div>
  <div className="all-about" data-aos="fade-up" data-aos-offset={100}>
    <div className="image-section">
      <img src="img/img1.jpg" alt="image-here" width="100%" height="350px" />
    </div>
    <div className="text-area">
      <h3>What makes our Chocolate special?</h3>
      <p>
        The roasting process is what brings out the rich chocolate flavor. The
        length and temperature of roasting varies and affects the final flavor
        of the chocolate. <br /> The same chocolate manufacturer might roast
        cocoa beans from different origins for different lengths of time to
        bring out the best taste.
      </p>
      <a href="#" className="learn-btn">
        Learn More
      </a>
    </div>
  </div>
</section>

    )
}

export default Aboutus;
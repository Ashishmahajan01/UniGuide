import React from 'react';
import { Carousel } from 'react-responsive-carousel';
import 'react-responsive-carousel/lib/styles/carousel.min.css';
import image1 from '../../Images/college.jpg';  // Update to .jpg format
import image2 from '../../Images/college1.jpg';
import '../../CSS/Home/ImageCarousel.css'


const ImageCarousel = () => {
  const images = [
    { src: image1 , text: 'Education and Guidance' },
    { src: image2 , text: 'Learning ' }

]; // Add more image imports here

  return (
    <div>
        <div className="image-carousel-container">
    <Carousel
      showStatus={false}
      showThumbs={false}
      infiniteLoop={true}
      autoPlay={true}
      interval={3000}
      transitionTime={500}
      showIndicators={false}
    >
      {images.map((image, index) => (
        <div key={index}>
           <img src={image.src} alt={`Image ${index + 1}`} />
         <h3> <p className="carousel-text">{image.text}</p></h3>
        </div>
      ))}
    </Carousel>
  </div>
  </div>
  );
};

export default ImageCarousel;

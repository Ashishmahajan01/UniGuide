import React from 'react';
import { Link } from 'react-router-dom';
import '../../CSS/Home/Events.css';

const EventCard = ({ title, description }) => {
  return (
    <div className="event-card">
      <h3 className="event-heading">Ongoing Events</h3>
      <p>{description}</p>
    </div>
  );
};

const Events = () => {
  const events = [
    { title: 'Event 1', description: 'Description for Event 1' },
    { title: 'Event 2', description: 'Description for Event 2' },
    { title: 'Event 3', description: 'Description for Event 3' }
    // Add more events
  ];

  return (
    <div className="eventss">
      <h2 className="events-titles" align="center">Ongoing Events</h2>
      <div className="event-cards-container">
        {events.map((event, index) => (
          <EventCard key={index} title={event.title} description={event.description} />
        ))}
      </div>
     <center> <Link to="/events" className="show-more-link" align="center">Show More</Link></center>
    </div>
  );
};

export default Events;

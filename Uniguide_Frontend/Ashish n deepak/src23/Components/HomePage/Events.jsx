import {React,useState,useEffect} from 'react';
import { Link } from 'react-router-dom';
import axios from "axios";
import '../../CSS/Home/Events.css';
import {URL} from "../../config"

const EventCard = ({ title, description, location,Scheduled}) => {
  return (
    <div className="event-card">
  <h3 className="event-heading">Ongoing Events</h3>
      <p><b>Event name: </b>{ title}</p>
      <p><b>Description: </b>{description}</p>
      <p><b>Location: </b>{location}</p>
      <p><b>Scheduled on: </b>{Scheduled}</p>
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
  const [event, setevent] = useState([]);

const getRecent=async()=>{
        await axios.get(`${URL}/event/recent`).then((response) => {
          console.log(response.data);
          setevent(response.data);
          console.log("Events", event);
          event.map((eve)=>{console.log(eve.evtDescription)})
             })
  }
  useEffect(() => {
        getRecent();
      }, []);
  // const getRecent=async()=>{
  //       const response= await fetch('${URL}/event/recent');
  //       setEvent( await response.json());
  //   //console.log(response.data);
  //   console.log(event);
  //   }

    

    // const [event, seteventData] = useState([]);

    // useEffect(() => {
     
    // const fetchData = async () => {
    //   try {
    //     const response = await axios.get(`${URL}/event/recent`);
    //     console.log(response.data);
    //     seteventData(response.data);
    //     console.log("EventData=========",event)

    //   } catch (error) {
    //     console.error('Error fetching data:', error);
    //   }
    // };

    

  //   fetchData();
  // }, []);
 

  return (
    <div className="eventss">
      <h2 className="events-titles" align="center">Ongoing Events</h2>
      <div className="event-cards-container">
        {event.map((eve, index) => (
          <EventCard key={index}
            title={eve.evtName}
            description={eve.evtDescription}
            location={eve.evtLocation}
            Scheduled={eve.evtScheduleOn} />
        ))}
      </div>
     <center> <Link to="/events" className="show-more-link" align="center">Show More</Link></center>
    </div>
  );
};

export default Events;

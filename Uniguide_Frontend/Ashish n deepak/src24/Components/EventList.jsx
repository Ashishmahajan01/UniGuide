import React, { useState, useEffect } from 'react';
import axios from "axios";
import {URL} from "../config"

const EventList = () => {
  const [events, setEvents] = useState([]);
  const [sortBy, setSortBy] = useState(null);
    const [locationFilter, setLocationFilter] = useState('');
    const fetchEvents = async () => { 
        try {
        const response = await axios.get(`${URL}/event/`);
            //console.log(response.data);
            let arr = response.data;
            setEvents(arr);
            console.log(events);
            console.log(arr[0].evtDescription)

      } catch (error) {
        console.error('Error fetching data:', error);
      }
        
    }

  useEffect(() => {
    // Fetch event data from backend using getEvents API call
    // Replace this with your actual API call
    // const fetchedEvents = [
    //   // Sample event data: Replace with actual event data
    //   { id: 1, name: 'Event 1', location: 'Location A', schedule: '2023-08-25' },
    //   { id: 2, name: 'Event 2', location: 'Location B', schedule: '2023-09-10' },
    //   // ...
    // ];
      fetchEvents();

    // setEvents(fetchedEvents);
  }, []);


  



  return (
    <div style={{marginBottom:"20px"}}> 
      <h1>Event List</h1>
      <div>
        <label>Location Filter: </label>
        <input
          type="text"
          value={locationFilter}
       
              />
              <center><h2>List Of Event</h2></center>
          </div>
           
          <table class="table table-striped table-striped-columns "  border="2px"style={{ marginTop:"50px",border:"2px"}}>
        <thead>
          <tr>
            <th>Id</th>
            <th> Name</th>
            <th> Description</th>
            <th> Location</th>
            <th>Organizer</th>
            <th>Scheduled On</th>
            {/* Add other headers here */}
          </tr>
        </thead>
        <tbody>
          {events.map((event) => (
              <tr key={event.evtId}>
                   <td>{event.evtId}</td>
              <td>{event.evtName}</td>
                  <td>{event.evtDescription}</td>
                  <td>{event.evtLocation}</td>
                  <td>{event.evtOrganizer}</td>
                   <td>{event.evtScheduleOn}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default EventList;
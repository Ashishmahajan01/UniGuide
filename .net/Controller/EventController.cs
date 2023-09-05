using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Net;
using YourNamespace.Models; // Assuming Event is a model in your application
using YourNamespace.Services; // Assuming EventService is a service in your application

namespace YourNamespace.Controllers
{
    [Route("event")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class EventController : ControllerBase
    {
        private readonly IEventService _eventService;

        public EventController(IEventService eventService)
        {
            _eventService = eventService;
        }

        [HttpGet]
        public IActionResult GetAllOngoingEvent()
        {
            List<Event> eventList = _eventService.GetEvents();
            return Ok(eventList);
        }

        [HttpPost]
        public IActionResult AddEvent([FromBody] Event e)
        {
            bool status = _eventService.AddEvent(e);
            if (status)
            {
                return Ok("Event added successfully");
            }
            return Ok("Event not added");
        }

        [HttpPut]
        public IActionResult UpdateEvent([FromBody] Event e)
        {
            bool status = _eventService.Update(e);
            if (status)
            {
                return Ok("Event updated successfully");
            }
            return Ok("Event not found");
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteEvent(int id)
        {
            bool status = _eventService.Delete(id);
            if (status)
            {
                return Ok("Event deleted successfully");
            }
            return Ok("Event deleted unsuccessfully");
        }

        [HttpGet("recent")]
        public IActionResult GetRecentEvent()
        {
            List<Event> eventList = _eventService.GetRecentEvents();
            return Ok(eventList);
        }
    }
}

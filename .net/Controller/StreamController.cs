using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using YourNamespace.Models; // Assuming Stream is a model in your application
using YourNamespace.Services; // Assuming StreamService is a service in your application

namespace YourNamespace.Controllers
{
    [Route("stream")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class StreamController : ControllerBase
    {
        private readonly IStreamService _streamService;

        public StreamController(IStreamService streamService)
        {
            _streamService = streamService;
        }

        [HttpGet]
        public IActionResult GetAll()
        {
            List<Stream> streamList = _streamService.GetAll();
            if (streamList.Count == 0)
            {
                return NoContent();
            }
            return Ok(streamList);
        }

        [HttpPost]
        public IActionResult AddStream([FromBody] Stream s)
        {
            bool status = _streamService.AddStream(s);
            if (status)
            {
                return Ok("Stream added successfully");
            }
            return Ok("Stream not added");
        }

        [HttpPut]
        public IActionResult UpdateStream([FromBody] Stream s)
        {
            bool status = _streamService.Update(s);
            if (status)
            {
                return Ok("Stream updated successfully");
            }
            return Ok("Stream not found");
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteStream(int id)
        {
            bool status = _streamService.Delete(id);
            if (status)
            {
                return Ok("Stream deleted successfully");
            }
            return Ok("Stream deleted unsuccessfully");
        }
    }
}

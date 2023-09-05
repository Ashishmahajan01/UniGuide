using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using YourNamespace.Models; // Assuming Feedback is a model in your application
using YourNamespace.Services; // Assuming FeedbackService is a service in your application

namespace YourNamespace.Controllers
{
    [Route("feedback")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class FeedbackController : ControllerBase
    {
        private readonly IFeedbackService _feedbackService;

        public FeedbackController(IFeedbackService feedbackService)
        {
            _feedbackService = feedbackService;
        }

        [HttpGet]
        public List<Feedback> GetAllFeedback()
        {
            List<Feedback> feedbackList = _feedbackService.GetFeedbacks();
            return feedbackList;
        }

        [HttpPost]
        public IActionResult GiveFeedback([FromBody] Feedback fb)
        {
            _feedbackService.GiveFeedback(fb);
            return Ok("Student feedback added successfully");
        }

        [HttpPut]
        public IActionResult UpdateFeedback([FromBody] Feedback fb)
        {
            bool status = _feedbackService.Update(fb);
            if (status)
            {
                return Ok("Student feedback updated successfully");
            }
            return Ok("Student feedback not found");
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteFeedback(int id)
        {
            bool status = _feedbackService.Delete(id);
            if (status)
            {
                return Ok("Student feedback deleted successfully");
            }
            return Ok("Student feedback deleted unsuccessfully");
        }
    }
}

using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using YourNamespace.Models; // Replace with your actual model namespace
using YourNamespace.Services; // Replace with your actual service namespace

namespace YourNamespace.Controllers
{
    [Route("api/appfeedback")]
    [ApiController]
    public class AppFeedbackController : ControllerBase
    {
        private readonly IAppFeedbackService _appFeedbackService;

        public AppFeedbackController(IAppFeedbackService appFeedbackService)
        {
            _appFeedbackService = appFeedbackService;
        }

        [HttpPost]
        public IActionResult GiveFeedback([FromBody] AppFeedback fb)
        {
            if (fb == null)
            {
                return BadRequest("Invalid feedback data");
            }

            // Assuming that _appFeedbackService.giveFeedback() returns a boolean indicating success
            if (_appFeedbackService.GiveFeedback(fb))
            {
                return Ok("Feedback added successfully");
            }
            else
            {
                return BadRequest("Failed to add feedback");
            }
        }

        [HttpGet]
        public ActionResult<IEnumerable<AppFeedback>> GetFeedbackData()
        {
            var feedbackData = _appFeedbackService.GetFeedback();
            return Ok(feedbackData);
        }

        [HttpPut]
        public IActionResult UpdateFeedback([FromBody] AppFeedback fb)
        {
            if (fb == null)
            {
                return BadRequest("Invalid feedback data");
            }

            // Assuming that _appFeedbackService.update() returns a boolean indicating success
            if (_appFeedbackService.Update(fb))
            {
                return Ok("Feedback updated successfully");
            }
            else
            {
                return BadRequest("Feedback not found");
            }
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteFeedback(int id)
        {
            // Assuming that _appFeedbackService.delete() returns a boolean indicating success
            if (_appFeedbackService.Delete(id))
            {
                return Ok("Feedback deleted successfully");
            }
            else
            {
                return BadRequest("Feedback not found");
            }
        }

        [HttpGet("recent")]
        public ActionResult<IEnumerable<AppFeedback>> GetRecentFeedback()
        {
            var recentFeedback = _appFeedbackService.GetRecentFeedbacks();
            return Ok(recentFeedback);
        }
    }
}

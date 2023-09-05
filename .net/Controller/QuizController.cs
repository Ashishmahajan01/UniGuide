using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using YourNamespace.Models; // Assuming Quiz is a model in your application
using YourNamespace.Services; // Assuming QuizService is a service in your application

namespace YourNamespace.Controllers
{
    [Route("quiz")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class QuizController : ControllerBase
    {
        private readonly IQuizService _quizService;

        public QuizController(IQuizService quizService)
        {
            _quizService = quizService;
        }

        [HttpGet]
        public IActionResult GetAll()
        {
            List<Quiz> quizList = _quizService.GetAll();
            if (quizList.Count == 0)
            {
                return NoContent();
            }
            return Ok(quizList);
        }

        [HttpPost]
        public IActionResult AddQuestion([FromBody] Quiz q)
        {
            bool status = _quizService.AddQuestion(q);
            if (status)
            {
                return Ok("Question added successfully");
            }
            return Ok("Question not added");
        }

        [HttpPut]
        public IActionResult UpdateQuestion([FromBody] Quiz q)
        {
            bool status = _quizService.Update(q);
            if (status)
            {
                return Ok("Question updated successfully");
            }
            return Ok("Question not found");
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteQuestion(int id)
        {
            bool status = _quizService.Delete(id);
            if (status)
            {
                return Ok("Question deleted successfully");
            }
            return Ok("Question deleted unsuccessfully");
        }
    }
}

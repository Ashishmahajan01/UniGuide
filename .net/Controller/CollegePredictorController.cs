using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Net;
using YourNamespace.Models; // Assuming CollegePredictor is a model in your application
using YourNamespace.Services; // Assuming CollegePredictorService is a service in your application

namespace YourNamespace.Controllers
{
    [Route("collegepredictor")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class CollegePredictorController : ControllerBase
    {
        private readonly ICollegePredictorService _collegePredictorService;

        public CollegePredictorController(ICollegePredictorService collegePredictorService)
        {
            _collegePredictorService = collegePredictorService;
        }

        [HttpGet]
        public IActionResult GetAll()
        {
            List<CollegePredictor> collegePredictorList = _collegePredictorService.GetAll();
            if (collegePredictorList.Count == 0)
            {
                return NotFound();
            }
            return Ok(collegePredictorList);
        }

        [HttpPost]
        public IActionResult Add([FromBody] CollegePredictor c)
        {
            bool status = _collegePredictorService.Add(c);
            if (status)
            {
                return Ok("College Marks details added successfully");
            }
            return Ok("College mark details cannot be added");
        }

        [HttpPut]
        public IActionResult Update([FromBody] CollegePredictor c)
        {
            bool status = _collegePredictorService.Update(c);
            if (status)
            {
                return Ok("College Marks details updated successfully");
            }
            return Ok("College mark details cannot be added");
        }

        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            bool status = _collegePredictorService.Delete(id);
            if (status)
            {
                return Ok("College Marks deleted successfully");
            }
            return Ok("College mark details cannot be deleted");
        }

        [HttpGet("exams")]
        public IActionResult GetExams()
        {
            List<string> examList = _collegePredictorService.GetExams();
            return Ok(examList);
        }

        [HttpGet("exams/{exam}")]
        public IActionResult GetColleges(string exam)
        {
            List<CollegePredictor> collegePredictorList = _collegePredictorService.GetColleges(exam);
            return Ok(collegePredictorList);
        }
    }
}

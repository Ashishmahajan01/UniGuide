using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using YourNamespace.Models; // Assuming StudentLogin is a model in your application
using YourNamespace.Services; // Assuming StudentLoginService is a service in your application

namespace YourNamespace.Controllers
{
    [Route("student")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class StudentLoginController : ControllerBase
    {
        private readonly IStudentLoginService _studentLoginService;

        public StudentLoginController(IStudentLoginService studentLoginService)
        {
            _studentLoginService = studentLoginService;
        }

        [HttpGet]
        public IActionResult GetAll()
        {
            List<StudentLogin> studentLoginList = _studentLoginService.GetAll();
            if (studentLoginList.Count == 0)
            {
                return NoContent();
            }
            return Ok(studentLoginList);
        }

        [HttpPost]
        public IActionResult AddStudent([FromBody] StudentLogin sl)
        {
            _studentLoginService.AddStudent(sl);
            return Ok("Success");
        }

        [HttpPut]
        public IActionResult UpdateStudent([FromBody] StudentLogin sl)
        {
            bool status = _studentLoginService.Update(sl);
            if (status)
            {
                return Ok("Student updated successfully");
            }
            return Ok("Student not found");
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteUser(int id)
        {
            bool status = _studentLoginService.Delete(id);
            if (status)
            {
                return Ok("Student deleted successfully");
            }
            return Ok("Student deleted unsuccessfully");
        }
    }
}

using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;
using YourNamespace.Models; // Assuming University is a model in your application
using YourNamespace.Services; // Assuming UniversityService is a service in your application

namespace YourNamespace.Controllers
{
    [Route("university")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class UniversityController : ControllerBase
    {
        private readonly IUniversityService _universityService;

        public UniversityController(IUniversityService universityService)
        {
            _universityService = universityService;
        }

        [HttpGet]
        public IActionResult GetAll()
        {
            List<University> universityList = _universityService.GetAll();
            if (!universityList.Any())
            {
                return NoContent();
            }
            return Ok(universityList);
        }

        [HttpPost]
        public IActionResult AddUniversity([FromBody] University u)
        {
            bool status = _universityService.AddUniversity(u);
            if (status)
            {
                return Ok("University added successfully");
            }
            return Ok("University not added");
        }

        [HttpPut]
        public IActionResult UpdateUniversity([FromBody] University u)
        {
            bool status = _universityService.Update(u);
            if (status)
            {
                return Ok("University updated successfully");
            }
            return Ok("University not found");
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteUniversity(int id)
        {
            bool status = _universityService.Delete(id);
            if (status)
            {
                return

using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Net;
using YourNamespace.Models; // Assuming IntakeVacancy is a model in your application
using YourNamespace.Services; // Assuming IntakeVacancyService is a service in your application

namespace YourNamespace.Controllers
{
    [Route("intakevacancy")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class IntakeVacancyController : ControllerBase
    {
        private readonly IIntakeVacancyService _intakeVacancyService;

        public IntakeVacancyController(IIntakeVacancyService intakeVacancyService)
        {
            _intakeVacancyService = intakeVacancyService;
        }

        [HttpGet]
        public IActionResult GetAll()
        {
            List<IntakeVacancy> intakeVacancyList = _intakeVacancyService.GetAll();
            if (intakeVacancyList.Count == 0)
            {
                return NoContent();
            }
            return Ok(intakeVacancyList);
        }

        [HttpPost]
        public IActionResult AddUniversity([FromBody] IntakeVacancy i)
        {
            bool status = _intakeVacancyService.AddUniversity(i);
            if (status)
            {
                return Ok("Vacancy added successfully");
            }
            return Ok("Vacancy not added");
        }

        [HttpPut]
        public IActionResult UpdateUniversity([FromBody] IntakeVacancy i)
        {
            bool status = _intakeVacancyService.Update(i);
            if (status)
            {
                return Ok("Vacancy updated successfully");
            }
            return Ok("Vacancy not found");
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteUniversity(int id)
        {
            bool status = _intakeVacancyService.Delete(id);
            if (status)
            {
                return Ok("Vacancy deleted successfully");
            }
            return Ok("Vacancy deleted unsuccessfully");
        }
    }
}

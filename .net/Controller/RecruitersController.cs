using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using YourNamespace.Models; // Assuming Recruiters is a model in your application
using YourNamespace.Services; // Assuming RecruitersService is a service in your application

namespace YourNamespace.Controllers
{
    [Route("recruitment")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class RecruitersController : ControllerBase
    {
        private readonly IRecruitersService _recruitersService;

        public RecruitersController(IRecruitersService recruitersService)
        {
            _recruitersService = recruitersService;
        }

        [HttpPost]
        public IActionResult DriveEntry([FromBody] Recruiters r)
        {
            _recruitersService.DriveEntry(r);
            return Ok("Drive added successfully");
        }

        [HttpGet]
        public List<Recruiters> GetAllOngoingDrives()
        {
            List<Recruiters> recruitersList = _recruitersService.GetDrives();
            return recruitersList;
        }

        [HttpPut]
        public IActionResult UpdateDrive([FromBody] Recruiters r)
        {
            bool status = _recruitersService.Update(r);
            if (status)
            {
                return Ok("Drive updated successfully");
            }
            return Ok("Drive not updated");
        }

        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            bool status = _recruitersService.Delete(id);
            if (status)
            {
                return Ok("Recruitment Drive deleted successfully");
            }
            return Ok("Recruitment Drive not found");
        }
    }
}

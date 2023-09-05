using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using System.Linq;
using System.Net;

namespace UniGuide.Controllers
{
    [Route("college")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class CollegeController : ControllerBase
    {
        private readonly ICollegeService _collegeService;

        public CollegeController(ICollegeService collegeService)
        {
            _collegeService = collegeService;
        }

        [HttpGet]
        public IActionResult GetAll()
        {
            List<College> collegeList = _collegeService.GetAll();
            if (collegeList.Any())
            {
                return Ok(collegeList);
            }
            return NoContent();
        }

        [HttpPost]
        public IActionResult AddUniversity([FromBody] College c)
        {
            bool status = _collegeService.AddUniversity(c);
            if (status)
            {
                return Ok("College added successfully");
            }
            return Ok("College not added");
        }

        [HttpPut]
        public IActionResult UpdateUniversity([FromBody] College c)
        {
            bool status = _collegeService.Update(c);
            if (status)
            {
                return Ok("College updated successfully");
            }
            return Ok("College not found");
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteUniversity(int id)
        {
            bool status = _collegeService.Delete(id);
            if (status)
            {
                return Ok("College deleted successfully");
            }
            return Ok("College deleted unsuccessfully");
        }

        [HttpGet("search/{col}")]
        public IActionResult SearchCollege(string col)
        {
            List<College> collegeList = _collegeService.SearchCollege(col);
            if (collegeList.Any())
            {
                return Ok(collegeList);
            }
            return NoContent();
        }

        [HttpGet("city")]
        public IActionResult GetByCity()
        {
            List<College> collegeList = _collegeService.GetByCity();
            if (collegeList.Any())
            {
                return Ok(collegeList);
            }
            return NoContent();
        }

        [HttpGet("rank")]
        public IActionResult GetByRank()
        {
            List<CollegeRanking> rankingList = _collegeService.GetByRank();
            if (rankingList.Any())
            {
                return Ok(rankingList);
            }
            return NoContent();
        }
    }
}

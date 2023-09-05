using Microsoft.AspNetCore.Mvc;
using System;
using System.Collections.Generic;
using YourNamespace.Models; // Replace with your actual model namespace
using YourNamespace.Services; // Replace with your actual service namespace;

namespace YourNamespace.Controllers
{
    [Route("api/branch")]
    [ApiController]
    public class BranchController : ControllerBase
    {
        private readonly IBranchService _branchService;

        public BranchController(IBranchService branchService)
        {
            _branchService = branchService;
        }

        [HttpGet]
        public IActionResult GetAllBranches()
        {
            var branchList = _branchService.GetAll();
            if (branchList.Count == 0)
            {
                return NoContent();
            }

            return Ok(branchList);
        }

        [HttpPost]
        public IActionResult AddBranch([FromBody] Branch b)
        {
            if (b == null)
            {
                return BadRequest("Invalid branch data");
            }

            bool status = _branchService.Add(b);
            if (status)
            {
                return Ok("Branch added successfully");
            }
            else
            {
                return BadRequest("Failed to add branch");
            }
        }

        [HttpPut]
        public IActionResult UpdateBranch([FromBody] Branch b)
        {
            if (b == null)
            {
                return BadRequest("Invalid branch data");
            }

            bool status = _branchService.Update(b);
            if (status)
            {
                return Ok("Branch updated successfully");
            }
            else
            {
                return BadRequest("Branch not updated");
            }
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteBranch(int id)
        {
            bool status = _branchService.Delete(id);
            if (status)
            {
                return Ok("Branch deleted successfully");
            }
            else
            {
                return NotFound("Branch not found");
            }
        }
    }
}

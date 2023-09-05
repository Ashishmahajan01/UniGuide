using Microsoft.AspNetCore.Mvc;
using System.Collections.Generic;
using YourNamespace.Models; // Assuming UserLogin is a model in your application
using YourNamespace.Services; // Assuming UserLoginService is a service in your application
using System;

namespace YourNamespace.Controllers
{
    [Route("[controller]")]
    [ApiController]
    [EnableCors("AllowAll")] // You can define your CORS policy here
    public class UserLoginController : ControllerBase
    {
        private readonly IUserLoginService _userLoginService;

        public UserLoginController(IUserLoginService userLoginService)
        {
            _userLoginService = userLoginService;
        }

        [HttpPost("registration")]
        public IActionResult AddUser([FromBody] UserLogin ul)
        {
            UserLogin u = _userLoginService.AddUser(ul);
            if (u == null)
            {
                return Ok("fail");
            }
            return Ok("success");
        }

        private string CreateJWTToken()
        {
            var id = Guid.NewGuid().ToString().Replace("-", "");
            var now = DateTime.UtcNow;
            var jwtToken = new JwtSecurityTokenHandler();
            var tokenDescriptor = new SecurityTokenDescriptor
            {
                Subject = new ClaimsIdentity(new[]
                {
                    new Claim(JwtRegisteredClaimNames.Sub, ""),
                    new Claim(JwtRegisteredClaimNames.Jti, id),
                    new Claim(JwtRegisteredClaimNames.Iat, now.ToUniversalTime().ToString(), ClaimValueTypes.Integer64),
                }),
                Expires = now.AddMinutes(30), // Adjust token expiration time as needed
                SigningCredentials = new SigningCredentials(
                    new SymmetricSecurityKey(Encoding.ASCII.GetBytes("YourSecretKey")),
                    SecurityAlgorithms.HmacSha256Signature
                )
            };
            var token = jwtToken.CreateToken(tokenDescriptor);
            return jwtToken.WriteToken(token);
        }

        [HttpPost("login")]
        public IActionResult ValidateUser([FromBody] UserLogin u)
        {
            UserLogin login = _userLoginService.Validate(u);
            string jwtToken = CreateJWTToken();
            if (login != null)
            {
                return Ok(login);
            }
            return NoContent();
        }

        [HttpGet]
        public IActionResult GetAll()
        {
            List<UserLogin> userList = _userLoginService.GetAll();
            if (userList.Count == 0)
            {
                return NoContent();
            }
            return Ok(userList);
        }

        [HttpPut("reset")]
        public IActionResult UpdateUser([FromBody] UserLogin ul)
        {
            bool status = _userLoginService.Update(ul);
            if (status)
            {
                return Ok("success");
            }
            return Ok("User not found");
        }

        [HttpDelete("{id}")]
        public IActionResult DeleteUser(int id)
        {
            bool status = _userLoginService.Delete(id);
            if (status)
            {
                return Ok("user deleted successfully");
            }
            return Ok("user deleted unsuccessfully");
        }
    }
}

package com.uniguide.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uniguide.beans.University;
import com.uniguide.beans.UserLogin;
import com.uniguide.service.UserLoginService;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;

import java.util.Date;
import java.util.List;
import java.util.UUID;



@RestController
@CrossOrigin
public class UserLoginController {
	
	@Autowired
	private UserLoginService userloginservice;
	
	@PostMapping("/registration")
	public ResponseEntity<?> addUser( @RequestBody UserLogin ul) {
		userloginservice.addUser(ul);
		  return ResponseEntity.ok(" user added successfully");
	}
	
	public String createJWTToken() {
        String id = UUID.randomUUID().toString().replace("-", "");
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        JwtBuilder builder = null;
        try {
            builder = Jwts.builder().setId(id).setHeaderParam("typ", "JWT")
                                        .setIssuedAt(now)
                                        .setSubject("");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return builder.compact();
    }

	
	@PostMapping("/login")
	public ResponseEntity<?> validateUser(@RequestBody UserLogin u){
		UserLogin login= userloginservice.validate(u);
		String jwtToken = createJWTToken();
		if(login!=null) {
				return ResponseEntity.ok(jwtToken);
		}	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<UserLogin>> getAll(){
		System.out.println("inside getAll");
		List<UserLogin>ulist=userloginservice.getAll();
		if(ulist.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		return ResponseEntity.ok(ulist);
	}
	
	@PutMapping("/")
	public ResponseEntity<String> updateUser(@RequestBody UserLogin ul){
		boolean status=userloginservice.update(ul);
		if(status)
			return ResponseEntity.ok("user updated successfully");
		
		return ResponseEntity.ok("User not found");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id){
		boolean status=userloginservice.delete(id);
		if(status)
			return ResponseEntity.ok("user deleted succesfully");
		return ResponseEntity.ok("user deleted unsuccesfully");
		
	}
	
	
	
	
	
	

}

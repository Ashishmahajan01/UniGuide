package com.uniguide.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.UserLogin;
import com.uniguide.dao.UserLoginDao;

@Service
public class UserLoginServiceImpl implements UserLoginService{
    
	@Autowired
	private UserLoginDao userlogindao;

	@Override
	public void addUser(UserLogin ul) {
		userlogindao.save(ul);
		
	}

	@Override
	public UserLogin validate(UserLogin u) {
		return userlogindao.getByUsername(u.getEmailId(),u.getPassword());
		
	}

	
	
	
	
	

	
	

}

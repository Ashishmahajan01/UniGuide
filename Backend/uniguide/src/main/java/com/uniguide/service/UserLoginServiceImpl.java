package com.uniguide.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.University;
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

	@Override
	public boolean update(UserLogin ul) {
		
		UserLogin u=userlogindao.getById(ul.getUserId());
		if(u!=null) {
			u.setUserName(ul.getUserName());
			u.setPassword(ul.getPassword());
			u.setEmailId(ul.getEmailId());
			userlogindao.save(u);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<UserLogin> ul=userlogindao.findById(id);
		if(ul.isPresent()) {
			UserLogin u=ul.get();
		userlogindao.delete(u);
		return true;
	}
		return false;
	}
	
	

	
	
	
	
	

	
	

}

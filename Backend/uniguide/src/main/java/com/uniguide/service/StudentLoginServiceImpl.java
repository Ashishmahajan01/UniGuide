package com.uniguide.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.StudentLogin;
import com.uniguide.dao.StudentLoginDao;

@Service
public class StudentLoginServiceImpl implements StudentLoginService{
	
	@Autowired
	private StudentLoginDao studentlogindao;

	@Override
	public void addstudent(StudentLogin sl) {
		studentlogindao.save(sl);
	}
	
	

	
	
	

}

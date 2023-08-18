package com.uniguide.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.StudentLogin;
import com.uniguide.beans.UserLogin;
import com.uniguide.dao.StudentLoginDao;

@Service
public class StudentLoginServiceImpl implements StudentLoginService{
	
	@Autowired
	private StudentLoginDao studentlogindao;

	@Override
	public void addstudent(StudentLogin sl) {
		studentlogindao.save(sl);
	}

	@Override
	public boolean update(StudentLogin sl) {
		StudentLogin s=studentlogindao.getById(sl.getStudId());
		if(s!=null) {
			s.setStudFirstName(sl.getStudFirstName());
			s.setStudLastName(sl.getStudLastName());
			s.setStudQualification(sl.getStudQualification());
			s.setStudEntranceExam(sl.getStudEntranceExam());
			s.setStudCity(sl.getStudCity());
			s.setStudState(sl.getStudState());
			s.setStudExamScore(sl.getStudExamScore());
			studentlogindao.save(s);
			return true;
		}
		return false;
		}

	@Override
	public boolean delete(int id) {
		Optional<StudentLogin> sl=studentlogindao.findById(id);
		if(sl.isPresent()) {
			StudentLogin s=sl.get();
			studentlogindao.delete(s);
		return true;
	}
		return false;
	}
	
	

	
	
	

}

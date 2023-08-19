package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.StudentLogin;

public interface StudentLoginService {


	void addstudent(StudentLogin sl);

	boolean update(StudentLogin sl);

	boolean delete(int id);

	List<StudentLogin> getAll();
	

}

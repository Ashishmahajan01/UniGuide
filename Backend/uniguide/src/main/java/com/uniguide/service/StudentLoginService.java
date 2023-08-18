package com.uniguide.service;

import com.uniguide.beans.StudentLogin;

public interface StudentLoginService {


	void addstudent(StudentLogin sl);

	boolean update(StudentLogin sl);

	boolean delete(int id);
	

}

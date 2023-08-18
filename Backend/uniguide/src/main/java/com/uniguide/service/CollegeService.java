package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.College;
import com.uniguide.beans.University;

public interface CollegeService {

	List<College> getAll();

	boolean addUniversity(College u);

	boolean update(College u);

	boolean delete(int id);

}

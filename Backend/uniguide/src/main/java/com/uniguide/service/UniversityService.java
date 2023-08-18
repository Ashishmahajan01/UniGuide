package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.University;

public interface UniversityService {

	List<University> getAll();

	boolean addUniversity(University u);

	boolean update(University u);

	boolean delete(int id);

}

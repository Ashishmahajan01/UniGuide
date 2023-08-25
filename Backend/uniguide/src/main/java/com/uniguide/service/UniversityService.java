package com.uniguide.service;

import java.util.List;
import java.util.Map;

import com.uniguide.beans.University;

public interface UniversityService {

	List<University> getAll();

	boolean addUniversity(University u);

	boolean update(University u);

	boolean delete(int id);

	Map<String, Integer> getUniversityCount();

}

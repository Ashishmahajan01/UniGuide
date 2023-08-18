package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.IntakeVacancy;
import com.uniguide.beans.Stream;


public interface IntakeVacancyService {

	List<IntakeVacancy> getAll();

	boolean addUniversity(IntakeVacancy i);

	boolean update(IntakeVacancy i);

	boolean delete(int id);

	

}

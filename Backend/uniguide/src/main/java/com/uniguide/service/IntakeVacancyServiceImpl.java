package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.College;
import com.uniguide.beans.IntakeVacancy;
import com.uniguide.beans.Stream;
import com.uniguide.dao.IntakeVacancyDao;

@Service
public class IntakeVacancyServiceImpl implements IntakeVacancyService {
	@Autowired
	private IntakeVacancyDao intakeVacancyDao;

	@Override
	public List<IntakeVacancy> getAll() {
		List<IntakeVacancy> ulist = intakeVacancyDao.findAll();
		if (ulist.isEmpty()) {
			return null;
		}
		return ulist;
	}

	@Override
	public boolean addUniversity(IntakeVacancy i) {
		IntakeVacancy intake = intakeVacancyDao.save(i);
		if (intake != null)
			return true;
		return false;
	}

	@Override
	public boolean update(IntakeVacancy i) {
		IntakeVacancy intake = intakeVacancyDao.getById(i.getInvcId());
		if (intake != null) {
			 		 
			 intake.setInvcDocuments(i.getInvcDocuments());
			 intake.setInvcFees(i.getInvcFees());
			 intake.setInvcSeats(i.getInvcSeats());
			 intake.setInvcVacancy(i.getInvcVacancy());
			 intake.setBrchId(i.getBrchId());
			 intake.setClgId(i.getClgId());
			 intake.setStrmId(i.getStrmId());
			 intakeVacancyDao.save(intake);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<IntakeVacancy> intake = intakeVacancyDao.findById(id);

		if (intake.isPresent()) {
			IntakeVacancy intakev = intake.get();
			intakeVacancyDao.delete(intakev);
			return true;
		}
		return false;
	}

	
}

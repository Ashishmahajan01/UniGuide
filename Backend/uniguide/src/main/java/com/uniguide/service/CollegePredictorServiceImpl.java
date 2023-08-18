package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.CollegePredictor;
import com.uniguide.dao.CollegePredictorDao;

@Service
public class CollegePredictorServiceImpl implements CollegePredictorService{

	@Autowired
	private CollegePredictorDao collegePredictorDao;
	@Override
	public List<CollegePredictor> getAll() {
		List<CollegePredictor> clist=collegePredictorDao.findAll();
		return clist;
	}
	
	@Override
	public boolean add(CollegePredictor c) {
		CollegePredictor co=collegePredictorDao.save(c);
		if(co!=null)
			return true;
		return false;
	}

	@Override
	public boolean update(CollegePredictor c) {
		Optional<CollegePredictor> cor=collegePredictorDao.findById(c.getClgprId());
		if(cor.isPresent()) {
			CollegePredictor coll=cor.get();
			coll.setBrchId(c.getBrchId());
			coll.setClgprEntranceExam(c.getClgprEntranceExam());
			coll.setClgId(c.getClgId());
			coll.setClgprY1(c.getClgprY1());
			coll.setClgprY2(c.getClgprY2());
			coll.setClgprY3(c.getClgprY3());
			coll.setClgprY4(c.getClgprY4());
			coll.setClgprY5(c.getClgprY5());
			coll.setStrmId(c.getStrmId());
			collegePredictorDao.save(coll);
			return true;
			
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<CollegePredictor> c=collegePredictorDao.findById(id);
		if(c.isPresent()) {
			collegePredictorDao.deleteById(id);
			return true;
		}
		return false;
	}
	

}

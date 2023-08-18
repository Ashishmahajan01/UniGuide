package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.Branch;
import com.uniguide.beans.CollegeRanking;
import com.uniguide.dao.CollegeRankingDao;

@Service
public class CollegeRankingServiceImpl implements CollegeRankingService {
	@Autowired
	private CollegeRankingDao collegeRankingDao;

	@Override
	public List<CollegeRanking> getAll() {
		List<CollegeRanking> blist = collegeRankingDao.findAll();
		return blist;
	}

	@Override
	public boolean add(CollegeRanking cr) {
		CollegeRanking crr = collegeRankingDao.save(cr);
		if (crr != null)
			return true;
		return false;
	}

	@Override
	public boolean update(CollegeRanking cr) {
		Optional<CollegeRanking> crr = collegeRankingDao.findById(cr.getRnkId());
		if (crr.isPresent()) {
			CollegeRanking brc = crr.get();
			
			brc.setRnkId(cr.getRnkId());
			brc.setNirfRank(cr.getNirfRank());
			brc.setClgId(cr.getClgId());
			brc.setStrmId(cr.getStrmId());
			
			collegeRankingDao.save(brc);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<CollegeRanking> b = collegeRankingDao.findById(id);
		if (b.isPresent()) {
			collegeRankingDao.deleteById(id);
			return true;
		}
		return false;
	}

}

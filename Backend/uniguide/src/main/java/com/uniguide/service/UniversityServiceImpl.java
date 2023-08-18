package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.University;
import com.uniguide.dao.UniversityDao;

@Service
public class UniversityServiceImpl implements UniversityService {
	@Autowired
	private UniversityDao universityDao;

	public List<University> getAll() {
		List<University> ulist=universityDao.findAll();
		if(ulist.isEmpty()) {
			return null;
		}
		return ulist;
	}

	@Override
	public boolean addUniversity(University u) {
		University uni=universityDao.save(u);
		if(uni!=null)
		return true;
		return false;
	}

	@Override
	public boolean update(University u) {
		University uni=universityDao.getById(u.getUniId());
		if(uni!=null) {
			uni.setUniName(u.getUniName());
			uni.setUniAddress(u.getUniAddress());
			uni.setUniCity(u.getUniCity());
			uni.setUniDescription(u.getUniDescription());
			uni.setUniImg(u.getUniImg());
			uni.setUniRank(u.getUniRank());
			uni.setUniState(u.getUniState());
			
			universityDao.save(uni);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<University> uni=universityDao.findById(id);
		
		if(uni.isPresent()) {
			University univ=uni.get();
		universityDao.delete(univ);
		return true;
	}
		return false;
	}
	
}

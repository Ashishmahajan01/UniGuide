package com.uniguide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.Recruiters;
import com.uniguide.dao.RecruitersDao;

@Service
public class RecruitersServiceImpl implements RecruitersService {
	
	
	@Autowired
	private RecruitersDao recruitersdao;

	@Override
	public void driveEntry(Recruiters r) {
		recruitersdao.save(r);
	}

	@Override
	public List<Recruiters> getDrives() {
		return recruitersdao.findAll();
	}
	
	
	

}

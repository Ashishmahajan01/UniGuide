package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.College;
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

	@Override
	public boolean update(Recruiters r) {

		Recruiters r1 = recruitersdao.getById(r.getRecuId());
		if (r1 != null) {

			r1.setRecuId(r.getRecuId());
			r1.setRecuEndDate(r.getRecuEndDate());
			r1.setRecuJobDesc(r.getRecuJobDesc());
			r1.setRecuJobProfile(r.getRecuJobProfile());
			r1.setRecuLink(r.getRecuLink());
			r1.setRecuName(r.getRecuName());
			r1.setRecuRegDate(r.getRecuRegDate());
			
			recruitersdao.save(r1);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		
		Optional<Recruiters> r = recruitersdao.findById(id);

		if (r.isPresent()) {
			Recruiters rd = r.get();
			recruitersdao.delete(rd);
			return true;
		}
		return false;
	}

}

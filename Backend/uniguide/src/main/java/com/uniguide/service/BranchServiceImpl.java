package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.Branch;
import com.uniguide.dao.BranchDao;

@Service
public class BranchServiceImpl implements BranchService {
	@Autowired
	private BranchDao branchDao;

	@Override
	public List<Branch> getAll() {
		List<Branch> blist = branchDao.findAll();
		return blist;

	}

	@Override
	public boolean add(Branch b) {
		Branch br = branchDao.save(b);
		if (br != null)
			return true;
		return false;
	}

	@Override
	public boolean update(Branch b) {
		Optional<Branch> br = branchDao.findById(b.getBrchId());
		if (br.isPresent()) {
			Branch brc = br.get();
			brc.setBrchName(b.getBrchName());
			brc.setBrchDuration(b.getBrchDuration());
			branchDao.save(brc);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<Branch> b = branchDao.findById(id);
		if (b.isPresent()) {
			branchDao.deleteById(id);
			return true;
		}
		return false;
	}

}

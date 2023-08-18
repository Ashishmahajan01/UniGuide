package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.Branch;

public interface BranchService {
	List<Branch> getAll();

	boolean add(Branch b);

	boolean update(Branch b);

	boolean delete(int id);

}

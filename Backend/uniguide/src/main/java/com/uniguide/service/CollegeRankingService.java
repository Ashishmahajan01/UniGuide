package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.CollegeRanking;

public interface CollegeRankingService {

	List<CollegeRanking> getAll();

	boolean add(CollegeRanking cr);

	boolean update(CollegeRanking cr);

	boolean delete(int id);

}

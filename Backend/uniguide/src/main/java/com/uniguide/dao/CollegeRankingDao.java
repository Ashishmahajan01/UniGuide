package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.CollegeRanking;

@Repository
public interface CollegeRankingDao extends JpaRepository<CollegeRanking, Integer>{

}

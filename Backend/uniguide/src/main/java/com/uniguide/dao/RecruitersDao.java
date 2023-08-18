package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Recruiters;


@Repository
public interface RecruitersDao extends JpaRepository<Recruiters, Integer>{

}

package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.University;

@Repository
public interface UniversityDao extends JpaRepository<University, Integer>{

}

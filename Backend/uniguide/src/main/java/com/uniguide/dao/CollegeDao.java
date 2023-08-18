package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.College;
@Repository
public interface CollegeDao extends JpaRepository<College, Integer> {

}

package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.StudentLogin;

@Repository
public interface StudentLoginDao extends JpaRepository<StudentLogin, Integer> {

	
}

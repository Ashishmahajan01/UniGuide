package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.College;
import com.uniguide.beans.IntakeVacancy;

@Repository
public interface IntakeVacancyDao extends JpaRepository<IntakeVacancy, Integer>{

}

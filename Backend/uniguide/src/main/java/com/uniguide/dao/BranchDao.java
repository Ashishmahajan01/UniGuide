package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Branch;
import com.uniguide.beans.College;

@Repository
public interface BranchDao extends JpaRepository<Branch, Integer>{

}

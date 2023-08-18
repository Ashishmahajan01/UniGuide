package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Stream;

@Repository
public interface StreamDao extends JpaRepository<Stream, Integer>{

}

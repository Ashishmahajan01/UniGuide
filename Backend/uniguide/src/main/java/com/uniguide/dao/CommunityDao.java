package com.uniguide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.Community;

@Repository
public interface CommunityDao extends JpaRepository<Community, Integer> {

}

package com.uniguide.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uniguide.beans.UserLogin;
@Repository
public interface UserLoginDao extends JpaRepository<UserLogin, Integer> {
	@Query(value="select * from user_login where email_id=:emailId and password=:password",nativeQuery = true)
	UserLogin getByUsername(String emailId, String password);

}

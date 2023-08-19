package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.UserLogin;
import com.uniguide.controller.UserLoginController;

public interface UserLoginService {

	void addUser(UserLogin ul );

	UserLogin validate(UserLogin u);

	boolean update(UserLogin ul);

	boolean delete(int id);

	List<UserLogin> getAll();

	

}

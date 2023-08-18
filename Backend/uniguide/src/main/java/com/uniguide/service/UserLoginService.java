package com.uniguide.service;

import com.uniguide.beans.UserLogin;
import com.uniguide.controller.UserLoginController;

public interface UserLoginService {

	void addUser(UserLogin ul );

	UserLogin validate(UserLogin u);

	

}

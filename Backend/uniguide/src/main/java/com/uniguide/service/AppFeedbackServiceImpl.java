package com.uniguide.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.AppFeedback;
import com.uniguide.dao.AppFeedbackDao;

@Service
public class AppFeedbackServiceImpl  implements AppFeedbackService{
	
		@Autowired
		private AppFeedbackDao appfeedbackdao;

		@Override
		public void giveFeedback(AppFeedback fb) {
			appfeedbackdao.save(fb);
		}

		
		//select user_login.user_name , app_feedback.appfeed_desc ,app_feedback.appfeed_date,app_feedback.appfeed_rating from user_login 
		//inner join app_feedback on user_login.user_id=app_feedback.user_id
		// here whole data get's printed including user login table and its feedback 
		
		@Override
		public List<AppFeedback> getfeedback() {
			return appfeedbackdao.findAll();
		}
		
		
}

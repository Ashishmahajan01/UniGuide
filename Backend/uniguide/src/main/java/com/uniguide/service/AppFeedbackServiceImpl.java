package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.AppFeedback;
import com.uniguide.beans.UserLogin;
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


		@Override
		public boolean update(AppFeedback fb) {
			
			AppFeedback f=appfeedbackdao.getById(fb.getAppfeedId());
			if(f!=null) {
				f.setAppfeedDesc(fb.getAppfeedDesc());
				f.setAppfeedRating(fb.getAppfeedRating());
				appfeedbackdao.save(f);
				return true;
			}
			return false;
		}


		@Override
		public boolean delete(int id) {
			Optional<AppFeedback> f=appfeedbackdao.findById(id);
			if(f.isPresent()) {
				AppFeedback fd=f.get();
				appfeedbackdao.delete(fd);
			return true;
		}
			return false;
		}
		
		
}

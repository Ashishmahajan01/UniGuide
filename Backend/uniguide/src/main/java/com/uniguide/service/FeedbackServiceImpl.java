package com.uniguide.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.Feedback;
import com.uniguide.dao.FeedbackDao;

@Service
public class FeedbackServiceImpl  implements FeedbackService{
		@Autowired
		private FeedbackDao feedbackdao;

		@Override
		public void giveFeedback(Feedback fb) {
			feedbackdao.save(fb);
			
		}
		
		
}

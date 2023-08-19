package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.AppFeedback;
import com.uniguide.beans.Event;
import com.uniguide.beans.Feedback;
import com.uniguide.beans.UserLogin;
import com.uniguide.dao.FeedbackDao;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	private FeedbackDao feedbackdao;

	@Override
	public void giveFeedback(Feedback fb) {
		feedbackdao.save(fb);

	}



	@Override
	public boolean delete(int id) {
		Optional<Feedback> f = feedbackdao.findById(id);
		if (f.isPresent()) {
			Feedback fb = f.get();
			feedbackdao.delete(fb);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Feedback fb) {
		
		Feedback f=feedbackdao.getById(fb.getFeedId());
		if(f!=null) {
			f.setFeedDesc(fb.getFeedDesc());
			f.setFeedRating(fb.getFeedRating());
			feedbackdao.save(f);
			return true;
		}
		
		return false;
	}



	@Override
	public List<Feedback> getFeedbacks() {
		List<Feedback> flist=feedbackdao.findAll();
		return flist;
		
	}

}

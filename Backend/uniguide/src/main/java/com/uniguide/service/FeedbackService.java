package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.AppFeedback;
import com.uniguide.beans.Feedback;

public interface FeedbackService {

	void giveFeedback(Feedback fb);

	

	boolean delete(int id);



	boolean update(Feedback fb);



	List<Feedback> getFeedbacks();



	

}

package com.uniguide.service;

import com.uniguide.beans.AppFeedback;
import com.uniguide.beans.Feedback;

public interface FeedbackService {

	void giveFeedback(Feedback fb);

	boolean update(Feedback fb);

	boolean delete(int id);

}

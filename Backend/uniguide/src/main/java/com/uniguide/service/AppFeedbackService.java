package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.AppFeedback;
import com.uniguide.beans.Event;

public interface AppFeedbackService {

	void giveFeedback(AppFeedback fb);

	List<AppFeedback> getfeedback();

	boolean update(AppFeedback fb);

	boolean delete(int id);

	List<AppFeedback> getRecentFeedbacks();



}

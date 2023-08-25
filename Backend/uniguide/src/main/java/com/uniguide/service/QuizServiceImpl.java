package com.uniguide.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uniguide.beans.Quiz;
import com.uniguide.dao.QuizDao;

@Service
public class QuizServiceImpl implements QuizService{

	@Autowired
	private QuizDao quizDao;
	
	
	@Override
	public List<Quiz> getAll() {
		List<Quiz> qlist=quizDao.findAll();
		if(qlist.isEmpty()) {
			return null;
		}
		return qlist;
	}


	@Override
	public boolean addQuestion(Quiz q) {
		Quiz q1=quizDao.save(q);
		if(q1!=null)
		return true;
		return false;
	}


	@Override
	public boolean update(Quiz q) {
		Quiz q1=quizDao.getById(q.getQueId());
		if(q1!=null) {
			q1.setQueBody(q.getQueBody());
			q1.setQueOpt1(q.getQueOpt1());
			q1.setQueOpt2(q.getQueOpt2());
			q1.setQueOpt3(q.getQueOpt3());
			q1.setQueOpt4(q.getQueOpt4());
			q1.setQueAns(q.getQueAns());
			q1.setQueType(q.getQueType());
			
			
			quizDao.save(q1);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int id) {
		Optional<Quiz> q=quizDao.findById(id);
		
		if(q.isPresent()) {
			Quiz q1=q.get();
			quizDao.delete(q1);
		return true;
	}
		return false;
	}
	
}

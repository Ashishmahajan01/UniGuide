package com.uniguide.service;

import java.util.List;

import com.uniguide.beans.Quiz;

public interface QuizService {

	List<Quiz> getAll();

	boolean addQuestion(Quiz q);

	boolean update(Quiz q);

	boolean delete(int id);

}

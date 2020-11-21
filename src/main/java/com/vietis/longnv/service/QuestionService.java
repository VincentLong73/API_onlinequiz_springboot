package com.vietis.longnv.service;

import java.util.List;

import com.vietis.longnv.entity.Question;
import com.vietis.longnv.model.QuestionDTO;

public interface QuestionService {

	public void addQuestion(Question question);

	public void deleteQuestion(int id);

	public void updateQuestion(Question question);
	
	public QuestionDTO getQuestion(int id);

	public QuestionDTO getQuestionByContent(String content);
	
	public QuestionDTO findById(int id);

	public List<QuestionDTO> getListQuestionByRandom(int limit);
	
	public List<QuestionDTO> getListQuestionByIdLevel(int idLevel);
	
}

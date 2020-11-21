package com.vietis.longnv.service;

import java.util.List;

import com.vietis.longnv.model.QuestionAnswerDTO;

public interface QuestionAnswerService {
	
	public List<QuestionAnswerDTO> getListQuestionAnswerByIdQuestion(int idQuestion);
	
	public List<QuestionAnswerDTO> getQuestionAnswerByIdQuestion(int idQuestion);
	
	public void update(QuestionAnswerDTO questionAnswerDTO);

}

package com.vietis.longnv.service;

import com.vietis.longnv.entity.Answer;
import com.vietis.longnv.model.AnswerDTO;

public interface AnswerService {
	
	public AnswerDTO getAnswerByContent(String content);
	
	public void addAnswer(Answer answer);
	
	public void updateAnswer(Answer answer);
	
	public void deleteAnswer(int id);

	public AnswerDTO getAnswer(int id);

}

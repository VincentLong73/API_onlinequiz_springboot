package com.vietis.longnv.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.vietis.longnv.entity.Question;
import com.vietis.longnv.model.QuestionDTO;

public class QuestionEntity2DTO {
	
	@Autowired
	ModelMapper modelMapper;
	
	AnswerEntity2DTO answerConvert = new AnswerEntity2DTO();

	public QuestionDTO convert1Question(Question question) {
		
		QuestionDTO questionDto = new QuestionDTO();
		
		questionDto.setAnswerDtos(answerConvert.converListAnswer(question.getAnswers()));
		
		questionDto = modelMapper.map(question, QuestionDTO.class);
		
		return questionDto;
	}
	
	public List<QuestionDTO> convertListQuestion(List<Question> questions){
		
		
		List<QuestionDTO> questionDtos = new ArrayList<QuestionDTO>();
		
		for(Question question : questions) {
			
			questionDtos.add(convert1Question(question));
		}
		
		return questionDtos;
		
	}

}

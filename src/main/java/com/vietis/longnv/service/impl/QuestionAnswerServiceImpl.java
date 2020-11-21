package com.vietis.longnv.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vietis.longnv.entity.QuestionAnswer;
import com.vietis.longnv.model.QuestionAnswerDTO;
import com.vietis.longnv.repository.QuestionAnswerRepository;
import com.vietis.longnv.service.QuestionAnswerService;

@Service
public class QuestionAnswerServiceImpl implements QuestionAnswerService {
	
	@Autowired
	QuestionAnswerRepository questionAnswerRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public List<QuestionAnswerDTO> getListQuestionAnswerByIdQuestion(int idQuestion) {
		
		List<QuestionAnswer> questionAnswers = questionAnswerRepository.findByIdQuestionAndIsCorrect(idQuestion);
		List<QuestionAnswerDTO> questionAnswerDtos = new ArrayList<>();
		for(QuestionAnswer questionAnswer : questionAnswers) {
			
			questionAnswerDtos.add(modelMapper.map(questionAnswer, QuestionAnswerDTO.class));
		}
		return questionAnswerDtos;
	}

	@Override
	public List<QuestionAnswerDTO> getQuestionAnswerByIdQuestion(int idQuestion) {
		List<QuestionAnswer> questionAnswers = questionAnswerRepository.findByIdQuestion(idQuestion);
		List<QuestionAnswerDTO> questionAnswerDtos = new ArrayList<>();
		for(QuestionAnswer questionAnswer : questionAnswers) {
			
			questionAnswerDtos.add(modelMapper.map(questionAnswer, QuestionAnswerDTO.class));
		}
		return questionAnswerDtos;
	}

	@Override
	public void update(QuestionAnswerDTO questionAnswerDTO) {
		
		questionAnswerRepository.save(modelMapper.map(questionAnswerDTO, QuestionAnswer.class));
		
	}

}

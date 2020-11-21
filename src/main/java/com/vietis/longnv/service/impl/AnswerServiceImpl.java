package com.vietis.longnv.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vietis.longnv.entity.Answer;
import com.vietis.longnv.model.AnswerDTO;
import com.vietis.longnv.repository.AnswerRepository;
import com.vietis.longnv.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService{
	
	@Autowired
	AnswerRepository answerRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public AnswerDTO getAnswerByContent(String content) {
		
		Answer answer = answerRepository.findByContent(content);
		
		return modelMapper.map(answer, AnswerDTO.class);
	}

	@Override
	public void addAnswer(Answer answer) {
		
		
		if(answer==null) {
			
			answerRepository.saveAndFlush(answer);
		}
		
	}

	

	@Override
	public void deleteAnswer(int id) {
		
		Answer answer = answerRepository.getOne(id);
		if(answer!=null) {
			answerRepository.delete(answer);
		}
		
	}

	@Override
	public void updateAnswer(Answer answer) {
		
		answerRepository.save(answer);
		
	}

	@Override
	public AnswerDTO getAnswer(int id) {
		
		Answer answer = answerRepository.getOne(id);
		return modelMapper.map(answer, AnswerDTO.class);
	}

}

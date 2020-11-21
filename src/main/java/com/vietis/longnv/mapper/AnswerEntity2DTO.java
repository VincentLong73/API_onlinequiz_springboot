package com.vietis.longnv.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import com.vietis.longnv.entity.Answer;
import com.vietis.longnv.model.AnswerDTO;

public class AnswerEntity2DTO {
	
	@Autowired
	ModelMapper modelMapper;

	public AnswerEntity2DTO () {
		
	}
	
	public AnswerDTO convert1Answer(Answer answer) {
		
		return modelMapper.map(answer, AnswerDTO.class);
		
	}
	
	public List<AnswerDTO> converListAnswer(List<Answer> answers){
		
		java.lang.reflect.Type AnswerDtoTypeList = new TypeToken<List<AnswerDTO>>() {}.getType();
		
		return  modelMapper.map(answers, AnswerDtoTypeList);	
	}

}

package com.vietis.longnv.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDTO {

	private int id;
	private String content;
	private int idLevel;
	private List<AnswerDTO> answerDtos;
	//private List<TestDTO> tests;
	
	public QuestionDTO(String content, int idLevel) {

		this.content = content;
		this.idLevel = idLevel;
	}
}

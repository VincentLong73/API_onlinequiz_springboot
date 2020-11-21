package com.vietis.longnv.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestDTO {

	private int id;

	private String name;
	
	private Date timeOut;

	private int status;
	
	private int mark;
	
	private List<QuestionDTO> questionDtos;

	public TestDTO(String name) {

		this.name = name;
	}

}

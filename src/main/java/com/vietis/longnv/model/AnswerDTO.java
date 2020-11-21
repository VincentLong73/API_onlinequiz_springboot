package com.vietis.longnv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerDTO {
	
	private int id;
	private String content;

	
	public AnswerDTO(String content) {
		super();
		this.content = content;
	}

}

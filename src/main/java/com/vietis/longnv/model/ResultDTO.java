package com.vietis.longnv.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO {

	private int id;

	private int status;

	private int score;

	private String choice;
	
	private int idTest;
	
	private int idQuestion;

}

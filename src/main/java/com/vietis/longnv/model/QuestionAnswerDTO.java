package com.vietis.longnv.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class QuestionAnswerDTO {

	private int id;

	private int idQuestion;

	private int idAnswer;

	private int isCorrect;
}

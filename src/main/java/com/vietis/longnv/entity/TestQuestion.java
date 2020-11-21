package com.vietis.longnv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="test_question")
public class TestQuestion {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="id_question")
	private int idQuestion;
	
	@Column(name="id_test")
	private int idTest;
	
}

package com.vietis.longnv.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="question")
public class Question implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="id_level")
	private int idLevel;
	
	@Column(name="content")
	private String content;
	
	@ManyToMany(cascade = { CascadeType.DETACH,
							CascadeType.MERGE,
							CascadeType.PERSIST,
							CascadeType.REFRESH },fetch = FetchType.LAZY)
	@JoinTable(name="question_answer", joinColumns = @JoinColumn(name="id_question"),
										inverseJoinColumns = @JoinColumn(name="id_answer"))
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<Answer> answers;
	
	@ManyToMany(mappedBy = "questions")
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	private List<Test> tests;
	
	

}

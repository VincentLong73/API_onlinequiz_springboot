package com.vietis.longnv.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vietis.longnv.entity.QuestionAnswer;

public class QuestionAnswerRepositoryImpl {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<QuestionAnswer> findByIdQuestionAndIsCorrect(int idQuestion){
		
		return entityManager.createQuery("select questionAnswer from QuestionAnswer questionAnswer where questionAnswer.isCorrect = 1 and questionAnswer.idQuestion = ?1 ", QuestionAnswer.class)
				.setParameter(1, idQuestion)
				.getResultList();
		
		
	}

}

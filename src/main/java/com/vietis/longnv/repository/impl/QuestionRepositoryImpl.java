package com.vietis.longnv.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.vietis.longnv.entity.Question;

public class QuestionRepositoryImpl {
	
	@PersistenceContext
	EntityManager entityManager;

	public List<Question> getListQuestionByRandom(int limit){
	return entityManager.createQuery("select ques from Question ques order by rand()", Question.class)
						.setMaxResults(limit)
						.setFirstResult(0)
						.getResultList();
	}
	public void deleteQuestionInTestQuestion(int idQuestion) {
		
		Query query = entityManager.createQuery("delete from TestQuestion testQuestion where testQuestion.idQuestion = ?1");
		query.setParameter(1, idQuestion);
		query.executeUpdate();
		
	}
	public void deleteQuestionInQuestionAnswer(int idQuestion) {
		
		Query query = entityManager.createQuery("delete from QuestionAnswer questionAnswer where questionAnswer.idQuestion = ?1");
			query.setParameter(1, idQuestion);
			query.executeUpdate();
	}

}

package com.vietis.longnv.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.vietis.longnv.entity.Test;

public class TestRepositoryImpl {
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	public List<Test> getListTestByRandom(int limit){
		
		return entityManager.createQuery("select test from Test test where test.assign is null order by rand()", Test.class)
					.setMaxResults(limit)
					.setFirstResult(0)
					.getResultList();
	}
	
	public void deleteQuestion(int idTest,int idQuestion) {
		
		Query query = entityManager.createQuery("delete from TestQuestion testQuestion where testQuestion.idTest = ?1 and testQuestion.idQuestion = ?2");
					query.setParameter(1, idTest);
					query.setParameter(2, idQuestion);
					query.executeUpdate();
	}
	
	public List<Test> getListTestByIdAssign(int idAssign){
		
		return entityManager.createQuery("select test from Test test where test.assign.id = ?1", Test.class)
							.setParameter(1, idAssign)
							.getResultList();
	}
	
	public List<Integer> CalculatorMark(int idTest) {
		
		StringBuilder str = new StringBuilder("select result.score from Result result ");
		str.append("join result.testQuestion tQuestion ");
		str.append("where tQuestion.idTest = ?1");
		
		return  entityManager.createQuery(str.toString(), Integer.class).setParameter(1, idTest).getResultList();
	}

}

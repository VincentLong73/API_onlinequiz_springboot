
package com.vietis.longnv.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.vietis.longnv.entity.Result;

public class ResultRepositoryImpl {
	
	@PersistenceContext
	EntityManager entityManager;

	public List<Result> findByIdTest(int idTest){
		
		return entityManager.createQuery("select result from Result result where result.testQuestion.idTest = ?1", Result.class)
				.setParameter(1, idTest)
				.getResultList();
		
	}
}

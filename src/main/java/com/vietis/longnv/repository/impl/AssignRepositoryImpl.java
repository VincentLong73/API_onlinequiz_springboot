package com.vietis.longnv.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.vietis.longnv.entity.Assign;

public class AssignRepositoryImpl {

	@PersistenceContext
	EntityManager entityManager;

	public List<Assign> findByIdStudent(int idStudent) {

		return entityManager.createQuery("select assign from Assign assign where assign.user.id = ?1", Assign.class)
				.setParameter(1, idStudent).getResultList();
	}

	public void updateTestIdAssign2Null(int idAssign) {

		Query query = entityManager
				.createQuery("update Test test set test.assign.id = null where test.assign.id = ?1");

		query.setParameter(1, idAssign);

		query.executeUpdate();
	}
	
	public List<Assign> findByIdStudentIsNull(){
		
		return entityManager.createQuery("select assign from Assign assign where assign.user.id is null", Assign.class)
				.getResultList();
		
	}
	
	public void updateAssign_idStudent(int id, int idStudent) {
		
		Query query = entityManager
				.createQuery("update Assign assign set assign.user.id = ?1 where assign.id = ?2");

		query.setParameter(1, idStudent);
		
		query.setParameter(2, id);

		query.executeUpdate();
	}

}

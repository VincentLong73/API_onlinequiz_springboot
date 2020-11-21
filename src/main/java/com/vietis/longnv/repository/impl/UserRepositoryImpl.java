package com.vietis.longnv.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.vietis.longnv.entity.User;

public class UserRepositoryImpl {

	@PersistenceContext
	EntityManager entityManager;
	

	public void updateAssignIdStudentToNull(int idStudent) {

		Query query = entityManager
				.createQuery("update Assign assign set assign.user.id = null where assign.user.id = ?1");

		query.setParameter(1, idStudent);

		query.executeUpdate();

	}

	public List<User> findByIdRole(int idRole) {

		 return entityManager.createQuery("select user from User user where user.role.id = ?1", User.class)
				 .setParameter(1, idRole).getResultList();
	}
	
	public List<User> findTeacherAndStudent() {

		 return entityManager.createQuery("select user from User user where user.role.id = 1 or user.role.id = 2", User.class)
				 .getResultList();
	}
	

}

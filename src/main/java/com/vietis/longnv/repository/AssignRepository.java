package com.vietis.longnv.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vietis.longnv.entity.Assign;

@Repository
@Transactional
public interface AssignRepository extends JpaRepository<Assign, Integer>{

	Assign findByName(String name);
	
	List<Assign> findByIdStudent(int idStudent);
	
	void updateTestIdAssign2Null(int idAssign);
	
	List<Assign> findAssignByName(String name);
	
	List<Assign> findByIdStudentIsNull();
	
	void updateAssign_idStudent(int id, int idStudent);
}

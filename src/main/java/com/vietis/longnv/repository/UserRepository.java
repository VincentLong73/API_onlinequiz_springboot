package com.vietis.longnv.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vietis.longnv.entity.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Integer>{
	
	List<User> findByIdRole(int idRole);
	
	List<User> findTeacherAndStudent();
	
	void updateAssignIdStudentToNull(int idStudent);
	
	User findByUserName(String username);
	

}

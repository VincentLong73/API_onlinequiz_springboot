package com.vietis.longnv.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vietis.longnv.entity.Test;


@Repository
@Transactional
public interface TestRepository extends JpaRepository<Test, Integer>{

	List<Test> getListTestByRandom(int limit);
	
	List<Test> getListTestByIdAssign(int idAssign);
	
	void deleteQuestion(int idTest,int idQuestion);
	
	List<Integer> CalculatorMark(int idTest);
	
	List<Test> findByStatus(int status);
	
	//@Query("select test from Test test where test.name = ?strName")
	List<Test> findTestByName(String name);
}

package com.vietis.longnv.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vietis.longnv.entity.TestQuestion;


@Repository
@Transactional
public interface TestQuestionRepository extends JpaRepository<TestQuestion, Integer>{

	TestQuestion findByIdQuestionAndIdTest(int idQuestion,int idTest);
}

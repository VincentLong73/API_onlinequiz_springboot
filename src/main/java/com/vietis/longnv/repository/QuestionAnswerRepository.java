package com.vietis.longnv.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vietis.longnv.entity.QuestionAnswer;

@Repository
@Transactional
public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Integer>{

	List<QuestionAnswer> findByIdQuestion(int idQuestion);
	
	List<QuestionAnswer> findByIdQuestionAndIsCorrect(int idQuestion);
}

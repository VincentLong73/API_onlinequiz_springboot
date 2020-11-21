package com.vietis.longnv.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vietis.longnv.entity.Question;

@Repository
@Transactional
public interface QuestionRepository extends JpaRepository<Question, Integer>{

	Question findByContent(String content);
	
	List<Question> getListQuestionByRandom(int limit);
	
	List<Question> findByIdLevel(int idLevel);
	
	void deleteQuestionInTestQuestion(int idQuestion);
	
	void deleteQuestionInQuestionAnswer(int idQuestion);
}

package com.vietis.longnv.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vietis.longnv.entity.Answer;

@Repository
@Transactional
public interface AnswerRepository extends JpaRepository<Answer, Integer>{

	Answer findByContent(String content);
}

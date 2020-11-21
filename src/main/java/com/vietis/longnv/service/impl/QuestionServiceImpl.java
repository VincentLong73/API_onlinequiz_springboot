package com.vietis.longnv.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vietis.longnv.entity.Answer;
import com.vietis.longnv.entity.Question;
import com.vietis.longnv.model.AnswerDTO;
import com.vietis.longnv.model.QuestionDTO;
import com.vietis.longnv.repository.QuestionRepository;
import com.vietis.longnv.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;
	
	@Autowired
	ModelMapper modelMapper;


	@Override
	public void addQuestion(Question question) {

		questionRepository.saveAndFlush(question);

	}

	@Override
	public void deleteQuestion(int id) {

		Question ques = questionRepository.getOne(id);

		if (ques != null) {
			questionRepository.deleteQuestionInTestQuestion(id);
			questionRepository.deleteQuestionInQuestionAnswer(id);
			questionRepository.deleteById(id);
		}

	}

	@Override
	public void updateQuestion(Question question) {


			questionRepository.save(question);

	}

	@Override
	public QuestionDTO getQuestion(int id) {

		Question question = questionRepository.getOne(id);
		QuestionDTO questionDto = modelMapper.map(question, QuestionDTO.class);
		List<Answer> answers = question.getAnswers();
		List<AnswerDTO> answerDtos = new ArrayList<AnswerDTO>();
		for(Answer answer : answers) {
			answerDtos.add(modelMapper.map(answer, AnswerDTO.class));
		}
		questionDto.setAnswerDtos(answerDtos);
		
		return questionDto;
	}

	@Override
	public QuestionDTO getQuestionByContent(String content) {

		Question question = questionRepository.findByContent(content);

		QuestionDTO questionDto = modelMapper.map(question, QuestionDTO.class);
		List<Answer> answers = question.getAnswers();
		List<AnswerDTO> answerDtos = new ArrayList<AnswerDTO>();
		for(Answer answer : answers) {
			answerDtos.add(modelMapper.map(answer, AnswerDTO.class));
		}
		questionDto.setAnswerDtos(answerDtos);
		return questionDto;
	}

	@Override
	public List<QuestionDTO> getListQuestionByRandom(int limit) {

		List<Question> questions = questionRepository.getListQuestionByRandom(limit);

		List<QuestionDTO> questionDtos = new ArrayList<QuestionDTO>();

		for (Question question : questions) {

			QuestionDTO questionDto = modelMapper.map(question, QuestionDTO.class);
			List<Answer> answers = question.getAnswers();
			List<AnswerDTO> answerDtos = new ArrayList<AnswerDTO>();
			for(Answer answer : answers) {
				answerDtos.add(modelMapper.map(answer, AnswerDTO.class));
			}
			questionDto.setAnswerDtos(answerDtos);

			questionDtos.add(questionDto);
		}

		return questionDtos;
	}

	@Override
	public List<QuestionDTO> getListQuestionByIdLevel(int idLevel) {


		List<Question> questions = questionRepository.findByIdLevel(idLevel);
		List<QuestionDTO> questionDtos = new ArrayList<QuestionDTO>();
		for(Question question : questions) {
			QuestionDTO questionDto = modelMapper.map(question, QuestionDTO.class);
			List<Answer> answers = question.getAnswers();
			List<AnswerDTO> answerDtos = new ArrayList<AnswerDTO>();
			for(Answer answer : answers) {
				answerDtos.add(modelMapper.map(answer, AnswerDTO.class));
			}
			questionDto.setAnswerDtos(answerDtos);

			questionDtos.add(questionDto);
		}
		
		
		return questionDtos;
	}
	
	@Override
	public QuestionDTO findById(int id){
		
		Question question = questionRepository.getOne(id);
		QuestionDTO questionDto = modelMapper.map(question, QuestionDTO.class);
		List<Answer> answers = question.getAnswers();
		List<AnswerDTO> answerDtos = new ArrayList<AnswerDTO>();
		for(Answer answer : answers) {
			answerDtos.add(modelMapper.map(answer, AnswerDTO.class));
		}
		questionDto.setAnswerDtos(answerDtos);
		return questionDto;
	}


}

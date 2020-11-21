package com.vietis.longnv.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vietis.longnv.entity.QuestionAnswer;
import com.vietis.longnv.entity.Result;
import com.vietis.longnv.entity.Test;
import com.vietis.longnv.entity.TestQuestion;
import com.vietis.longnv.model.ResultDTO;
import com.vietis.longnv.repository.QuestionAnswerRepository;
import com.vietis.longnv.repository.ResultRepository;
import com.vietis.longnv.repository.TestQuestionRepository;
import com.vietis.longnv.repository.TestRepository;
import com.vietis.longnv.service.ResultService;


@Service
public class ResultServiceImpl implements ResultService{
	
	@Autowired
	ResultRepository resultRepository;
	
	@Autowired
	TestQuestionRepository testQuestionRepository;
	
	@Autowired
	QuestionAnswerRepository questionAnswerRepository;
	
	@Autowired
	TestRepository testRepository;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public void addResult(ResultDTO resultDto) {
		
		
		
		Test test = testRepository.getOne(resultDto.getIdTest());
		test.setStatus(1);
		testRepository.save(test);
		
		Result result = new Result();
		TestQuestion testQuestion = testQuestionRepository.findByIdQuestionAndIdTest(resultDto.getIdQuestion(), resultDto.getIdTest());
		
		List<QuestionAnswer> questionAnswers = questionAnswerRepository.findByIdQuestion(testQuestion.getIdQuestion());
		List<QuestionAnswer> questionAnswerCorrects = new ArrayList<QuestionAnswer>();
		
		for(QuestionAnswer questionAnswer : questionAnswers) {
			
			if(questionAnswer.getIsCorrect()==1) {
				questionAnswerCorrects.add(questionAnswer);
			}
		}
		
		if(new StringTokenizer(resultDto.getChoice(),",").countTokens() == 0) {
			
			result.setStatus(2);
			result.setScore(0);
			
		}else if(questionAnswerCorrects.size() != (new StringTokenizer(resultDto.getChoice(),",")).countTokens()) {
			result.setStatus(0);
			result.setScore(0);
		}else {
			
			
			StringTokenizer st = new StringTokenizer(resultDto.getChoice(),",");
			int count = 0;
			while(st.hasMoreTokens()) {
				
				int answerChoice = Integer.parseInt(st.nextToken());
				for(QuestionAnswer questionAnswer : questionAnswerCorrects) {
					
					if(questionAnswer.getIdAnswer() == answerChoice) {
						count++;
					}
				}
				
			}
			
			
			
			if(count == (new StringTokenizer(resultDto.getChoice(),",")).countTokens()) {
				result.setScore(1);
				result.setStatus(1);
			}else {
				result.setScore(0);
				result.setStatus(0);
			}
		}
		
		result.setChoice(resultDto.getChoice());
		result.setTestQuestion(testQuestion);
		
		
		resultRepository.saveAndFlush(result);
		
		
	}

	@Override
	public void updateResult(Result result) {
		
		resultRepository.save(result);
		
	}

	@Override
	public void deleteResult(int id) {
		
		resultRepository.deleteById(id);
		
	}

	@Override
	public List<ResultDTO> getListResultByIdTest(int idTest) {
		
		List<Result> results = resultRepository.findByIdTest(idTest);
		List<ResultDTO> resultDtos = new ArrayList<>();
		
		for(Result result : results) {
			ResultDTO resultDto =  modelMapper.map(result, ResultDTO.class);
			resultDto.setIdQuestion(result.getTestQuestion().getIdQuestion());
			resultDto.setIdTest(result.getTestQuestion().getIdTest());
			resultDtos.add(resultDto);
		}
		
		
		return resultDtos;
	}

}

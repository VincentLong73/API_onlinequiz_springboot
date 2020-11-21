package com.vietis.longnv.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vietis.longnv.entity.Answer;
import com.vietis.longnv.entity.Assign;
import com.vietis.longnv.entity.Question;
import com.vietis.longnv.entity.Test;
import com.vietis.longnv.mapper.AssignEntity2DTO;
import com.vietis.longnv.model.AnswerDTO;
import com.vietis.longnv.model.AssignDTO;
import com.vietis.longnv.model.QuestionDTO;
import com.vietis.longnv.model.TestDTO;
import com.vietis.longnv.repository.AssignRepository;
import com.vietis.longnv.repository.TestRepository;
import com.vietis.longnv.service.AssignService;

@Service
public class AssignServiceImpl implements AssignService {

	@Autowired
	AssignRepository assignRepository;

	@Autowired
	TestRepository testRepository;

	@Autowired
	ModelMapper modelMapper;

	// @Autowired
	AssignEntity2DTO assignEntity2DTO = new AssignEntity2DTO();

	@SuppressWarnings("unchecked")
	@Override
	public AssignDTO getAssignByName(String name) {

		Assign assign = assignRepository.findByName(name);

		AssignDTO assignDto = new AssignDTO();

		if (assign != null) {

			assignDto = modelMapper.map(assign, AssignDTO.class);

			List<Test> tests = assign.getTests();
			List<TestDTO> testDtos = new ArrayList<TestDTO>();

			// testDtos = (List<TestDTO>) modelMapper.map(tests, TestDTO.class);

			for (Test test : tests) {

				TestDTO testDto = modelMapper.map(test, TestDTO.class);

				List<Question> questions = test.getQuestions();

				List<QuestionDTO> quesitonDtos = new ArrayList<QuestionDTO>();
				for (Question question : questions) {

					QuestionDTO questionDto = modelMapper.map(question, QuestionDTO.class);

					List<Answer> answers = question.getAnswers();
					List<AnswerDTO> answerDtos = new ArrayList<AnswerDTO>();

					answerDtos = (List<AnswerDTO>) modelMapper.map(answers, AnswerDTO.class);

//					for (Answer answer : answers) {
//
//						AnswerDTO answerDto = modelMapper.map(answer,AnswerDTO.class);
//						answerDtos.add(answerDto);
//					}

					questionDto.setAnswerDtos(answerDtos);

					quesitonDtos.add(questionDto);
				}
				testDto.setQuestionDtos(quesitonDtos);
				testDtos.add(testDto);
			}

			assignDto.setTestDtos(testDtos);

		}

		return assignDto;
	}

	@Override
	public void addAssign(Assign assign, int numberOfTest) {

		assignRepository.saveAndFlush(assign);

		Assign assign1 = assignRepository.findByName(assign.getName());
		List<Test> tests = testRepository.getListTestByRandom(numberOfTest);
		for (Test test : tests) {
			test.setAssign(assign1);
		}
		assign1.setTests(tests);

		assignRepository.save(assign1);

	}

	@Override
	public void updateAssign(Assign assign) {

		assignRepository.save(assign);

	}

	@Override
	public void deleteAssign(int id) {

		assignRepository.updateTestIdAssign2Null(id);

		assignRepository.deleteById(id);

	}

	@Override
	public AssignDTO getAssign(int id) {

		Assign assign = assignRepository.getOne(id);
		AssignDTO assignDto = new AssignDTO();

		// assignDto = assignEntity2DTO.convert1Assign(assign);

		if (assign != null) {

			assignDto = modelMapper.map(assign, AssignDTO.class);

			List<Test> tests = assign.getTests();
			List<TestDTO> testDtos = new ArrayList<TestDTO>();

			for (Test test : tests) {

				TestDTO testDto = modelMapper.map(test, TestDTO.class);

				List<Question> questions = test.getQuestions();

				List<QuestionDTO> quesitonDtos = new ArrayList<QuestionDTO>();

				for (Question question : questions) {

					QuestionDTO questionDto = modelMapper.map(question, QuestionDTO.class);

					List<Answer> answers = question.getAnswers();
					List<AnswerDTO> answerDtos = new ArrayList<AnswerDTO>();

					java.lang.reflect.Type AnswerDtoTypeList = new TypeToken<List<AnswerDTO>>() {
					}.getType();

					answerDtos = modelMapper.map(answers, AnswerDtoTypeList);

					questionDto.setAnswerDtos(answerDtos);

					quesitonDtos.add(questionDto);
				}
				testDto.setQuestionDtos(quesitonDtos);
				testDtos.add(testDto);
			}

			assignDto.setTestDtos(testDtos);

		}

		return assignDto;
	}

	@Override
	public List<AssignDTO> getListAssignByIdStudent(int idStudent) {

		List<Assign> assigns = assignRepository.findByIdStudent(idStudent);

		List<AssignDTO> assignDtos = new ArrayList<AssignDTO>();
		for (Assign assign : assigns) {

			AssignDTO assignDto = new AssignDTO();

			if (assign != null) {

				assignDto = modelMapper.map(assign, AssignDTO.class);

				List<Test> tests = assign.getTests();
				List<TestDTO> testDtos = new ArrayList<TestDTO>();

				for (Test test : tests) {

					TestDTO testDto = modelMapper.map(test, TestDTO.class);

					List<Question> questions = test.getQuestions();

					List<QuestionDTO> quesitonDtos = new ArrayList<QuestionDTO>();
					for (Question question : questions) {

						QuestionDTO questionDto = modelMapper.map(question, QuestionDTO.class);

						List<Answer> answers = question.getAnswers();
						List<AnswerDTO> answerDtos = new ArrayList<AnswerDTO>();

						for (Answer answer : answers) {

							AnswerDTO answerDto = modelMapper.map(answer, AnswerDTO.class);
							answerDtos.add(answerDto);
						}

						questionDto.setAnswerDtos(answerDtos);

						quesitonDtos.add(questionDto);
					}
					testDto.setQuestionDtos(quesitonDtos);
					testDtos.add(testDto);
				}

				assignDto.setTestDtos(testDtos);
				assignDtos.add(assignDto);
			}

		}

		return assignDtos;
	}

	@Override
	public List<AssignDTO> findByIdStudentIsNull() {

		List<Assign> assigns = assignRepository.findByIdStudentIsNull();

		List<AssignDTO> assignDtos = new ArrayList<AssignDTO>();
		for (Assign assign : assigns) {

			AssignDTO assignDto = new AssignDTO();

			if (assign != null) {

				assignDto = modelMapper.map(assign, AssignDTO.class);

				List<Test> tests = assign.getTests();
				List<TestDTO> testDtos = new ArrayList<TestDTO>();

				for (Test test : tests) {

					TestDTO testDto = modelMapper.map(test, TestDTO.class);

					List<Question> questions = test.getQuestions();

					List<QuestionDTO> quesitonDtos = new ArrayList<QuestionDTO>();
					for (Question question : questions) {

						QuestionDTO questionDto = modelMapper.map(question, QuestionDTO.class);

						List<Answer> answers = question.getAnswers();
						List<AnswerDTO> answerDtos = new ArrayList<AnswerDTO>();

						for (Answer answer : answers) {

							AnswerDTO answerDto = modelMapper.map(answer, AnswerDTO.class);
							answerDtos.add(answerDto);
						}

						questionDto.setAnswerDtos(answerDtos);

						quesitonDtos.add(questionDto);
					}
					testDto.setQuestionDtos(quesitonDtos);
					testDtos.add(testDto);
				}

				assignDto.setTestDtos(testDtos);
				assignDtos.add(assignDto);
			}

		}

		return assignDtos;
	}

	@Override
	public void updateAssign_idStudent(int id, int idStudent) {
		
		assignRepository.updateAssign_idStudent(id, idStudent);
		
	}

}

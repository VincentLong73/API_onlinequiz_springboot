package com.vietis.longnv.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vietis.longnv.entity.Answer;
import com.vietis.longnv.entity.Assign;
import com.vietis.longnv.entity.Question;
import com.vietis.longnv.entity.Test;
import com.vietis.longnv.model.AnswerDTO;
import com.vietis.longnv.model.QuestionDTO;
import com.vietis.longnv.model.TestDTO;
import com.vietis.longnv.repository.AssignRepository;
import com.vietis.longnv.repository.QuestionRepository;
import com.vietis.longnv.repository.TestRepository;
import com.vietis.longnv.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestRepository testRepository;

	@Autowired
	QuestionRepository questionRepository;

	@Autowired
	AssignRepository assignRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public List<QuestionDTO> getListQuestionInTest(int id) {

		Test test = testRepository.getOne(id);
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

		return quesitonDtos;
	}

	@Override
	public List<TestDTO> getAllTests() {
		List<TestDTO> testDtos = new ArrayList<TestDTO>();
		List<Test> tests = testRepository.findAll();

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
		return testDtos;
	}

	@Override
	public void addTest(Test test, int numberOfQuestion) {

		test.setQuestions(questionRepository.getListQuestionByRandom(numberOfQuestion));

		testRepository.saveAndFlush(test);

	}

	@Override
	public void updateTest(Test test) {

		if (test != null) {

			testRepository.save(test);
		}

	}

	@Override
	public void deleteTest(int id) {

		Test test = testRepository.getOne(id);

		if (test != null) {

			testRepository.delete(test);
		}

	}

	@Override
	public List<TestDTO> getListTestByRandom(int limit) {

		List<Test> tests = testRepository.getListTestByRandom(limit);
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

		return testDtos;
	}

	@Override
	public void delete1Question(int idTest, int idQuestion) {

		testRepository.deleteQuestion(idTest, idQuestion);

	}

	@Override
	public List<TestDTO> getListTestByIdAssign(int idAssign) {

		List<Test> tests = testRepository.getListTestByIdAssign(idAssign);
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

		return testDtos;
	}

	@Override
	public void CalculatorTest(int idTest) {

		Test test = testRepository.getOne(idTest);

		int mark = 0;

		List<Integer> scores = testRepository.CalculatorMark(idTest);

		for (int score : scores) {
			mark = mark + score;
		}

		test.setMark(mark);

		testRepository.save(test);

		System.out.println(test.getMark());

	}

	@Override
	public List<QuestionDTO> getListQuestionByIdTest(int idTest) {

		Test test = testRepository.getOne(idTest);
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

		return quesitonDtos;
	}

	@Override
	public void updateTestDayByDay() {

		List<Test> tests = testRepository.findByStatus(0);
		for (Test test : tests) {
			if ((new Date()).after(test.getTimeOut())) {

				test.setStatus(2);
				testRepository.save(test);
			}
		}

	}

	@Override
	public List<QuestionDTO> getListQuestionByTestName(String name) {

		List<Test> tests = testRepository.findTestByName(name);

		int count = 0;

		for (Test test : tests) {

			if (test.getName().equals(name)) {
				break;
			}
			count++;
		}
		TestDTO testDto = modelMapper.map(tests.get(count), TestDTO.class);

		List<Question> questions = tests.get(count).getQuestions();

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

		return quesitonDtos;
	}

	@Override
	public List<TestDTO> getListTestByAssignName(String name) {

		List<Assign> assigns = assignRepository.findAssignByName(name);

		int count = 0;

		for (Assign assign : assigns) {

			if (assign.getName().equals(name)) {
				break;
			}
			count++;
		}

		List<Test> tests = assigns.get(count).getTests();
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

		return testDtos;
	}

	@Override
	public TestDTO getTestById(int id) {
		Test test = testRepository.getOne(id);
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

		return testDto;
	}

}

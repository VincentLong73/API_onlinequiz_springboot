package com.vietis.longnv.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vietis.longnv.entity.Answer;
import com.vietis.longnv.entity.Assign;
import com.vietis.longnv.entity.Question;
import com.vietis.longnv.entity.Test;
import com.vietis.longnv.entity.User;
import com.vietis.longnv.model.AnswerDTO;
import com.vietis.longnv.model.AssignDTO;
import com.vietis.longnv.model.QuestionDTO;
import com.vietis.longnv.model.RoleDTO;
import com.vietis.longnv.model.TestDTO;
import com.vietis.longnv.model.UserDTO;
import com.vietis.longnv.repository.UserRepository;
import com.vietis.longnv.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ModelMapper modelMapper;

	@Override
	public UserDTO getUserById(int id) {
		User user = userRepository.getOne(id);

		UserDTO userDto = modelMapper.map(user, UserDTO.class);
		userDto.setRoleDto(modelMapper.map(user.getRole(), RoleDTO.class));
		List<AssignDTO> assignDtos = new ArrayList<AssignDTO>();
		for (Assign assign : user.getAssigns()) {

			AssignDTO assignDto = new AssignDTO();
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

		userDto.setAssignDtos(assignDtos);

		return userDto;
	}

	@Override
	public void addUser(User user) {

		userRepository.saveAndFlush(user);

	}

	@Override
	public void updateUser(User user) {

		userRepository.save(user);

	}

	@Override
	public void deleteUser(int id) {

		if (userRepository.existsById(id)) {
			userRepository.updateAssignIdStudentToNull(id);
			userRepository.deleteById(id);
		}

	}

	@Override
	public List<UserDTO> getListUserByIdRole(int idRole) {

		List<User> users = userRepository.findByIdRole(idRole);

		List<UserDTO> userDtos = new ArrayList<UserDTO>();

		for (User user : users) {

			UserDTO userDto = modelMapper.map(user, UserDTO.class);
			userDto.setRoleDto(modelMapper.map(user.getRole(), RoleDTO.class));
			List<AssignDTO> assignDtos = new ArrayList<AssignDTO>();
			for (Assign assign : user.getAssigns()) {

				AssignDTO assignDto = new AssignDTO();
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

			userDto.setAssignDtos(assignDtos);

			userDtos.add(userDto);

		}
		return userDtos;
	}

	@Override
	public User findUserByUserName(String username) {

		return userRepository.findByUserName(username);

	}
	
	@Override
	public User findUserByUserNameSession(String username) {

		return userRepository.findByUserName(username);

	}

	@Override
	public boolean checkLogin(User user) {

		User userTmp = userRepository.findByUserName(user.getUserName());

		if (userTmp != null) {
			if (userTmp.getPassword().equals(user.getPassword())) {
				return true;
			}
		}

		return false;
	}

	@Override
	public List<UserDTO> getListUserTeacherAndStudent() {
		List<User> users = userRepository.findTeacherAndStudent();

		List<UserDTO> userDtos = new ArrayList<UserDTO>();

		for (User user : users) {

			UserDTO userDto = modelMapper.map(user, UserDTO.class);
			userDto.setRoleDto(modelMapper.map(user.getRole(), RoleDTO.class));
			List<AssignDTO> assignDtos = new ArrayList<AssignDTO>();
			for (Assign assign : user.getAssigns()) {

				AssignDTO assignDto = new AssignDTO();
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

			userDto.setAssignDtos(assignDtos);

			userDtos.add(userDto);

		}
		return userDtos;
	}

}

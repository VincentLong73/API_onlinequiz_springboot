package com.vietis.longnv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vietis.longnv.entity.User;
import com.vietis.longnv.model.AnswerDTO;
import com.vietis.longnv.model.AssignDTO;
import com.vietis.longnv.model.QuestionAnswerDTO;
import com.vietis.longnv.model.QuestionDTO;
import com.vietis.longnv.model.ResultDTO;
import com.vietis.longnv.model.TestDTO;
import com.vietis.longnv.model.UserDTO;
import com.vietis.longnv.service.AnswerService;
import com.vietis.longnv.service.AssignService;
import com.vietis.longnv.service.QuestionAnswerService;
import com.vietis.longnv.service.QuestionService;
import com.vietis.longnv.service.ResultService;
import com.vietis.longnv.service.TestService;
import com.vietis.longnv.service.UserService;

@RestController
@RequestMapping(value="/quiz/student")
public class StudentController {
	
	
	@Autowired
	AnswerService answerService;
	
	@Autowired
	QuestionService questionServive;
	
	@Autowired
	QuestionAnswerService questionAnswerService;
	
	@Autowired
	TestService testService;
	
	@Autowired
	AssignService assignService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	ResultService resultService;
	
	
	
	
	//Answer
	@GetMapping(value="/getAnswer/{idAnswer}")
	public ResponseEntity<AnswerDTO> getAnswer(@PathVariable("idAnswer") int idAnswer){
		
		return new ResponseEntity<AnswerDTO>( answerService.getAnswer(idAnswer)  , HttpStatus.OK);
		
	}
	
	//Question
	
	@GetMapping(value="/getQuestion/{idQuestion}")
	public ResponseEntity<QuestionDTO> getQuestion(@PathVariable("idQuestion") int idQuestion){
		
		return new ResponseEntity<QuestionDTO>( questionServive.getQuestion(idQuestion)  , HttpStatus.OK);
		
	}

	// Test
	@GetMapping(value = "/getListQuestionInTest/{id}")
	public ResponseEntity<List<QuestionDTO>> getListQuestionInTest(@PathVariable("id") int id) {

		return new ResponseEntity<List<QuestionDTO>>( testService.getListQuestionByIdTest(id), HttpStatus.OK);

	}

	@GetMapping(value = "/getListTestByIdAssign/{idAssign}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TestDTO>> getListTestByIdAssign(@PathVariable("idAssign") int idAssign) {

		return new ResponseEntity<List<TestDTO>>( testService.getListTestByIdAssign(idAssign), HttpStatus.OK);
	}
	
	// Assign

	@GetMapping(value = "/getAssign/{id}")
	public ResponseEntity<AssignDTO> getAssign(@PathVariable("id") int id) {

		return new ResponseEntity<AssignDTO>(assignService.getAssign(id),HttpStatus.OK);
	}
	
	@GetMapping(value="/getAssignByIdStudent/{idStudent}")
	public ResponseEntity<Object> getAssignByIdStudent(@PathVariable("idStudent") int idStudent){
		
		List<AssignDTO> assignDtos = assignService.getListAssignByIdStudent(idStudent);
		if(assignDtos != null) {
			
			return new ResponseEntity<Object>( assignDtos , HttpStatus.OK);
		}else{
			
			return new ResponseEntity<Object>("Not Found List Assign!", HttpStatus.NO_CONTENT);
		}
		
		
	}
	
	@PostMapping(value="/addResult/{idTest}/{idQuestion}")
	public void addResult(@RequestBody ResultDTO resultDto,@PathVariable("idTest") int idTest, @PathVariable("idQuestion") int idQuestion) {
		
		resultDto.setIdTest(idTest);
		resultDto.setIdQuestion(idQuestion);
		resultService.addResult(resultDto);
		
	}
	
	@GetMapping(value="/getTestById/{idTest}")
	public TestDTO getTest(@PathVariable("idTest") int idTest) {
		
		return testService.getTestById(idTest);
	}
	
	@GetMapping(value="/getUserInfor/{idUser}")
	public UserDTO getUser(@PathVariable("idUser") int idUser) {
		
		return userService.getUserById(idUser);
	}
	
	@PutMapping(value = "/editUser")
	public void editUser(@RequestBody User user) {
		
		userService.updateUser(user);
	}
	
	@PutMapping(value = "/editTest/{idTest}")
	public void editTest(@PathVariable("idTest") int idTest){
		
		testService.CalculatorTest(idTest);
	}
	
	@GetMapping(value="/getResult/{idTest}")
	public ResponseEntity<List<ResultDTO>> getResult(@PathVariable("idTest") int idTest){
		
		return new ResponseEntity<List<ResultDTO>>(resultService.getListResultByIdTest(idTest),HttpStatus.OK);
	}
	
	@GetMapping(value="/getQuestionAnswer/{idQuestion}")
	public ResponseEntity<List<QuestionAnswerDTO>> getQuestionAnswer(@PathVariable("idQuestion") int idQuestion){
		
		return new ResponseEntity<List<QuestionAnswerDTO>>(questionAnswerService.getListQuestionAnswerByIdQuestion(idQuestion),HttpStatus.OK);
	}

}

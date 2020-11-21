package com.vietis.longnv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vietis.longnv.entity.Assign;
import com.vietis.longnv.entity.Question;
import com.vietis.longnv.entity.Test;
import com.vietis.longnv.entity.User;
import com.vietis.longnv.model.AssignDTO;
import com.vietis.longnv.model.QuestionAnswerDTO;
import com.vietis.longnv.model.QuestionDTO;
import com.vietis.longnv.model.TestDTO;
import com.vietis.longnv.model.UserDTO;
import com.vietis.longnv.service.AssignService;
import com.vietis.longnv.service.QuestionAnswerService;
import com.vietis.longnv.service.QuestionService;
import com.vietis.longnv.service.TestService;
import com.vietis.longnv.service.UserService;

@RestController
@RequestMapping(value="/quiz/teacher")
public class TeacherController {
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private QuestionAnswerService questionAnswerService;

	@Autowired
	private TestService testService;

	@Autowired
	private AssignService assignService;
	
	@Autowired
	UserService userService;
	
	// Question

		// Lay danh sach cau hoi theo level
		@GetMapping(value = "/getQuestion/{idLevel}")
		public ResponseEntity<List<QuestionDTO>> getQuestion(@PathVariable("idLevel") int idLevel) {

			return new ResponseEntity<List<QuestionDTO>>(questionService.getListQuestionByIdLevel(idLevel),HttpStatus.OK);

		}
		
		@GetMapping(value="/getQuestionById/{id}")
		public ResponseEntity<QuestionDTO> findById(@PathVariable("id") int id){
			
			return new ResponseEntity<QuestionDTO>(questionService.findById(id),HttpStatus.OK);
		}
		
		@GetMapping(value="/getQuestionByContent/{content}")
		public ResponseEntity<QuestionDTO> findByContent(@PathVariable("content") String content){
			
			return new ResponseEntity<QuestionDTO>(questionService.getQuestionByContent(content),HttpStatus.OK);
		}

		@PostMapping(value = "/createQuestion")
		public void createQuestion(@RequestBody Question question) {

			questionService.addQuestion(question);
		}

		@PutMapping(value = "/updateQuestion")
		public void updateQuestion(@RequestBody Question question) {

			questionService.updateQuestion(question);

		}

		@DeleteMapping(value = "/deleteQuestion/{id}")
		public void deleteQuestion(@PathVariable("id") int id) {

			questionService.deleteQuestion(id);
		}
		
		//QuestionAnswer
		
		
		@GetMapping(value="/getQuestionAnswer/{idQuestion}")
		public ResponseEntity<List<QuestionAnswerDTO>> getQuestionAnswer(@PathVariable("idQuestion") int idQuestion){
			
			return new ResponseEntity<List<QuestionAnswerDTO>>(questionAnswerService.getQuestionAnswerByIdQuestion(idQuestion), HttpStatus.OK);
			
		}
		
		@PutMapping(value="/updateQuestionAnswer")
		public void updateQuestionAnswer(@RequestBody QuestionAnswerDTO questionAnswer) {
			
			questionAnswerService.update(questionAnswer);
		}

		// Test
		@GetMapping(value = "/getListQuestionInTest/{id}")
		public ResponseEntity<List<QuestionDTO>> getListQuestionInTest(@PathVariable("id") int id) {

			return new ResponseEntity<List<QuestionDTO>>(testService.getListQuestionByIdTest(id),HttpStatus.OK);

		}
		
		@GetMapping(value = "/getListQuestionByTestName/{name}")
		public ResponseEntity<List<QuestionDTO>> getListQuestionByTestName(@PathVariable("name") String name) {

			return new ResponseEntity<List<QuestionDTO>>(testService.getListQuestionByTestName(name),HttpStatus.OK);

		}
		
		@GetMapping(value="/getTestById/{id}")
		public TestDTO getTestById(@PathVariable("id") int id) {
			
			return testService.getTestById(id);
		}
		
		@GetMapping(value="/getTestByIdAssign/{idAssign}")
		public List<TestDTO> getListTestByIdAssign(@PathVariable("idAssign") int idAssign) {
			
			return testService.getListTestByIdAssign(idAssign);
		}

		@GetMapping(value = "/getListTestRanDom")
		public List<TestDTO> getListTestRanDom(@PathVariable("limit") int limit) {

			return testService.getListTestByRandom(limit);
		}
		
//		@PostMapping(value="/createTest")
//		public void createTest(@RequestBody Test test,int numberOfQuestion) {
//			
//			
//			testService.addTest(test,numberOfQuestion);
//		}

		@PostMapping(value="/createTest")
		public void createTest(@RequestBody Test test) {
			
			
			testService.addTest(test,10);
		}
		
		
		@PutMapping(value = "/editTest")
		public TestDTO editTest(@RequestBody Test test) {
			
			

			testService.updateTest(test);

			return testService.getTestById(test.getId());

		}

		@DeleteMapping(value = "/deleteQuestionInTest/{idTest}/{idQuestion}")
		public void deleteQuestionInTest(@PathVariable("idTest") int idTest, @PathVariable("idQuestion") int idQuestion) {

			testService.delete1Question(idTest, idQuestion);
		}

		// Assign

		@GetMapping(value = "/getAssign/{id}")
		public AssignDTO getAssign(@PathVariable("id") int id) {

			return assignService.getAssign(id);
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
		
		@PostMapping(value = "/createAssign")
		public void createAssign(@RequestBody Assign assign) {

			assignService.addAssign(assign, 5);

		}

		@PutMapping(value = "/editAssign")
		public void editAssign(@RequestBody Assign assign) {

			assignService.updateAssign(assign);
		}
		
		@PutMapping(value = "/updateAssign_idStudent")
		public void updateAssign_idStudent(@RequestBody AssignDTO assign) {

			assignService.updateAssign_idStudent(assign.getId(), assign.getIdStudent());
		}
		
		
		@DeleteMapping(value="/deleteAssign/{id}")
		public void deleteAssign(@PathVariable("id") int id) {
			
			assignService.deleteAssign(id);
		}
		
		@GetMapping(value = "/getListTestByAssignName/{name}")
		public ResponseEntity<List<TestDTO>> getListTestByAssignName(@PathVariable("name") String name) {

			return new ResponseEntity<List<TestDTO>>(testService.getListTestByAssignName(name),HttpStatus.OK);

		}
		
		@GetMapping(value = "/getListAssignNull")
		public ResponseEntity<List<AssignDTO>> getListAssignNull() {

			return new ResponseEntity<List<AssignDTO>>(assignService.findByIdStudentIsNull(),HttpStatus.OK);

		}
		//User

		@PutMapping(value = "/editUser")
		public void editUser(@RequestBody User user) {
			
			userService.updateUser(user);
		}
		
		@GetMapping(value="/getListStudent")
		public ResponseEntity<List<UserDTO>> getListStudent(){
			
			return new ResponseEntity<List<UserDTO>>(userService.getListUserByIdRole(1),HttpStatus.OK);
			
		}
}

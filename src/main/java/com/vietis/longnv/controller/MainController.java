package com.vietis.longnv.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vietis.longnv.entity.User;
import com.vietis.longnv.jwt.JwtService;
import com.vietis.longnv.model.RoleDTO;
import com.vietis.longnv.model.UserDTO;
import com.vietis.longnv.service.TestService;
import com.vietis.longnv.service.UserService;

@RestController
//@Controller
@RequestMapping(value="/quiz")
public class MainController {

	
	@Autowired
	UserService userService;
	
	@Autowired
	TestService testService;
	
	@Autowired
	JwtService jwtService;

	@Autowired
	Environment environment;
	


	@GetMapping(value = "/")
	public String index(HttpServletRequest request) {

		request.setAttribute("msg", environment.getProperty("message"));
		return "index";

	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<String> login( @RequestBody User user) {
		
		testService.updateTestDayByDay();
		
	    String result = "";
	    HttpStatus httpStatus = null;
	    try {
	      if (userService.checkLogin(user)) {
	        result = jwtService.generateTokenLogin( user.getUserName());
	        httpStatus = HttpStatus.OK;
	      } else {
	        result = "Wrong userId and password";
	        httpStatus = HttpStatus.BAD_REQUEST;
	      }
	    } catch (Exception ex) {
	      result = "Server Error";
	      httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
	    }
	    return new ResponseEntity<String>(result, httpStatus);
	  }
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)  
    public ResponseEntity<String> logoutPage(HttpServletRequest request, HttpServletResponse response) {  
        Authentication auth = SecurityContextHolder.getContext().getAuthentication(); 
        
        HttpStatus httpStatus = null;
        String result = "error";
        if (auth != null){      
           new SecurityContextLogoutHandler().logout(request, response, auth);  
           httpStatus = HttpStatus.OK;
           result="ok";
        }  
         return new ResponseEntity<String>(result,httpStatus);
     }  
	
	@GetMapping(value="/getUserInfor/{userName}")
	public ResponseEntity<UserDTO> getUserInfor(@PathVariable("userName") String userName){
		
		User user = userService.findUserByUserName(userName);
		
		UserDTO userDto = new UserDTO();
		
		userDto.setId(user.getId());
		userDto.setUserName(user.getUserName());
		
		RoleDTO roleDto = new RoleDTO();
		roleDto.setName(user.getRole().getName());
		userDto.setRoleDto(roleDto);
	
		return new ResponseEntity<UserDTO>(userDto,HttpStatus.OK);
		
	}

//	@RequestMapping(value = "/login", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
//	  public String login(HttpServletRequest request, @RequestBody User user) {
//	    String result = "";
//	    HttpStatus httpStatus = null;
//	    try {
//	      if (userService.checkLogin(user)) {
//	        result = jwtService.generateTokenLogin(user.getUserName());
//	        httpStatus = HttpStatus.OK;
//	      } else {
//	        result = "Wrong userId and password";
//	        httpStatus = HttpStatus.BAD_REQUEST;
//	      }
//	    } catch (Exception ex) {
//	      result = "Server Error";
//	      httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
//	    }
//	    return result;
//	  }

//-------------------------------------------------------------------------------------------------------

//Answer

//	@RequestMapping(value = "/editAnswer", method = RequestMethod.GET)
//	public String editAnswer(@RequestParam("id") int id, @RequestParam("idQ") int idQ, ModelMap modelMap) {
//
//		AnswerDTO answerDto = answerService.getAnswer(id);
//		QuestionDTO questionDto = questionService.getQuestion(idQ);
//		modelMap.addAttribute("question", questionDto).addAttribute("answer", answerDto);
//		return "editAnswer";
//
//	}
//
//	@PostMapping(value = "/saveAnswer")
//	public String saveAnswer(QuestionDTO questionDto, AnswerDTO answerDto,
//			@RequestParam Map<String, String> requestMapper) {
//
//		answerService.updateAnswer(answerDto);
//
//		QuestionDTO questionDtotmp = questionService.getQuestion(Integer.parseInt(requestMapper.get("questionId")));
//		int id = questionDtotmp.getId();
//		return "redirect:/AQuestion/" + id;
//		// return "index";
//	}
//	// Question
//
//	@PostMapping(value = "/questionAdd")
//	public String question(HttpServletRequest request, @ModelAttribute(name = "questionAdd") QuestionDTO questionAdd) {
//
//		questionService.addQuestion(questionAdd);
//
//		return "redirect:/question-list";
//	}
//
//	@RequestMapping(value = "/editQuestion")
//	public String editQuestion(@RequestParam("id") int id, Model model) {
//
//		QuestionDTO questionDto = questionService.getQuestion(id);
//		model.addAttribute("question", questionDto);
//
//		return "editQuestion";
//	}
//
//	@PostMapping(value = "saveQuestion")
//	public String saveQuestion(QuestionDTO questionDto, Model model) {
//
//		questionService.updateQuestion(questionDto);
//		QuestionDTO questionDtotmp = questionService.getQuestion(questionDto.getId());
//		int id = questionDtotmp.getId();
//		return "redirect:/AQuestion/" + id;
//	}
//
//	@GetMapping(value = "/AQuestion/{id}")
//	public String aQuestion(@PathVariable("id") int id, Model model) {
//
//		QuestionDTO questionDtotmp = questionService.getQuestion(id);
//		model.addAttribute("question", questionDtotmp);
//		return "aQuestion";
//	}
//
//	@RequestMapping(value = "/deleteQuestion", method = RequestMethod.GET)
//	public String deleteQuestion(@RequestParam("id") int id, Model model) {
//
//		questionService.deleteQuestion(id);
//
//		return "redirect:/question-list";
//	}
//
//	// Create Question and Answer
//	@GetMapping(value = "/create")
//	public String create(HttpServletRequest request, Model model) {
//
//		model.addAttribute("question", new QuestionDTO("1 + 1 = ?", 1));
//		model.addAttribute("answer1", new AnswerDTO("bang 1"));
//		return "create";
//	}
//
//	@PostMapping(value = "saveAQuestion")
//	public String saveCreate(QuestionDTO question, AnswerDTO answer1, Model model) {
//
//		StringTokenizer st = new StringTokenizer(answer1.getContent(), ",");
//
//		question.setContent(st.nextToken());
//		List<AnswerDTO> answers = new ArrayList<AnswerDTO>();
//		while (st.hasMoreTokens()) {
//
//			AnswerDTO ans = new AnswerDTO();
//
//			ans.setContent(st.nextToken());
//			System.out.println(ans.getContent());
//			// answerService.addAnswer(ans);
//			answers.add(ans);
//
//		}
//
//		// answerService.addAnswers(answers);
//
//		question.setAnswers(answers);
//		questionService.addQuestion(question);
//		System.out.println(questionService.getQuestionByContent(question.getContent()).getId());
//		int id = questionService.getQuestionByContent(question.getContent()).getId();
//		List<QuestionAnswerDTO> questionAnswerDtos = questionAnswerService.getQuestionAnswerByIdQuestion(id);
//		for (QuestionAnswerDTO questionAnswerDto : questionAnswerDtos) {
//
//			System.out.println("1");
//
//			System.out.println(questionAnswerDto.getId() + " " + questionAnswerDto.getIdQuestion() + " "
//					+ questionAnswerDto.getIdAnswer() + " ");
//		}
//
//		int[] isCorrects = { 1, 0, 0, 1 };
//
//		questionAnswerService.updateListQuestionAnswer(questionAnswerDtos, isCorrects);
//
//		QuestionDTO questionDto = questionService.getQuestionByContent(question.getContent());
//		model.addAttribute("question", questionDto);
//
//		return "aQuestion";
//	}
//
//	@GetMapping(value = "/ListQuesitonAnswer")
//	public String listQuestionAnswer() {
//
//		List<QuestionAnswerDTO> questionAnswerDtos = questionAnswerService.getQuestionAnswerByIdQuestion(10);
//		for (QuestionAnswerDTO questionAnswerDto : questionAnswerDtos) {
//
//			System.out.println(questionAnswerDto.getId() + " " + questionAnswerDto.getIdQuestion() + " "
//					+ questionAnswerDto.getIdAnswer() + " " + questionAnswerDto.getIsCorrect());
//		}
//		return "index";
//	}
//
//	// Create User
//
//	// Testing
//	@GetMapping(value = "/testName")
//	public String testing(HttpServletRequest request, Model model) {
//
//		
//		model.addAttribute("testDto", new TestDTO("Test Name Repo 11"));
//		
//		return "testName";
//
//	}
//
//	@PostMapping(value = "saveTest")
//	public String saveTest(HttpServletRequest request,TestDTO testDto) {
//		
//		
//		
//		List<QuestionDTO> questionDtos = questionService.getListQuestionByRandom(10);
//		request.setAttribute("questionDtos", questionDtos);
//		testDto.setQuestions(questionDtos);
//		request.setAttribute("testDto", testDto);
//		testService.addTest(testDto);
//		
//
//		return "testing";
//
//	}
//	
//	@GetMapping(value="/assignName")
//	public String assignName(Model model) {
//		
//		model.addAttribute("assignDto", new AssignDTO("Assign Name 1"));
//		
//		return "assignName";
//	}
//	
//	@PostMapping(value="/saveAssign")
//	public String saveAssign(HttpServletRequest request, AssignDTO assignDto) {
//		
//		
//		assignService.addAssign(assignDto, 5);
//		
//		AssignDTO assign = assignService.getAssignByName(assignDto.getName());
//		request.setAttribute("assignDto", assign);
//		return "assign";
//	}
//	
//	@RequestMapping(value="/editAssign", method=RequestMethod.GET)
//	public String editAssign(@RequestParam("id") int id, Model model) {
//		
//		AssignDTO assignDto = assignService.getAssign(id);
//		model.addAttribute("assignDto", assignDto);
//		return "editAssign";
//	}

//---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------

}

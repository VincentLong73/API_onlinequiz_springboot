package com.vietis.longnv.service;

import java.util.List;

import com.vietis.longnv.entity.Test;
import com.vietis.longnv.model.QuestionDTO;
import com.vietis.longnv.model.TestDTO;


public interface TestService {

	public List<QuestionDTO> getListQuestionInTest(int id);

	public List<TestDTO> getAllTests();

	public void addTest(Test test,int numberOfQuestion);

	public void updateTest(Test test);

	public void deleteTest(int id);

	public List<TestDTO> getListTestByRandom(int limit);
	
	public void delete1Question(int idTest,int idQuestion);
	
	public List<TestDTO> getListTestByIdAssign(int idAssign);
	
	public void CalculatorTest(int idTest);
	
	public List<QuestionDTO> getListQuestionByIdTest(int idTest);
	
	public TestDTO getTestById(int id);
	
	public List<QuestionDTO> getListQuestionByTestName(String name);
	
	public List<TestDTO> getListTestByAssignName(String name);
	
	public void updateTestDayByDay();

}

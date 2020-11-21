package com.vietis.longnv.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.vietis.longnv.entity.Test;
import com.vietis.longnv.model.TestDTO;

public class TestEntity2DTO {

	@Autowired
	ModelMapper modelMapper;

	QuestionEntity2DTO questionConvert =  new QuestionEntity2DTO();

	public TestDTO convert1Test(Test test) {

		TestDTO testDto = new TestDTO();

		if (test.getQuestions() != null) {
			testDto.setQuestionDtos(questionConvert.convertListQuestion(test.getQuestions()));
		}

		testDto = modelMapper.map(test, TestDTO.class);

		return testDto;
	}

	public List<TestDTO> convertListTest(List<Test> tests) {

		List<TestDTO> testDtos = new ArrayList<TestDTO>();

		for (Test test : tests) {

			testDtos.add(convert1Test(test));
		}

		return testDtos;

	}

}

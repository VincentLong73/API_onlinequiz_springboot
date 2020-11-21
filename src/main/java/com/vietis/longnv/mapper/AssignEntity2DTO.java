package com.vietis.longnv.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.vietis.longnv.entity.Assign;
import com.vietis.longnv.model.AssignDTO;

public class AssignEntity2DTO {

	@Autowired
	ModelMapper modelMapper;

	TestEntity2DTO testConvert = new TestEntity2DTO();

	public AssignDTO convert1Assign(Assign assign) {

		AssignDTO assignDto = new AssignDTO();

		assignDto = modelMapper.map(assign, AssignDTO.class);
		
		if(assign.getTests()!=null) {
			

		assignDto.setTestDtos(testConvert.convertListTest(assign.getTests()));

		}
		return assignDto;

	}

	public List<AssignDTO> convertListAssign(List<Assign> assigns) {

		List<AssignDTO> assignDtos = new ArrayList<AssignDTO>();

		for (Assign assign : assigns) {

			assignDtos.add(convert1Assign(assign));
		}

		return assignDtos;

	}

}

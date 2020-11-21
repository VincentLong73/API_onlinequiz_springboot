package com.vietis.longnv.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListTestDTO {
	
	private List<TestDTO> testDtos;

	public List<TestDTO> getTestDtos() {
		return testDtos;
	}

	public void setTestDtos(List<TestDTO> testDtos) {
		this.testDtos = testDtos;
	}

}

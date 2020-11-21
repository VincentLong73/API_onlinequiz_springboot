package com.vietis.longnv.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssignDTO {

	

	private int id;

	private String name;

	private int idStudent;
	
	//private String createBy;

	private List<TestDTO> testDtos;
	
	//private UserDTO userDto;
	
	public AssignDTO(String name) {

		this.name = name;
	}

}

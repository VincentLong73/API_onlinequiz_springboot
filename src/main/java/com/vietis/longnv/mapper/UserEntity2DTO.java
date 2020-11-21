package com.vietis.longnv.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.vietis.longnv.entity.User;
import com.vietis.longnv.model.UserDTO;

public class UserEntity2DTO {

	@Autowired
	ModelMapper modelMapper;

	AssignEntity2DTO assignConvert = new AssignEntity2DTO();

	public UserDTO convert1User(User user) {

		UserDTO userDto = new UserDTO();

		userDto = modelMapper.map(user, UserDTO.class);

		if(user.getAssigns()!=null) {
			userDto.setAssignDtos(assignConvert.convertListAssign(user.getAssigns()));
		}

		return userDto;

	}

	public List<UserDTO> convertListAssign(List<User> users) {

		List<UserDTO> userDtos = new ArrayList<UserDTO>();

		for (User user : users) {

			userDtos.add(convert1User(user));
		}

		return userDtos;

	}

}

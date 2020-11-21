package com.vietis.longnv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	private int id;

	// private int idRole;

	private String userName;
	
	private String password;

	private List<AssignDTO> assignDtos;

	private RoleDTO roleDto;

	public List<GrantedAuthority> getAuthorities() {

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(this.roleDto.getName()));

		return authorities;
	}

	 private int age; 
	 
	 private String firstName;
		
	 private String lastName;

	 private String phone;

	 private String email;

	 private Date createdDate;

	 private String createBy;

}

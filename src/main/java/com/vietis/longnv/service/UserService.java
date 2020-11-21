package com.vietis.longnv.service;

import java.util.List;

import com.vietis.longnv.entity.User;
import com.vietis.longnv.model.UserDTO;

public interface UserService {
	
	public UserDTO getUserById(int id);

	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);

	public List<UserDTO> getListUserByIdRole(int idRole);
	
	public List<UserDTO> getListUserTeacherAndStudent();
	
	public boolean checkLogin(User user);
	
	public User findUserByUserName(String username);
	
	public User findUserByUserNameSession(String username);
}

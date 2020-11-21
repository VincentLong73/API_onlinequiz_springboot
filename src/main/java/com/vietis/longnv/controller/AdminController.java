package com.vietis.longnv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vietis.longnv.entity.User;
import com.vietis.longnv.model.UserDTO;
import com.vietis.longnv.service.UserService;

@RestController
@RequestMapping(value="/quiz/admin")
public class AdminController {
	
	@Autowired
	UserService userService;
	
	//User
		@GetMapping(value = "/getListUserByIdRole/{idRole}")
		public List<UserDTO> getListUserByIdRole(@PathVariable("idRole") int idRole) {

			return userService.getListUserByIdRole(idRole);

		}

		
		@GetMapping(value = "/getListUserTeacherAndStudent")
		public List<UserDTO> getListUserTeacherAndStudent() {

			return userService.getListUserTeacherAndStudent();

		}
		
		@GetMapping(value = "/getUserById/{id}")
		public UserDTO getUserById(@PathVariable("id") int id) {

			return userService.getUserById(id);

		}
		
		@PostMapping(value="/createUser")
		public void createUser(@RequestBody User user) {
			
			userService.addUser(user);
			//return new ResponseEntity<Object>("Add successfully!",HttpStatus.OK);
		}

		@PutMapping(value = "/editUser")
		public void editUser(@RequestBody User user) {
			
			userService.updateUser(user);
			
			//return new ResponseEntity<Object>("Edit successfully!",HttpStatus.OK);
		}

		@DeleteMapping(value = "/deleteUser/{id}")
		public void deleteUser(@PathVariable("id") int id) {

			userService.deleteUser(id);
			//return new ResponseEntity<Object>("Delete successfully!",HttpStatus.OK);
		}
		
		
		
		

}

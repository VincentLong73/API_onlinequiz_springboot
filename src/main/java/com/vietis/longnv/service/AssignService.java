package com.vietis.longnv.service;

import java.util.List;

import com.vietis.longnv.entity.Assign;
import com.vietis.longnv.model.AssignDTO;

public interface AssignService {

	public AssignDTO getAssignByName(String name);

	public void addAssign(Assign assign,int numberOfTest);

	public void updateAssign(Assign assign);

	public void deleteAssign(int id);

	public AssignDTO getAssign(int id);
	
	public List<AssignDTO> getListAssignByIdStudent(int idStudent);
	
	public List<AssignDTO> findByIdStudentIsNull();

	public void updateAssign_idStudent(int idStudent, int idAssign);
}

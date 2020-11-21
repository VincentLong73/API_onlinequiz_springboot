package com.vietis.longnv.service;

import java.util.List;

import com.vietis.longnv.entity.Result;
import com.vietis.longnv.model.ResultDTO;

public interface ResultService {
	
	
	public List<ResultDTO> getListResultByIdTest(int idTest);
	
	public void addResult(ResultDTO resultDto);

	public void updateResult(Result result);

	public void deleteResult(int id);

}

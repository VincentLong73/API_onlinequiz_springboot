package com.vietis.longnv.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vietis.longnv.entity.Result;


@Repository
@Transactional
public interface ResultRepository extends JpaRepository<Result, Integer>{

	public List<Result> findByIdTest(int idTest);
}

package com.whydigit.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.whydigit.entity.WhydigitVO;

@Service
public interface WhydigitService  {

	public List<WhydigitVO> getAllEmployee();
	public WhydigitVO getEmployeeById(int id);
	public WhydigitVO createEmployee(WhydigitVO whydigitVO);
	public ResponseEntity<?> updateEmployee(int id,WhydigitVO whydigitVO);
	public ResponseEntity<?> deleteEmployee(int id);




}

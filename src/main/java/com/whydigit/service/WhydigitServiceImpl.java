package com.whydigit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.whydigit.entity.WhydigitVO;
import com.whydigit.repository.WhydigitRepo;
@Service
public class WhydigitServiceImpl implements WhydigitService {

	@Autowired
	WhydigitRepo whydigitRepo;
	
	@Override
	public List<WhydigitVO> getAllEmployee() {
		// TODO Auto-generated method stub
		return whydigitRepo.findAll();
	}

	@Override
	public WhydigitVO getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return whydigitRepo.findById(id).orElse(null);
	}

	@Override
	public WhydigitVO createEmployee(WhydigitVO whydigitVO) {
		// TODO Auto-generated method stub
		return whydigitRepo.save(whydigitVO);
	}

	@Override
	public ResponseEntity<?> updateEmployee(int id,WhydigitVO whydigitVO) {
		WhydigitVO wdsVO = whydigitRepo.findById(id).get();
		whydigitRepo.save(wdsVO);
		return ResponseEntity.ok().body("Updated Successfully");
	}

	@Override
	public ResponseEntity<?>  deleteEmployee(int id) {
		// TODO Auto-generated method stub
		whydigitRepo.deleteById(id);
		return ResponseEntity.ok().body("Deleted Successfully");
	}

}

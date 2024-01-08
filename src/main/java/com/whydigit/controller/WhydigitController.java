

package com.whydigit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whydigit.entity.WhydigitVO;
import com.whydigit.service.WhydigitService;

@Controller
@RequestMapping("/whydigit")
public class WhydigitController {
	@Autowired
	WhydigitService whydigitService;
	
@GetMapping("/whydigit")
	public List<WhydigitVO> getAllEmployee(){
		List<WhydigitVO> whydigitVO = whydigitService.getAllEmployee();
		return whydigitVO;
}
@GetMapping("/{id}")
	public WhydigitVO getEmployeeById(@PathVariable int id){
	   WhydigitVO whydigitVO = whydigitService.getEmployeeById(id);
	   return whydigitVO;
}
@PostMapping("/whydigit")
	public WhydigitVO createEmployee(@RequestBody WhydigitVO whydigitVO){
	   WhydigitVO updatedWhydigitVO = whydigitService.createEmployee(whydigitVO);
	   return updatedWhydigitVO;
}
@PutMapping("/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable int id,@RequestBody WhydigitVO whydigitVO){
		return  whydigitService.updateEmployee(id,whydigitVO);
	  
}
@DeleteMapping("/{id}")
public ResponseEntity<?> deleteEmployee(@PathVariable int id){
		return  whydigitService.deleteEmployee(id);   
}
}
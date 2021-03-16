package org.capg.demo.controller;

import java.util.List;

import org.capg.demo.bean.Employee;
import org.capg.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@Controller+@ResponseBody
@RequestMapping("/Employee")
public class MyController {
	@Autowired
	EmployeeService jpaService;
	@GetMapping(value="/all")
	public List<Employee> createEmployee() {
		return jpaService.getAllEmployee();
	}
	@RequestMapping("/delete")
	public String deleteEmployee() {
		return "Employee deleted";
	}
	@GetMapping(value="/{findbyid}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int findbyid) {
		Employee e=jpaService.findById(findbyid);
		if(e!=null)
			return new ResponseEntity<Employee>(e,HttpStatus.OK);
		else
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/create")
	public List<Employee> saveEmployee(@RequestBody Employee em){
	
		return jpaService.addEmployee(em);
		
	}
    
	@DeleteMapping("/{id}")
	public List<Employee> remEmployee(@PathVariable int id){
		return jpaService.deleteEmp(id);
	}
	
	@PutMapping
	public List<Employee> modifyEmployee(@RequestBody Employee e){
		return jpaService.updateEmployee(e);
	}
	
}

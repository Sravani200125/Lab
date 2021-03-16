package org.capg.demo.service;

import java.util.List;
import java.util.Optional;

import org.capg.demo.bean.Employee;
import org.capg.demo.dao.EmployeeDaoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("jpaService")
public class EmployeeServiceJpa implements EmployeeService{
	@Autowired
	EmployeeDaoJPA edao;

	@Override
	public List<Employee> getAllEmployee() {
		return edao.findAll();
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> op=edao.findById(id);
		if(op.isPresent())
			return op.get();
		else
		    return null;
	}

	@Override
	public List<Employee> addEmployee(Employee emp) {
		edao.saveAndFlush(emp);
		return edao.findAll();
	}

	@Override
	public List<Employee> deleteEmp(int id) {
		edao.deleteById(id);
		return edao.findAll();
	}

	@Override
	public List<Employee> updateEmployee(Employee e) {
		edao.saveAndFlush(e);
		return edao.findAll();
		
	}

}

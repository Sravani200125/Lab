package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Employee;
import org.capg.demo.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao edao;

	@Override
	public List<Employee> getAllEmployee() {
		return edao.getEmployee();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return edao.findEmployee(id);
	}

	@Override
	public List<Employee> addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return edao.createEmployee(emp);
	}

	@Override
	public List<Employee> deleteEmp(int id) {
		// TODO Auto-generated method stub
		return edao.removeEmp(id);
	}

	@Override
	public List<Employee> updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return edao.modifyEmployee(e);
	}
	
	

}

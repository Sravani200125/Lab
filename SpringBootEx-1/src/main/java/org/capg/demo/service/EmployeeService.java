package org.capg.demo.service;

import java.util.List;

import org.capg.demo.bean.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployee();
	public Employee findById(int id);
	public List<Employee> addEmployee(Employee emp);
	public List<Employee> deleteEmp(int id);
	public List<Employee> updateEmployee(Employee e);
	

}

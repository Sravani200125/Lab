package org.capg.demo.dao;
import java.util.List;

import org.capg.demo.bean.*;

public interface EmployeeDao {
	public List<Employee> getEmployee();
	public Employee findEmployee(int id);
	public List<Employee> createEmployee(Employee e);
	public List<Employee> removeEmp(int id);
	public List<Employee> modifyEmployee(Employee e);

}

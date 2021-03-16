package org.capg.demo.dao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.capg.demo.bean.*;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    private static List<Employee> emplist;
    static {
    	emplist=new ArrayList<Employee>();
    	emplist.add(new Employee(101,"Amit",56000,LocalDate.parse("2000-01-30")));
    	emplist.add(new Employee(102,"Sri",46000,LocalDate.parse("1995-10-24")));
    	emplist.add(new Employee(103,"Jashu",66000,LocalDate.parse("1998-07-18")));
    	emplist.add(new Employee(104,"Harry",76000,LocalDate.parse("1993-06-12")));
    }
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		
		return emplist;
	}
	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		for(Employee e:emplist) {
			if(e.getId()==id)
				return e;
		}
		
		return null;
			
	}
	@Override
	public List<Employee> createEmployee(Employee e) {
		emplist.add(e);
		return emplist ;
	}
	@Override
	public List<Employee> removeEmp(int id) {
		Employee em=findEmployee(id);
		if(em!=null) {
			emplist.remove(em);
			return emplist;
		}
		return null;
	}
	@Override
	public List<Employee> modifyEmployee(Employee e) {
		int counter=0;
		for(Employee emp:emplist) {
			if(e.getId()==emp.getId()) {
				emplist.set(counter, e);
				return emplist;
			}
		counter++;	
		}
		return null;
	}

}

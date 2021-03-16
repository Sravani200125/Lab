package org.capg.demo.dao;

import org.capg.demo.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDaoJPA extends JpaRepository<Employee,Integer> {

}

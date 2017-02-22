package com.din.dao;

import java.util.List;

import com.din.entity.Employee;

public interface EmployeeDao {
	
	public List<Employee> listEmployees(Integer offset, Integer maxResults);
	
	public Employee listEmployee(int empid);
	
	public void deleteEmp(int empId);
	
	public Integer addEmp(Employee e);
	
	public Long empCount();

}

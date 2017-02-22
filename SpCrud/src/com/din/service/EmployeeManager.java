package com.din.service;

import java.util.List;

import com.din.entity.Employee;

public interface EmployeeManager {
	
	public List<Employee> listEmployee(Integer offset, Integer maxResults);

	public Employee listEmp(Integer employeeId);
	
	public void deleteEmp(int empId);
	
	public Integer addEmp(Employee e);
	
	public Long empCount();

}

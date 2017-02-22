package com.din.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.din.dao.EmployeeDao;
import com.din.entity.Employee;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	private EmployeeDao edao;
	
	@Override
	@Transactional
	public List<Employee> listEmployee(Integer offset, Integer maxResults) {
		return edao.listEmployees(offset, maxResults);
	}

	@Override
	@Transactional
	public Employee listEmp(Integer employeeId) {
		// TODO Auto-generated method stub
		return edao.listEmployee(employeeId);
	}

	@Override
	@Transactional
	public void deleteEmp(int empId) {
		// TODO Auto-generated method stub
		//return edao.listEmployee(employeeId);
		edao.deleteEmp(empId);
		
	}

	@Override
	@Transactional
	public Integer addEmp(Employee e) {
		// TODO Auto-generated method stub
		return edao.addEmp(e);
	}

	@Override
	@Transactional
	public Long empCount() {
		// TODO Auto-generated method stub
		return edao.empCount();
	}

}

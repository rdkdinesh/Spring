package com.din.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.din.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private SessionFactory sess;
	
	@SuppressWarnings("unchecked")
	public List<Employee> listEmployees(Integer offset, Integer maxResults){
		return this.sess.getCurrentSession().
				createCriteria(Employee.class).
				setFirstResult(offset!=null?(maxResults*(offset-1)):0).
				setMaxResults(maxResults!=null?maxResults:2).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Employee listEmployee(int empid) {
		// TODO Auto-generated method stub
		
		return (Employee) sess.getCurrentSession().get(Employee.class, empid);
	}

	@Override
	public void deleteEmp(int empId) {
		// TODO Auto-generated method stub
		Employee e = (Employee) sess.getCurrentSession().get(Employee.class, empId);
		sess.getCurrentSession().delete(e);
	}
	
	public Integer addEmp(Employee e){
		return (Integer) sess.getCurrentSession().save(e);
	}

	@Override
	public Long empCount() {
		// TODO Auto-generated method stub
		return (Long) sess.getCurrentSession().createCriteria(Employee.class).setProjection(Projections.rowCount()).uniqueResult();
	}


}

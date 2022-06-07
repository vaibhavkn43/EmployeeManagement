package com.cdac.hcdc.EmpM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.hcdc.EmpM.DAO.EmployeeDAOImpl;
import com.cdac.hcdc.EmpM.DAO.EmployeeDao;
import com.cdac.hcdc.EmpM.Model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> loadEmployees() {
	
		List<Employee> employeeList = employeeDao.loadEmployees();
		return employeeList;
	}
	@Override
	public void saveEmployee(Employee employee) {
		employeeDao.saveEmployee(employee);
		
	}
	@Override
	public Employee getEmployeeById(int id) {
		
		Employee employee=	employeeDao.getEmployeeById(id);
		return employee;
	}
	@Override
	public void updateEmployee(Employee ebyId) {
		employeeDao.updateEmployee(ebyId);
		
	}

}

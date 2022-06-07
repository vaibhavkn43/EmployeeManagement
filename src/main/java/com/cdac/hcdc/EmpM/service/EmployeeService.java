package com.cdac.hcdc.EmpM.service;
import java.util.List;

import com.cdac.hcdc.EmpM.Model.*;

public interface EmployeeService {
	
	
public List<Employee> loadEmployees();
public void saveEmployee(Employee employee);
public Employee getEmployeeById(int id);
public void updateEmployee(Employee ebyId);




}

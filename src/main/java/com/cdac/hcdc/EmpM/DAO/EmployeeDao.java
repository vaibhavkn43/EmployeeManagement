package com.cdac.hcdc.EmpM.DAO;



import java.util.List;

import com.cdac.hcdc.EmpM.Model.Employee;


public interface EmployeeDao {

public List<Employee> loadEmployees();
public void saveEmployee(Employee employee);
public Employee getEmployeeById(int id);
public void updateEmployee(Employee ebyId);
public void deleteEmployee(Integer eId);

}

package com.cdac.hcdc.EmpM.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.cdac.hcdc.EmpM.Model.Employee;
import com.cdac.hcdc.EmpM.rowMapper.EmployeeRowMapper;

// this class is service class for dao
@Repository
public class EmployeeDAOImpl implements EmployeeDao{

	// connect with DB  with jdbc
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Employee> loadEmployees() {

		//List<Employee> employeeList=new ArrayList<Employee>();
		
		String sql="SELECT * FROM employees";
		List<Employee> employeeList = jdbcTemplate.query(sql, new EmployeeRowMapper());
		
		
		return employeeList;
	}

	@Override
	public void saveEmployee(Employee employee) {
		
		Object[] sqlParameters={employee.getName() , employee.getMobile() , employee.getCountry()};
		String sql="insert into employees (name , mobile , country) values(?, ?, ?)";
		jdbcTemplate.update(sql, sqlParameters);
		
		System.out.println("1 Record Saved...");
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		String sql= "Select * from employees where id=?";
		Employee employee = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
		return employee;
	}

	@Override
	public void updateEmployee(Employee ebyId) {
		
		Object[] sqlParameters={ebyId.getName() , ebyId.getMobile() , ebyId.getCountry() , ebyId.getId()};
		String sql="UPDATE  employees set name = ? , mobile = ? , country = ? where id=? ";
		jdbcTemplate.update(sql, sqlParameters);
		
		System.out.println("1 Record Updated...");
	}

	@Override
	public void deleteEmployee(Integer eId) {
		String sql="Delete from employees where id=?";
		jdbcTemplate.update(sql,  eId);
		System.out.println("1 Record Deleted...");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

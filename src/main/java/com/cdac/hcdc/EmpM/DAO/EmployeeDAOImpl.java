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
	JdbcTemplate jdbcTemplate;
	
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

}

package com.cdac.hcdc.EmpM.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdac.hcdc.EmpM.DAO.EmployeeDAOImpl;
import com.cdac.hcdc.EmpM.DAO.EmployeeDao;
import com.cdac.hcdc.EmpM.Model.Employee;


@Controller
public class EmployeeController {
	
	//EmployeeDao employeeDao= new EmployeeDAOImpl();
	@Autowired
	private EmployeeDao employeeDao;
	
	//handler method for displaying employee list/table
	//@RequestMapping(value = "/showEmployee" , method = RequestMethod.GET)
	@GetMapping("/showEmployee")
	public String showEmployeeList(Model model)
	{
		List<Employee> employeeList = employeeDao.loadEmployees();
		model.addAttribute("employees", employeeList);
		
		return  "employee-list";
	}
	
	//handler method for add employee i.e add form
	
	//@RequestMapping(value = "/addEmployee" , method = RequestMethod.POST)
	//@PostMapping("/addEmployee")
	@GetMapping("/showEmployeeForm")
	public String addEmployee(Model model)
	{
		Employee emploDto = new Employee();
		model.addAttribute("employee", emploDto);
		return "add-employee";
	}

	
	//@GetMapping("/save-employee")
	@PostMapping("/save-employee")
	public String saveEmployee(Employee employee)
	{
		//do aa DAO call to save the data of employee 
		
		employeeDao.saveEmployee(employee);
		
		return "redirect:/showEmployee";
	}
	
	@ResponseBody
	@GetMapping("/thankyou")
	public String thankyou()
	{
		
		return "Thank You ...Your Details Has Been Saved...";
		
	}
}

package com.cdac.hcdc.EmpM.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdac.hcdc.EmpM.DAO.EmployeeDAOImpl;
import com.cdac.hcdc.EmpM.DAO.EmployeeDao;
import com.cdac.hcdc.EmpM.Model.Employee;
import com.cdac.hcdc.EmpM.service.EmployeeService;


@Controller
public class EmployeeController {
	
	
	
	@Autowired
	EmployeeService employeeService;
	
	
	//handler method for displaying employee list/table
	//@RequestMapping(value = "/showEmployee" , method = RequestMethod.GET)
	@GetMapping("/showEmployee")
	public String showEmployeeList(Model model)
	{
		//service call
		List<Employee> employeeList = employeeService.loadEmployees();
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
		// condition check
		// if user having id--> its update opertaion
		//if user dont have id its insert opertaion
		
		if(employee.getId()==0)
		{
		//insert new employee or insert new record	
			employeeService.saveEmployee(employee);
		}
		else
		{
			employeeService.updateEmployee(employee);
		}
		
		//do aa Service call to save the data of employee 
		
		return "redirect:/showEmployee";
	}
	
	@ResponseBody
	@GetMapping("/thankyou")
	public String thankyou()
	{
		return "Thank You ...Your Details Has Been Saved...";
	}
	
	@GetMapping("/updateEmployee")
	public String updateEmployee(@RequestParam("userId") int id, Model model)
	{
		
		Employee ebyId = employeeService.getEmployeeById(id);
		
		model.addAttribute("employee", ebyId);
		return "add-employee";
	}
	

	
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("userId") int id)
	{
		
		employeeService.deleteEmployee(id);
		
		return "redirect:/showEmployee";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
    public String index() {
        return "Spring Boot Employee Example";
    }
	
	@PostMapping( path="/saveEmployee" , consumes="application/json", produces="application/json")
	public @ResponseBody Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@GetMapping(path = "/getAllEmployee", produces="application/json")
	public @ResponseBody List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	@PostMapping(path="/getEmployee", consumes="application/json", produces="application/json")
	public @ResponseBody Employee getEmployeebyId(@RequestBody int empId) {
		return employeeService.getEmployeebyId(empId);
	}
}

package com.employee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDaoRepository;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDaoRepository employeeDaoRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDaoRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeDaoRepository.findAll();
	}

	@Override
	public Employee getEmployeebyId(int empId) {
		return employeeDaoRepository.findOne(empId);
	}

}

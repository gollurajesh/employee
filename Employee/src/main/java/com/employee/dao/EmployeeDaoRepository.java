package com.employee.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employee.model.Employee;

public interface EmployeeDaoRepository extends MongoRepository<Employee, Integer>{

}

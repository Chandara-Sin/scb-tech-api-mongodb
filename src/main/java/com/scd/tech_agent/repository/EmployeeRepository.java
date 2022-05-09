package com.scd.tech_agent.repository;

import com.scd.tech_agent.model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}

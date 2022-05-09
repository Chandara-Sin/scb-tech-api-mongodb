package com.scd.tech_agent.repository;

import com.scd.tech_agent.model.Employee;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}

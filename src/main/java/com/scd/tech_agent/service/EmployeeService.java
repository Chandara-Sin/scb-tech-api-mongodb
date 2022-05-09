package com.scd.tech_agent.service;

import java.util.List;

import com.scd.tech_agent.model.Employee;
import com.scd.tech_agent.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeesRepo;

    public List<Employee> getAllEmployees() throws Exception {
        try {
            return employeesRepo.findAll();
        } catch (Exception e) {
            throw new Exception("Some error occurred while retrieving Employees");
        }
    }

    public Employee addEmployee(Employee dataRequest) throws Exception {
        try {
            return employeesRepo.save(dataRequest);
        } catch (Exception e) {
            throw new Exception("Some error occurred while creating the Employee");
        }
    }

}

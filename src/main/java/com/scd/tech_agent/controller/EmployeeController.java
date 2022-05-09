package com.scd.tech_agent.controller;

import java.util.List;

import com.scd.tech_agent.model.Employee;
import com.scd.tech_agent.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeServ;

    @GetMapping("")
    public ResponseEntity<List<Employee>> getAllEmployees() throws Exception {
        return new ResponseEntity<>(employeeServ.getAllEmployees(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Employee> addEmployee(@Validated @RequestBody Employee dataRequest) throws Exception {
        return new ResponseEntity<Employee>(employeeServ.addEmployee(dataRequest), HttpStatus.CREATED);
    }

}

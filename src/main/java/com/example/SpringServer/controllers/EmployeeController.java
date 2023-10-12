package com.example.SpringServer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringServer.model.employee.Employee;
import com.example.SpringServer.model.employee.EmployeeDao;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;

    @GetMapping("/employee/get-all")
    public List<Employee> getAllEmployees (){
        return employeeDao.getAllEmployees();
    }

    @PostMapping("/employee")
    public Employee save(@RequestBody Employee employee){
        return employeeDao.save(employee);
    }
    
}

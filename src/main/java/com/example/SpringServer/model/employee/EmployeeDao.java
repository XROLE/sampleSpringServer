package com.example.SpringServer.model.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDao {

    @Autowired
    private EmployeeRepository repository;

    public void save(Employee employee) {
        repository.save(employee);
    }

    public void delete(Employee employee){
        repository.delete(employee);
    }
    
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(employee -> {
            employees.add(employee);
        } );

      return  employees;
    }
}

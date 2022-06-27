package com.mongo.demo.service;

import com.mongo.demo.model.Employee;
import com.mongo.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.util.*;
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/")
    public Employee save(Employee emp){
        emp.setJoiningDate(new Date());
        return employeeRepository.save(emp);
    }

    public List<Employee> getAll() {
        return employeeRepository.find();
    }

    public Employee update(Employee emp) {
        return employeeRepository.save(emp);
    }

    public long delete(Employee emp) {
        return employeeRepository.delete(emp);
    }

    public List<Employee> getBySalary(int salary) {
        return employeeRepository.findBySalary(salary);
    }

    public List<Employee> getByfirstName(String firstName) {
        return employeeRepository.findByfirstName(firstName);
    }
}

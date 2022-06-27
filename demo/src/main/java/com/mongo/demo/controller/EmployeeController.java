package com.mongo.demo.controller;
import java.util.*;
import com.mongo.demo.model.Employee;
import com.mongo.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/")
    public Employee save(@RequestBody Employee emp){
        return employeeService.save(emp);
    }

    @GetMapping("/")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }

    @PutMapping("/")
    public Employee update(@RequestBody Employee emp){
        return employeeService.update(emp);
    }

    @DeleteMapping("/")
    public long delete(@RequestBody Employee emp){
        return employeeService.delete(emp);
    }

    @GetMapping("/salary/")
    public List<Employee> getBySalary(@PathParam("salary") int salary){
        return employeeService.getBySalary(salary);
    }

    @GetMapping("/firstname/")
    public List<Employee> getByfirstName(@PathParam("firstName") String firstName){
        return employeeService.getByfirstName(firstName);
    }

}

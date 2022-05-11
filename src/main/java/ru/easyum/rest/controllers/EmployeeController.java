package ru.easyum.rest.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.easyum.rest.entity.Employee;
import ru.easyum.rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getAll() {
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return employeeService.findEmployeeById(id);
    }

    @PostMapping("/")
    public String add(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "OK";
    }
}
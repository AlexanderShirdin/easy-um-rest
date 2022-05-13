package ru.easyum.rest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.easyum.rest.dao.EmployeeDao;
import ru.easyum.rest.entity.Employee;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    @Override
    public List<Employee> findAllEmployee() {
        return employeeDao.findAllEmployee();
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeDao.findEmployeeById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee, Long id) {
        employee.setId(id);
        employeeDao.updateEmployee(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeDao.deleteEmployeeById(id);
    }
}
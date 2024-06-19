package org.example.Service;

import org.example.Model.Employee;

import java.util.List;

public interface EmployeeService {
    void  save (Employee employee);
    Employee getEmployeeById(int id);
    void update (Employee employee);
    void delete (Employee employee);
    List<Employee> getAllEmployees();

}

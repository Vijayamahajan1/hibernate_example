package org.example.Dao;


import org.example.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeDao{
   void  save (Employee employee);
   Employee getEmployeeById(int id);
   void update (Employee employee);
   void delete (Employee employee);
   List<Employee> getAllEmployees();
}

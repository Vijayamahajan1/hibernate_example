package org.example.Controller;

import org.example.Model.Address;
import org.example.Model.Employee;
import org.example.Service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/OneToMany")
public class EmployeeController {

        @Autowired
    EmployeeServiceImpl employeeService;

        @PostMapping("/save")
        public void save(@RequestBody Employee employee) {
            employeeService.save(employee);
        }

        @GetMapping("/getall")
        public List<Employee> getAllEmployees(){
            return employeeService.getAllEmployees();
        }

        @GetMapping("/{id}")
        public Employee getEmployeeById(@PathVariable("id") int id,@RequestBody Address address){
            return employeeService.getEmployeeById(id);
        }

        @PutMapping("/update/{id}")
        public void updateEmployee(@PathVariable("id") int id ,@RequestBody Employee employee){
            employee.setId(id);
            employeeService.update(employee);
        }
        @DeleteMapping("/delete/{id}")
        public void deleteAddress(@PathVariable("id") int id){
           Employee employee = employeeService.getEmployeeById(id);
            employeeService.delete(employee);
        }
    }



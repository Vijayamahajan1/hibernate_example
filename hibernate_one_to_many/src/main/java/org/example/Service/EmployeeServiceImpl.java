package org.example.Service;

import org.example.Dao.EmployeeDao;
import org.example.Dao.EmployeeDaoImpl;
import org.example.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class EmployeeServiceImpl implements  EmployeeService{
    @Autowired
    EmployeeDaoImpl employeeDao;

    @Override
    public void save(Employee employee) {
       this.employeeDao.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return  this.employeeDao.getEmployeeById(id);
    }

    @Override
    public void update(Employee employee) {
       this.employeeDao.update(employee);
    }

    @Override
    public void delete(Employee employee) {
       this.employeeDao.delete(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeDao.getAllEmployees();
    }
}

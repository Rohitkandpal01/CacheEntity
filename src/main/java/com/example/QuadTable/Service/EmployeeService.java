package com.example.QuadTable.Service;

import com.example.QuadTable.Model.Employee;
import com.example.QuadTable.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @CacheEvict(value = "employees", allEntries=true)
    public Employee createEmpolyeeDetails(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Cacheable("employees")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @CacheEvict(value = "employees",allEntries = true)
    public void delete(int id) {
        employeeRepository.delete(employeeRepository.findById(id).get());
    }
}

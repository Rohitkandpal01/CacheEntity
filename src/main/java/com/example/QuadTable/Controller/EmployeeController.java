package com.example.QuadTable.Controller;

import com.example.QuadTable.Model.Employee;
import com.example.QuadTable.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/createEmployee")
    private Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmpolyeeDetails(employee);
    }

    @GetMapping("/getEmployees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

  @DeleteMapping("/deleteEmployee")
    public void delete(@RequestParam("id")int id){
        employeeService.delete(id);
    }

}

package com.example.Fullstack.controllers;

import com.example.Fullstack.entity.EmployeeEntity;
import com.example.Fullstack.exceptions.ApiRequestException;
import com.example.Fullstack.model.Employee;
import com.example.Fullstack.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
      return   employeeService.createEmployee(employee);
    }
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){

        return employeeService.getAllEmployees();
    }
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id){

        boolean deleted=false;
       deleted= employeeService.deleteEmployee(id);
       Map<String,Boolean> m=  new HashMap<>();
       m.put("deleted",deleted);
       return ResponseEntity.ok(m);


    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee>  getEmployeeById(@PathVariable Long id) throws Exception {

       Employee employee=employeeService.getEmployeeById(id);

       if(employee==null) {
          throw new ApiRequestException("No Employee found");
       }
        return ResponseEntity.ok(employee);
    }
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        employee=employeeService.updateEmployee(id,employee);
        return ResponseEntity.ok(employee);
    }
}

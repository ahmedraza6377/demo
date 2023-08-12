package com.employee.demo.Controller;

import com.employee.demo.Model.Employee;
import com.employee.demo.Service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class empController {

    @Autowired
    empService empService;

    @PostMapping("/emp")
    public String addEmployee(@RequestBody Employee emp){

        return empService.addEmployee(emp);
    }

    @GetMapping("/emps")
    public ArrayList<Employee> getAllEMployess(){
        return empService.getAllEmployess();
    }
}

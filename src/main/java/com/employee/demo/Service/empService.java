package com.employee.demo.Service;

import com.employee.demo.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class empService {

      ArrayList<Employee> employees= new ArrayList<>();
    public String addEmployee(Employee emp) {
        employees.add(emp);
        return "added";

    }

    public ArrayList<Employee> getAllEmployess() {
        ArrayList<Employee> list=employees;
        return list;
    }
}

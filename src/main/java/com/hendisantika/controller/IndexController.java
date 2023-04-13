package com.hendisantika.controller;

import com.hendisantika.entity.Employee;
import com.hendisantika.service.EmployeeService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/10/21
 * Time: 05.55
 */
@RestController
@RequestMapping("/employees")
public class IndexController {
    @Autowired
    private EmployeeService employeeService;

    //this method can be accessed by user whose role is user
    @GetMapping("/{employeeId}")
    @RolesAllowed("user")
    public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {
        return ResponseEntity.ok(employeeService.getEmployee(employeeId));
    }

    //this method can be accessed by user whose role is admin
    @GetMapping
    @RolesAllowed("admin")
    public ResponseEntity<List<Employee>> findAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }
}

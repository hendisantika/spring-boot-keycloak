package com.hendisantika.controller;

import com.hendisantika.entity.Employee;
import com.hendisantika.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
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
@RequiredArgsConstructor
@RequestMapping("/employees")
public class IndexController {
    private final EmployeeService employeeService;

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

    @PostMapping
    @RolesAllowed("admin")
    public ResponseEntity<Employee> addNewEmployee(@RequestBody Employee employee) {
        return ResponseEntity.ok(employeeService.addNewEmployee(employee));
    }
}

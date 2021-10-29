package com.hendisantika.service;

import com.hendisantika.entity.Employee;
import com.hendisantika.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/10/21
 * Time: 05.50
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostConstruct
    public void initializeEmployeeTable() {
        employeeRepository.saveAll(
                Stream.of(
                        new Employee("naruto", 20000),
                        new Employee("sasuke", 55000),
                        new Employee("sakura", 120000),
                        new Employee("kakashi", 120000),
                        new Employee("hinata", 120000),
                        new Employee("kiba", 120000),
                        new Employee("shino", 120000),
                        ).collect(Collectors.toList()));
    }

    public Employee getEmployee(int employeeId) {
        return employeeRepository
                .findById(employeeId)
                .orElse(null);
    }
}

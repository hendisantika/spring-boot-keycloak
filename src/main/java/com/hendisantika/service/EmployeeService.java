package com.hendisantika.service;

import com.hendisantika.entity.Employee;
import com.hendisantika.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
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
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

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
                        new Employee("asuma", 120000),
                        new Employee("shikamaru", 120000),
                        new Employee("choji", 120000),
                        new Employee("ino", 120000)
                ).collect(Collectors.toList()));
        log.info("Save all employees");
    }

    public Employee getEmployee(int employeeId) {
        log.info("Get employee by ID");
        return employeeRepository
                .findById(employeeId)
                .orElse(null);
    }

    public List<Employee> getAllEmployees() {
        log.info("Get all employees");
        return employeeRepository
                .findAll();
    }

    public Employee addNewEmployee(Employee employee) {
        log.info("Add new employee");
        return employeeRepository.save(employee);
    }
}

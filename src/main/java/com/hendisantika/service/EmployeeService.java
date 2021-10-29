package com.hendisantika.service;

import com.hendisantika.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}

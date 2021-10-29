package com.hendisantika.repository;

import com.hendisantika.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-keycloak
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/10/21
 * Time: 05.50
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

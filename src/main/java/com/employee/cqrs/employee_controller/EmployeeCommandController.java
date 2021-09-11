package com.employee.cqrs.employee_controller;

import com.employee.cqrs.employee_service.EmployeeDto;
import com.employee.cqrs.employee_service.EmployeeCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeCommandController {
    @Autowired
    private EmployeeCommandService employeeCommandService;

    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> createEmployee(
            @RequestHeader String clientId,
            @RequestBody EmployeeDto employeeDto ) {
        System.out.println(employeeCommandService);
        return new ResponseEntity<EmployeeDto>(this.employeeCommandService.createEmployee(employeeDto), HttpStatus.CREATED);
    }

}

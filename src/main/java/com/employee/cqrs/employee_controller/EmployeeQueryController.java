package com.employee.cqrs.employee_controller;

import com.employee.cqrs.employee_service.EmployeeDto;
import com.employee.cqrs.employee_service.EmployeeQueryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeQueryController {

    private EmployeeQueryService employeeQueryService;

    @GetMapping("/getEmployee/{empId}")
    public ResponseEntity<EmployeeDto> getEmployeeDetailsById(@PathVariable("empId") Long empId) {
        return new ResponseEntity<>(this.employeeQueryService.getEmployeeDetailsById(empId), HttpStatus.OK);
    }

    @GetMapping("/instance")
    public String getInstance() {
        return "Instance1";
    }
}

package com.employee.cqrs.employee_service;

public interface EmployeeQueryService {
    EmployeeDto getEmployeeDetailsById(Long empId);
}

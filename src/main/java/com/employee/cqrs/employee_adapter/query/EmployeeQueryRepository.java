package com.employee.cqrs.employee_adapter.query;

import com.employee.cqrs.employee_service.EmployeeDto;

public interface EmployeeQueryRepository {
     EmployeeDto getEmployeeDetails(Long empId);
}

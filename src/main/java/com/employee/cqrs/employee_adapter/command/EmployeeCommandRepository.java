package com.employee.cqrs.employee_adapter.command;

import com.employee.cqrs.employee_service.EmployeeDto;

public interface EmployeeCommandRepository {

    EmployeeDto create(EmployeeDto employeeDto);
}

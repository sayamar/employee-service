package com.employee.cqrs.employee_service;

import com.employee.cqrs.employee_adapter.command.EmployeeCommandRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class EmployeCommandServiceImpl implements EmployeeCommandService {

    private EmployeeCommandRepository employeeCommandRepository;

    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
       return this.employeeCommandRepository.create(employeeDto);
    }
}

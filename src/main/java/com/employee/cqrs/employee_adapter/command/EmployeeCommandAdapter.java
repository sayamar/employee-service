package com.employee.cqrs.employee_adapter.command;

import com.employee.cqrs.employee_adapter.EmployeeMapper;
import com.employee.cqrs.employee_adapter.Employee;
import com.employee.cqrs.employee_adapter.EmployeeRepository;
import com.employee.cqrs.employee_service.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class EmployeeCommandAdapter implements EmployeeCommandRepository{

    private EmployeeRepository employeeRepository;
    private EmployeeMapper employeeMapper;

    @Override
    public EmployeeDto create(EmployeeDto employeeDto) {
        Employee createdEmployee =
                this.employeeRepository.saveAndFlush
                        (this.employeeMapper.createEmployee(employeeDto));
        return this.employeeMapper.createEmployeeDto(createdEmployee);
    }
}

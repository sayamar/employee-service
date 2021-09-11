package com.employee.cqrs.employee_adapter.query;

import com.employee.cqrs.employee_adapter.EmployeeMapper;
import com.employee.cqrs.employee_adapter.EmployeeRepository;
import com.employee.cqrs.employee_service.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class EmployeeQueryAdapter implements EmployeeQueryRepository {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeMapper employeeMapper;

    public EmployeeDto getEmployeeDetails(Long empId) {
        return employeeMapper.getEmployeeDetails(this.employeeRepository.findById(empId));
    }


}

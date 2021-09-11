package com.employee.cqrs.employee_service;

import com.employee.cqrs.employee_adapter.query.EmployeeQueryAdapter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class EmployeeQueryServiceImpl implements EmployeeQueryService {
    @Autowired
    private EmployeeQueryAdapter employeeQueryAdapter;

    @Override
    public EmployeeDto getEmployeeDetailsById(Long empId) {
        return employeeQueryAdapter.getEmployeeDetails(empId);
    }
}

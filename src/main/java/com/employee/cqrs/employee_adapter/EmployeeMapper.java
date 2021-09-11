package com.employee.cqrs.employee_adapter;

import com.employee.cqrs.employee_service.EmployeeDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class EmployeeMapper {

    public EmployeeDto createEmployeeDto(Employee employee1) {
        return EmployeeDto
                .builder()
                .empName(employee1.getEmpName())
                .age(employee1.getAge())
                .emailId(employee1.getEmailId())
                .city(employee1.getCity())
                .deptId(employee1.getDeptId())
                .contactNo(employee1.getContactNo())
                .location(employee1.getLocation())
                .role(employee1.getRole())
                .empId(employee1.getEmpId())
                .build();
    }

    public EmployeeDto getEmployeeDetails(Optional<Employee> optionalEmployee) {
        Employee employee1 = optionalEmployee.get();
        return EmployeeDto
                .builder()
                .empName(employee1.getEmpName())
                .age(employee1.getAge())
                .emailId(employee1.getEmailId())
                .city(employee1.getCity())
                .deptId(employee1.getDeptId())
                .contactNo(employee1.getContactNo())
                .location(employee1.getLocation())
                .role(employee1.getRole())
                .empId(employee1.getEmpId())
                .build();
    }

    public Employee createEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setEmpId(employeeDto.getEmpId());
        employee.setAge(employeeDto.getAge());
        employee.setCity(employeeDto.getCity());
        employee.setContactNo(employeeDto.getContactNo());
        employee.setRole(employeeDto.getRole());
        employee.setLocation(employeeDto.getLocation());
        employee.setEmpName(employeeDto.getEmpName());
        employee.setDeptId(employeeDto.getDeptId());
        employee.setEmailId(employee.getEmailId());
        return employee;

    }


}

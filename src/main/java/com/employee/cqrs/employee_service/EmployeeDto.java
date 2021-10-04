package com.employee.cqrs.employee_service;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class EmployeeDto {
    private Long empId;
    private String empName;
    private int age;
    private String role;
    private Long deptId;
    private String city;
    private String location;
    private String contactNo;
    private String emailId;
    private String password;
}

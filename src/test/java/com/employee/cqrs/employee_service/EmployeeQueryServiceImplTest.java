package com.employee.cqrs.employee_service;

import com.employee.cqrs.employee_adapter.query.EmployeeQueryAdapter;
import com.employee.cqrs.employee_adapter.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EmployeeQueryServiceImplTest {

    @InjectMocks
    private EmployeeQueryServiceImpl employeeQueryService;
    @Mock
    private EmployeeRepository employeeRepository;
    @Mock
    private EmployeeQueryAdapter employeeQueryAdapter;

    @Test
    public void testShouldReturnEmployeeList() {

    }


    @Test
    public void testShouldReturnsEmployeeDetailsById() {
        // Given
//        Mockito.when(employeeRepository.findById(200L))
//               .thenReturn(java.util.Optional.ofNullable(Employee.builder().empName("Maruthi").age(40).build()));
//
//        // When
//        EmployeeDto employeeDto = employeeQueryService.getEmployeeDetailsById(200L);
//
//        // Then
//        Assertions.assertNotNull(employeeDto);
//    }
    }


    @Test
    public void testShouldReturnsListOfEmployeeByDeptId() {

    }

    public void testShouldReturnsListOfEmployeesByRole() {

    }
}

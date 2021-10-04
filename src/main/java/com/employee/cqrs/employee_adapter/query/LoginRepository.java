package com.employee.cqrs.employee_adapter.query;

import com.employee.cqrs.employee_adapter.LoginDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginDetails,String> {
}

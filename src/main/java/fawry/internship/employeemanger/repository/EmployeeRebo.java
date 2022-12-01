package fawry.internship.employeemanger.repository;

import fawry.internship.employeemanger.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRebo extends JpaRepository<Employee,Long> {
public List<Employee> findByDepartmentId(Long id);
}

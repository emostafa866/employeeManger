package fawry.internship.employeemanger.repository;

import fawry.internship.employeemanger.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRebo extends JpaRepository<Department,Long> {

}

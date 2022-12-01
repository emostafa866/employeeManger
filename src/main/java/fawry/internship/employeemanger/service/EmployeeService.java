package fawry.internship.employeemanger.service;

import fawry.internship.employeemanger.errors.RecordNotFoundException;
import fawry.internship.employeemanger.model.Employee;
import fawry.internship.employeemanger.repository.EmployeeRebo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRebo employeeRebo;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
         return employeeRebo.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRebo.findAll();
    }

    public Employee getEmployee(Long id){
        return employeeRebo.findById(id).orElseThrow(()->new RecordNotFoundException("id "+ id +"doesn't exist"));
    }

    public Employee updateEmployee(Employee employee){
        return employeeRebo.save(employee);
    }

    public void deleteEmployee(Long id){
        employeeRebo.deleteById(id);
    }

    public List<Employee> findByDepartmentId(Long id){

        return employeeRebo.findByDepartmentId(id);
    }
}

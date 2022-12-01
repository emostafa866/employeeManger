package fawry.internship.employeemanger.service;

import fawry.internship.employeemanger.errors.RecordNotFoundException;
import fawry.internship.employeemanger.model.Department;
import fawry.internship.employeemanger.repository.DeptRebo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
@Autowired
   private DeptRebo deptRebo;
    public Department addDepartment(Department department){
        return deptRebo.save(department);
    }
    public Department getDepartment(Long id){
        return deptRebo.findById(id).orElseThrow(()->new RecordNotFoundException("not exixst"));
    }
    public List<Department> getAllDepartments(){
        return deptRebo.findAll();
    }
    public void delete(Long id){
        deptRebo.deleteById(id);
    }
}

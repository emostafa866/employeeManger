package fawry.internship.employeemanger.controller;

import fawry.internship.employeemanger.model.Department;
import fawry.internship.employeemanger.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Department addDepartment(@RequestBody Department department){

        return deptService.addDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable(value = "id") Long id){
        return deptService.getDepartment(id);
    }


    @GetMapping("")
    public List<Department> getAllDepartments(){
        return deptService.getAllDepartments();
    }


    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id){
         deptService.delete(id);
    }
}

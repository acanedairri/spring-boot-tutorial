package com.irri.propertymanagement.controller;

import com.irri.propertymanagement.dto.EmployeeDTO;
import com.irri.propertymanagement.entity.EmployeeEntity;
import com.irri.propertymanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        EmployeeDTO employeeDTOSaveToDb=employeeService.addEmployee(employeeDTO);
        ResponseEntity<EmployeeDTO> responseEntity = new ResponseEntity<EmployeeDTO>(employeeDTOSaveToDb,HttpStatus.CREATED);
        System.out.println("Test");
        return responseEntity;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeDTO>> getAllEmployee(){
        List<EmployeeDTO> lstEmp = employeeService.findAllEmployee();
        return new ResponseEntity<List<EmployeeDTO>>(lstEmp,HttpStatus.OK);
    }
}

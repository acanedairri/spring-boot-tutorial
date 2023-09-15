package com.irri.propertymanagement.service;

import com.irri.propertymanagement.dto.EmployeeDTO;
import com.irri.propertymanagement.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    public EmployeeDTO addEmployee(EmployeeDTO employee);
    public List<EmployeeDTO> findAllEmployee();


}

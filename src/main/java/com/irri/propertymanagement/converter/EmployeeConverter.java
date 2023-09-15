package com.irri.propertymanagement.converter;

import com.irri.propertymanagement.dto.EmployeeDTO;
import com.irri.propertymanagement.entity.EmployeeEntity;
import org.springframework.stereotype.Component;

@Component
public class EmployeeConverter {

    public EmployeeEntity convertDTOtoEntity(EmployeeDTO employeeDTO){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setId(employeeDTO.getId());
        employeeEntity.setName(employeeDTO.getName());
        return employeeEntity;
    }

    public EmployeeDTO convertEntityToDTO(EmployeeEntity employeeEntity){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employeeEntity.getId());
        employeeDTO.setName(employeeEntity.getName());
        return employeeDTO;
    }
}

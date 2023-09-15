package com.irri.propertymanagement.dto;

import com.irri.propertymanagement.entity.EmployeeEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
    private Long id;
    private String address;
    private EmployeeDTO employee;
}

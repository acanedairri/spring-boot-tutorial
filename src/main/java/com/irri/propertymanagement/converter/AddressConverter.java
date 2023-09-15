package com.irri.propertymanagement.converter;

import com.irri.propertymanagement.dto.AddressDTO;
import com.irri.propertymanagement.entity.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AddressConverter {

    @Autowired
    private EmployeeConverter employeeConverter;


    public AddressEntity convertDTOtoEntity(AddressDTO addressDTO) {
        AddressEntity addressEntity = new AddressEntity();
        addressEntity.setAddress(addressDTO.getAddress());
        addressEntity.setEmployee(employeeConverter.convertDTOtoEntity(addressDTO.getEmployee()));
        return addressEntity;
    }

    public AddressDTO convertEntitytoDTO(AddressEntity addressEntity) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(addressEntity.getId());
        addressDTO.setAddress(addressEntity.getAddress());
        return addressDTO;
    }
}

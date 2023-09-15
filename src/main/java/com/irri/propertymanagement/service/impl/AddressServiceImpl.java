package com.irri.propertymanagement.service.impl;

import com.irri.propertymanagement.converter.AddressConverter;
import com.irri.propertymanagement.dto.AddressDTO;
import com.irri.propertymanagement.entity.AddressEntity;
import com.irri.propertymanagement.repository.AddressRepository;
import com.irri.propertymanagement.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AddressConverter  addressConverter;

    @Override
    public AddressDTO addAddress(AddressDTO address) {
        AddressEntity addressEntity = addressConverter.convertDTOtoEntity(address);
        addressEntity= addressRepository.save(addressEntity);
        AddressDTO addressDTO = addressConverter.convertEntitytoDTO(addressEntity);
       return addressDTO;
    }
}

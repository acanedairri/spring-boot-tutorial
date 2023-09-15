package com.irri.propertymanagement.service.impl;

import com.irri.propertymanagement.converter.AddressConverter;
import com.irri.propertymanagement.converter.EmployeeConverter;
import com.irri.propertymanagement.dto.AddressDTO;
import com.irri.propertymanagement.dto.EmployeeDTO;
import com.irri.propertymanagement.entity.EmployeeEntity;
import com.irri.propertymanagement.repository.EmployeeRepository;
import com.irri.propertymanagement.service.AddressService;
import com.irri.propertymanagement.service.EmployeeService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeConverter employeeConverter;
    @Autowired
    private AddressConverter addressConverter;
    @Autowired
    private AddressService addressService;
    @PersistenceContext
    EntityManager em;
    @Transactional
    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employee) {
        EmployeeEntity employeeDTOSaveToDb = employeeConverter.convertDTOtoEntity(employee);
        employeeDTOSaveToDb = employeeRepository.save(employeeDTOSaveToDb);
        EmployeeDTO employeeDTO = employeeConverter.convertEntityToDTO(employeeDTOSaveToDb);
        AddressDTO address = new AddressDTO();
        address.setId(123L);
        address.setAddress("Varanasi");
        address.setEmployee(employeeDTO);
        addressService.addAddress(address);

        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> findAllEmployee() {
        Query q = em.createNamedQuery("Employee.findAllEmployees");
        return q.getResultList();
    }
}

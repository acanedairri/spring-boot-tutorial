package com.irri.propertymanagement.repository;

import com.irri.propertymanagement.dto.EmployeeDTO;
import com.irri.propertymanagement.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    List<EmployeeDTO> findByName(String name);

    List<EmployeeDTO> findAllEmployee();
}

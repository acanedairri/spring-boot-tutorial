package com.irri.propertymanagement.repository;


import com.irri.propertymanagement.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<AddressEntity, Long> {

}

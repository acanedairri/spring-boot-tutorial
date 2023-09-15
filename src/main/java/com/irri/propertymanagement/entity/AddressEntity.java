package com.irri.propertymanagement.entity;

import com.irri.propertymanagement.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="address_info")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String address;
    @OneToOne
    private EmployeeEntity employee;
}


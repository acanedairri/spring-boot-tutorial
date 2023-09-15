package com.irri.propertymanagement.entity;

import com.irri.propertymanagement.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="emp_info")

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "Employee.findAllEmployees",
                query =
                        "SELECT * " +
                                "FROM emp_info ", resultClass = EmployeeDTO.class
        ),
        @NamedNativeQuery(
                name = "Employee.findEmployeeByName",
                query =
                        "SELECT * " +
                                "FROM emp_info p " +
                                "WHERE p.name = ?", resultClass = EmployeeDTO.class)

})
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private  LocalDateTime createdAt;
    private  LocalDateTime editedAt;



}

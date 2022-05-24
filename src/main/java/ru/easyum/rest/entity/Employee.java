package ru.easyum.rest.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(min = 2, max = 20, message = "Invalid size")
    @NotBlank(message = "Field not be empty")
    private String firstName;
    private String lastName;
    private Double salary;
    @NotBlank(message = "Field not be empty")
    private String department;
}
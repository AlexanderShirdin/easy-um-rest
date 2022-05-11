package ru.easyum.rest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Double salary;
    private String department;
}
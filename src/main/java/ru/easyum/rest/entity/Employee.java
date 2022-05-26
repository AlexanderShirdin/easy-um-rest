package ru.easyum.rest.entity;

import lombok.Data;
import ru.easyum.rest.validation.EmailCheck;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

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
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$",
    message = "Invalid Number")
    private String number;
    @EmailCheck
    @Pattern(regexp ="^[a-zA-Z0-9_+&*-]+(\\.[a-zA-Z0-9_+&*-]+)*@([spring-]+\\.)[com]{2,7}$", message = "Invalid Email")
    private String email;//spring.com

}
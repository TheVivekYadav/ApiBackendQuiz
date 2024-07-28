package com.vivek.Project01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RegisterUser {
    @Id
    private long rollNo;
    private String name;
    private int age;
    private String email;
    private String address;
    private List<String> coursesEnrolled;
    private double sgpa;
    private LocalDate Date;
    private LocalDate dob;
    private String contactNumber;
    private String yearOfSemester;
    private Role role;

}

package com.servdev.backend_with_database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Table(name = "students")
public class StudentEntity {

    @Id
    private String email;
    private String name;
    private String studGroup;
    private Double gpa;

}

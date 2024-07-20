package com.servdev.backend_with_database.service;

import com.servdev.backend_with_database.entity.StudentEntity;
import java.util.List;
import java.util.Optional;


public interface StudentService {
    List<StudentEntity> findAllStudents();
    Optional<StudentEntity> findStudentById(String email);
    StudentEntity saveStudent(StudentEntity student);
    StudentEntity updateStudent(StudentEntity student);
    void deleteStudent(String email);
}

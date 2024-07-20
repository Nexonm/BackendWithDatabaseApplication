package com.servdev.backend_with_database.service.impl;

import com.servdev.backend_with_database.entity.StudentEntity;
import com.servdev.backend_with_database.repository.StudentRepository;
import com.servdev.backend_with_database.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentEntity> findStudentById(String email) {
        return studentRepository.findById(email);
    }

    @Override
    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteById(email);
    }
}

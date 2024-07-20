package com.servdev.backend_with_database.controller;

import com.servdev.backend_with_database.entity.StudentEntity;
import com.servdev.backend_with_database.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {


    private final StudentService studentService;

    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentEntity> findAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/{email}")
    public Optional<StudentEntity> findStudentById(@PathVariable("email") String email){
        return studentService.findStudentById(email);
    }

    @PostMapping
    public StudentEntity saveStudent(@RequestBody StudentEntity student){
        System.out.println(student);
        return studentService.saveStudent(student);
    }

    @PutMapping
    public StudentEntity updateStudent(@RequestBody StudentEntity student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable("email") String email){
        studentService.deleteStudent(email);
    }

}

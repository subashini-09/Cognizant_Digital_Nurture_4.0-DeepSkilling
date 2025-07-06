package com.example.studentdemo.controller;

import com.example.studentdemo.entity.Student;
import com.example.studentdemo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAll();
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
    }
}

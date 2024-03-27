package com.opinno.demo_rest_controller.controller;

import com.opinno.demo_rest_controller.model.Student;
import com.opinno.demo_rest_controller.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){

        List<Student> students = studentService.getStudents();

        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity<String> insertStudent(@RequestBody Student student) {

        studentService.save(student);
        
        return new ResponseEntity<>("Student saved", HttpStatus.OK);
    }
    
}

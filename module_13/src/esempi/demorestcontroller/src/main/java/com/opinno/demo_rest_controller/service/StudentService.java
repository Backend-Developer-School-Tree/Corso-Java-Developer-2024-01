package com.opinno.demo_rest_controller.service;

import com.opinno.demo_rest_controller.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(Student.builder()
                .code("0001")
                .email("davide@dummyemail.com")
                .id(0L).build());

        students.add(Student.builder()
                .code("0002")
                .email("anna@dummyemail.com")
                .id(1L).build());
    }

    public void save(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }
}

package com.springrestcontroller.Spring_Rest_Controller.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class StudentRestController {
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Titas", "karmakar"));
        students.add(new Student("Ram", "karmakar"));
        students.add(new Student("ABC", "karmakar"));

        return students;

    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Titas", "karmakar"));
        students.add(new Student("Ram", "karmakar"));
        students.add(new Student("ABC", "karmakar"));

        return students.get(studentId);

    }
}

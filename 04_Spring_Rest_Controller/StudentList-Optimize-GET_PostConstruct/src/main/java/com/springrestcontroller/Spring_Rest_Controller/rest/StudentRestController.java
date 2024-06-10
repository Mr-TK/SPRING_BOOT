package com.springrestcontroller.Spring_Rest_Controller.rest;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class StudentRestController {

    List<Student> students = new ArrayList<>();
    @PostConstruct // Load the data only once
    public void loadData(){
        students.add(new Student("Titas", "karmakar"));
        students.add(new Student("Ram", "karmakar"));
        students.add(new Student("ABC", "karmakar"));

    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;

    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        return students.get(studentId);

    }
}

package com.springrestcontroller.Spring_Rest_Controller.rest;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
        if((studentId > students.size()) || (studentId < 0)){
            throw new StudentNotFoundException("Student Not Found with Id:"+studentId);
        }
        return students.get(studentId);

    }
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc){
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimmeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}

package com.springcrud.crud.dao;

import com.springcrud.crud.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentDao {
    void save(Student student);
    Student findById(Integer id);

    List<Student> findAll();
    void update(Student student);
    void delete(Integer id);
}

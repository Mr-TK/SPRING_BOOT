package com.springcrud.crud;

import com.springcrud.crud.dao.StudentDao;
import com.springcrud.crud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner -> {
			createStudent(studentDao);

		};
	}
	public void createStudent(StudentDao studentDao){
		Student student1 = new Student("Titas","karmakar","karmakartitas2021@gmail.com");
		// create multiple
		studentDao.save(student1); // calling studentDaoimpl save func
		Student findStudent = studentDao.findById(student1.getId());
		// find by Id
		// also need to implement findbylastname findbyfirstname
		List<Student> students = studentDao.findAll();
		for(Student student : students){
			System.out.println(student.toString());
		}
		System.out.println(findStudent.toString());
		Student updateStudent = studentDao.findById(1);
		updateStudent.setFirstName("Tk");
		studentDao.update(updateStudent);
		Student updatedStudent = studentDao.findById(1);
		System.out.println(updatedStudent.toString());
		//delete
		studentDao.delete(1);
		for(Student student : students){
			System.out.println(student.toString());
		}


	}

}

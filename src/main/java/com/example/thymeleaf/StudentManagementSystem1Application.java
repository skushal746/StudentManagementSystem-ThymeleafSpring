package com.example.thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.thymeleaf.entity.Student;
import com.example.thymeleaf.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystem1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/* For First time running only
		Student student1 = new Student("Kushal", "Sharma", "skushal746@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Tony", "Kakkar", "tony.kakkar@gmail.com");
		studentRepository.save(student2);
		

		Student student3 = new Student("Tony", "Stark", "tony.stark@gmail.com");
		studentRepository.save(student3);
		*/
	}

}

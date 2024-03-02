package com.student.manage;

import com.student.manage.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class BootApplication implements CommandLineRunner {
//public class BootApplication {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        System.out.println("Started...");
        SpringApplication.run(BootApplication.class, args);
        Date date = new Date();
        System.out.println("\n End..." + date);
        int port = 9090;
        System.out.println("running on port : " + port);
//        http://localhost:9090/
    }

    // there we can add data to my app :
    @Override
    public void run(String... args) throws Exception {
        // data inserting :-
//        Student student1 = new Student("Nihal", "nihal029@gmail.com", 9731613, "Kanpur Nagar");
//        studentRepository.save(student1);
//
//        System.out.println("Student Updated...");
    }
}

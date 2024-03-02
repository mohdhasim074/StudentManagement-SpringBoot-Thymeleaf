package com.student.manage.services;

import com.student.manage.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    //    save Student :
    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

}

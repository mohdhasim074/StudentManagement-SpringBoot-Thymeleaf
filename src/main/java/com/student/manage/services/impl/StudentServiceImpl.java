package com.student.manage.services.impl;

import com.student.manage.entities.Student;
import com.student.manage.repository.StudentRepository;
import com.student.manage.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    //    this is constructor we are using for intialization, because we are not using '@Autowired' Annotation here.
    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        System.out.println("Students find successfully...");
        return studentRepository.findAll();
    }

    //    save Student :
    @Override
    public Student saveStudent(Student student) {
        System.out.println("Student saved...");
        return studentRepository.save(student);

    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        System.out.println("Student data updated...");
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }


}


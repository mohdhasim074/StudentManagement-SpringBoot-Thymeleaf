package com.student.manage.controller;

import com.student.manage.entities.Student;
import com.student.manage.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//  we are using '@Controller' Annotation to handle all incoming 'Http requests'.
public class StudentController {

    //          we are using '@Autowird' Annotation for intialization.
//           @Autowired
    private final StudentService service;

    public StudentController(StudentService studentService) {
        super();
        this.service = studentService;
    }

//    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "This is Student Management Project";
    }

    //     Handler methods to handle request like, :Student List, return mode and view also.
    @GetMapping("/")
    public String StudentsList(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "index";
    }


    @GetMapping("/newStudents")
    public String createStudent(Model model) {
//      Handler Methods for  create student object to hold data :

        Student student = new Student();
        model.addAttribute("student", student);
        return "create_students";
    }

    //   Handler Methods for Adding  students :
    @PostMapping("/students")
    public String saveStudents(@ModelAttribute("student") Student student) {
        service.saveStudent(student);
        return "redirect:/";
    }

    //     Handler Methods for updating Students :
    @GetMapping("/update/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", service.getStudentById(id));
        return "edit_Students";
    }

    @PostMapping("/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
//        get Students from database by id :
        Student existingStudent = service.getStudentById(id);

        existingStudent.setFullName(student.getFullName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setMobile(student.getMobile());
        existingStudent.setAddress(student.getAddress());

//        save updated student object :
        service.updateStudent(existingStudent);
        return "redirect:/";
    }

//    Handler Methods for deleting Students :

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudentById(id);
        return "redirect:/";
    }

//      Deleted Students :


}

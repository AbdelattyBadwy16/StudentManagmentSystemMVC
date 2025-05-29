package com.LearningProject.StudentManagmentSystem.controller;

import com.LearningProject.StudentManagmentSystem.entity.Student;
import com.LearningProject.StudentManagmentSystem.repository.StudentRepository;
import com.LearningProject.StudentManagmentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/students")
    public String getAllStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/add")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "addStudents";
    }

}

package com.LearningProject.StudentManagmentSystem.controller;

import com.LearningProject.StudentManagmentSystem.entity.Student;
import com.LearningProject.StudentManagmentSystem.repository.StudentRepository;
import com.LearningProject.StudentManagmentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

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

    @GetMapping("/students/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Student student = studentService.getStudent(id);
        model.addAttribute("student", student);
        return "editStudent";
    }

    @PostMapping("/students/update")
    public String updateStudent(@ModelAttribute("student") Student student) {
        studentService.updateStudent(student);
        return "redirect:/students";
    }

    @PostMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(studentService.getStudent(id));
        return "redirect:/students";
    }

}

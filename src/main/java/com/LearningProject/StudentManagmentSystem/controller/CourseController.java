package com.LearningProject.StudentManagmentSystem.controller;

import com.LearningProject.StudentManagmentSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public String getAllCourses(Model model){
        model.addAttribute("courses",courseService.getAllCourses());
        return "courses";
    }

    @PostMapping("/courses/delete/{id}")
    public String deleteCourse(@PathVariable int id) {
        courseService.deleteCourse(courseService.getCourse(id));
        return "redirect:/courses";
    }
}

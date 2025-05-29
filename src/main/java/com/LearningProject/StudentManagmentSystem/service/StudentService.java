package com.LearningProject.StudentManagmentSystem.service;

import com.LearningProject.StudentManagmentSystem.entity.Student;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    public Student saveStudent(Student student);
}

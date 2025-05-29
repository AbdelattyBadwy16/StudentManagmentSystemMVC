package com.LearningProject.StudentManagmentSystem.serviceImpl;

import com.LearningProject.StudentManagmentSystem.entity.Student;
import com.LearningProject.StudentManagmentSystem.repository.StudentRepository;
import com.LearningProject.StudentManagmentSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}

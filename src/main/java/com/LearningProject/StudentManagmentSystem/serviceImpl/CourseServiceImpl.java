package com.LearningProject.StudentManagmentSystem.serviceImpl;

import com.LearningProject.StudentManagmentSystem.entity.Course;
import com.LearningProject.StudentManagmentSystem.entity.Student;
import com.LearningProject.StudentManagmentSystem.repository.CourseRepository;
import com.LearningProject.StudentManagmentSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Override
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
    @Override
    public Course saveCourse(Course course){
        return null;
    }
    @Override
    public void deleteCourse(Course course){
        courseRepository.delete(course);
    }
    @Override
    public Course getCourse(int id){
        return courseRepository.findById(id).orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
    }
}

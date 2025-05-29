package com.LearningProject.StudentManagmentSystem.service;

import com.LearningProject.StudentManagmentSystem.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getAllCourses();
    public Course saveCourse(Course course);
    public void deleteCourse(Course course);
    public Course getCourse(int id);
}

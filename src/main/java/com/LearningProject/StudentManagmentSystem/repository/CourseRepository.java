package com.LearningProject.StudentManagmentSystem.repository;

import com.LearningProject.StudentManagmentSystem.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {
}

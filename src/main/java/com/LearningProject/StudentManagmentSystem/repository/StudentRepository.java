package com.LearningProject.StudentManagmentSystem.repository;

import com.LearningProject.StudentManagmentSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}

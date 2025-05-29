package com.LearningProject.StudentManagmentSystem.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students = new HashSet<>();

    public Course(){}

    public Course(String name){
        super();
        this.name = name;
    }

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return this.id;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

}

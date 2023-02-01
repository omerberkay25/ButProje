package edu.CankayaUniversityAPI.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Lesson> studentLessons;

    public Student(String name) {
        this.name = name;
        this.studentLessons=new ArrayList<>();
    }

    public List<Lesson> getStudentLessons() {
        return studentLessons;
    }

    public void setStudentLessons(List<Lesson> studentLessons) {
        this.studentLessons = studentLessons;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

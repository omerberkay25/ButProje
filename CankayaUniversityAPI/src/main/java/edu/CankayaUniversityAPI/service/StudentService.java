package edu.CankayaUniversityAPI.service;

import edu.CankayaUniversityAPI.model.Lesson;
import edu.CankayaUniversityAPI.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public Student createStudent(String name){
        Student student = new Student(name);
        studentList.add(student);
        return student;
    }

    public List<Lesson> getStudentsLessons(String studentName){
        for(Student student:getStudentList()){
           if (student.getName().equals(studentName)){
               return student.getStudentLessons();
           } else {
               throw new RuntimeException("No such a Student");
           }
        }
        return new ArrayList<>();
    }


}

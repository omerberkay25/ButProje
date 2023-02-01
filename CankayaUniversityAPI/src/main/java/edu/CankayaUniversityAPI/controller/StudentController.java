package edu.CankayaUniversityAPI.controller;

import edu.CankayaUniversityAPI.model.Lesson;
import edu.CankayaUniversityAPI.model.Student;
import edu.CankayaUniversityAPI.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getStudentList();
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody String name){
        return studentService.createStudent(name);
    }

    @GetMapping("/{studentName}")
    public List<Lesson> getStudentsLessons(@PathVariable String studentName){
        return studentService.getStudentsLessons(studentName);
    }


}

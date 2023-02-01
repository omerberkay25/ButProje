package edu.CankayaUniversityAPI.service;

import edu.CankayaUniversityAPI.model.Lesson;
import edu.CankayaUniversityAPI.model.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @InjectMocks
    private StudentService studentService;


    @Test
    void should_return_all_students() {
        //Given
        studentService.createStudent("ali");
        studentService.createStudent("veli");
        studentService.createStudent("adil");

        //When
        List<Student> studentList = studentService.getStudentList();

        //Then
        assertThat(studentList.size()).isGreaterThanOrEqualTo(1);
    }

    @Test
    void should_create_student() {
        //Given


        //When
        Student student = studentService.createStudent("ahmet");

        //Then
        Student student1 = studentService.getStudentList().get(0);
        assertThat(student1.getName()=="ahmet");
    }

}
package edu.CankayaUniversityAPI.service;

import edu.CankayaUniversityAPI.model.Lesson;
import edu.CankayaUniversityAPI.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonService {
    private final List<Lesson> lessonList = new ArrayList<>();

    private final StudentService studentService;

    public LessonService(StudentService studentService) {
        this.studentService = studentService;
    }

    public  List<Lesson> getLessonList(){
        return lessonList;
    }

    public Lesson createLesson(String name, String definition, String professor){
        Lesson lesson = new Lesson(name, definition, professor);
        lessonList.add(lesson);
        return lesson;
    }

    public void addStudentToLesson(String studentName, String lessonName){
        for(Lesson lesson:lessonList){
            if (lesson.getName().equals(lessonName)){
                for (Student student:studentService.getStudentList()){
                    if (student.getName().equals(studentName)){
                        student.getStudentLessons().add(lesson);
                    } else {
                        throw new RuntimeException("No such a Student.");
                    }
                }
            } else {
                throw new RuntimeException("No such a Lesson.");
            }
        }
    }
}

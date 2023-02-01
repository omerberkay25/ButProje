package edu.CankayaUniversityAPI.controller;

import edu.CankayaUniversityAPI.model.Lesson;
import edu.CankayaUniversityAPI.service.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lesson")
public class LessonController {
    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping()
    public List<Lesson> getLessonList(){
        return lessonService.getLessonList();
    }

    @PostMapping("/create")
    public Lesson createLesson(@RequestBody Lesson lesson){
        return lessonService.createLesson(lesson.getName(), lesson.getDefinition(), lesson.getProfessor());
    }

    @GetMapping("/{lessonName}/{studentName}")
    public void addStudentToLesson(@PathVariable String lessonName, @PathVariable String studentName){
        lessonService.addStudentToLesson(studentName,lessonName);
    }

}

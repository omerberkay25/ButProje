package edu.CankayaUniversityAPI.service;

import edu.CankayaUniversityAPI.model.Lesson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
class LessonServiceTest {

    @InjectMocks
    private LessonService lessonService;


    @Test
    void should_find_and_return_all_lesson_not_empty_list() {

        //Given
        lessonService.createLesson("blockchain","blockchain basics", "Sadik Turan");

        //When
        List<Lesson> lessonList = lessonService.getLessonList();

        //Then
        assertThat(lessonList.size()).isGreaterThanOrEqualTo(1);

    }

    @Test
    void if_lesson_list_is_empty_then_should_return_empty_lesson_list() {

        //Given

        //When
        List<Lesson> lessonList = lessonService.getLessonList();

        //Then
        Assertions.assertEquals(new ArrayList<Lesson>(),lessonList);

    }

    @Test
    void should_create_lesson_then_return_given_lesson() {

        //Given


        //When
        Lesson lesson = lessonService.createLesson("blockchain","blockchain basics", "Sadik Turan");

        //Then
        assertThat(lesson.getName()=="blockchain");
    }

    @Test
    void should_add_created_lesson_in_list_then_check_if_its_in_lesson_list() {

        //Given
        boolean flag = false;

        //When
        lessonService.createLesson("blockchain","blockchain basics", "Sadik Turan");
        List<Lesson> list = lessonService.getLessonList();
        for (Lesson les:list){
            flag = les.getName().equals("blockchain");
        }


        //Then
        assertThat(lessonService.getLessonList().size()>1);
        Assertions.assertTrue(flag);

    }

}
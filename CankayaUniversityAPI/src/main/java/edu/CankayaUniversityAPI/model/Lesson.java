package edu.CankayaUniversityAPI.model;

import java.util.List;

public class Lesson {
    String name;
    String definition;
    String professor;
    public Lesson(String name, String definition, String professor) {
        this.name = name;
        this.definition = definition;
        this.professor = professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}

package com.SaveEmbededData;

import javax.persistence.Embeddable;

@Embeddable
public class Course {
    private String courseDuration;
    private String courseName;

    public String getCourseDuration() {
        return courseDuration;
    }


    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course() {
    }

    public Course(String courseDuration, String courseName) {
        this.courseDuration = courseDuration;
        this.courseName = courseName;
    }
}

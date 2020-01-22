package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {
    private String courseName;
    private int courseID;
    private HashMap studentsInCourse = new HashMap<>();


    public Course(String courseName, int courseID, HashMap studentsInCourse){
        this.courseName = courseName;
        this.courseID = courseID;
        this.studentsInCourse = studentsInCourse;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String aCourseName){
        courseName = aCourseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public HashMap getStudentsInCourse() {
        return studentsInCourse;
    }

    public void setStudentsInCourse(HashMap studentsInCourse) {
        this.studentsInCourse = studentsInCourse;
    }
}

package org.launchcode.java.demos.lsn3classes1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student newStudent = new Student("Katie", 1234, 1, 4.0);
        HashMap<String, Integer> studentsInCourse = new HashMap<>();
        studentsInCourse.put(newStudent.getName(), newStudent.getStudentId());
        Course firstCourse = new Course("Java", 455, studentsInCourse);
        Teacher newTeacher = new Teacher("Debbie","Lang","Math",5);
        // how we would set the name at a different point other than initiation
        //newStudent.setName("ALf");
        //get is how we retrieve and display the value
        System.out.println("Name: " + newStudent.getName() + "\nStudent ID #: " + newStudent.getStudentId()
        + "\nCredits: " + newStudent.getNumberOfCredits() + "\nGPA: " + newStudent.getGpa() +"\n");

        System.out.println("Course name: " + firstCourse.getCourseName() + "\nCourse Id: "
        + firstCourse.getCourseID() + "\nStudents enrolled in course: " + firstCourse.getStudentsInCourse() +"\n");

        System.out.println("Teacher: " + newTeacher.getFirstName() + " " + newTeacher.getLastName() +"\nSubject taught: "
        + newTeacher.getSubject() + "\nYears taught: " + newTeacher.getYearsTeaching());
    }
}

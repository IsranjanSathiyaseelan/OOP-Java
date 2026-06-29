/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Isranjan
 */
import java.util.Scanner;

abstract class Course {
    String courseCode;
    String courseName;
    String studentName;
    int marks;

    public Course(String courseCode, String courseName, String studentName, int marks) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.studentName = studentName;
        this.marks = marks;
    }
   
    abstract void calculateGrade();
   
    void displayDetails() {
        System.out.println("\nCourse Code : " + courseCode);
        System.out.println("Course Name : " + courseName);
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks       : " + marks);
    }

    void performance(String grade) {
        if (grade.equals("A")) {
            System.out.println("Performance : Outstanding");
        } else if (grade.equals("B")) {
            System.out.println("Performance : Very Good");
        } else if (grade.equals("C")) {
            System.out.println("Performance : Satisfactory");
        } else {
            System.out.println("Performance : Fail");
        }
    }

    void academicStatus(String grade) {
        int code = 0;

        switch (grade) {
            case "A":
                code = 1;
                break;
            case "B":
                code = 2;
                break;
            case "C":
                code = 3;
                break;
            default:
                code = 4;
        }

        switch (code) {
            case 1:
                System.out.println("Academic Status : Dean's List");
                break;
            case 2:
                System.out.println("Academic Status : Good Standing");
                break;
            case 3:
                System.out.println("Academic Status : Academic Warning");
                break;
            case 4:
                System.out.println("Academic Status : Repeat Course Required");
                break;
        }
    }
}

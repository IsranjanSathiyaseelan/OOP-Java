/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

/**
 *
 * @author Isranjan
 */
class TheoryCourse extends Course {

    public TheoryCourse(String code, String name, String student, int marks) {
        super(code, name, student, marks);
    }

    @Override
    void calculateGrade() {
        String grade;

        if (marks >= 75)
            grade = "A";
        else if (marks >= 65)
            grade = "B";
        else if (marks >= 50)
            grade = "C";
        else
            grade = "F";

        displayDetails();
        System.out.println("Grade       : " + grade);
        performance(grade);
        academicStatus(grade);
    }
}

class PracticalCourse extends Course {

    public PracticalCourse(String code, String name, String student, int marks) {
        super(code, name, student, marks);
    }

    @Override
    void calculateGrade() {
        String grade;

        if (marks >= 80)
            grade = "A";
        else if (marks >= 70)
            grade = "B";
        else if (marks >= 55)
            grade = "C";
        else
            grade = "F";

        displayDetails();
        System.out.println("Grade       : " + grade);
        performance(grade);
        academicStatus(grade);
    }
}

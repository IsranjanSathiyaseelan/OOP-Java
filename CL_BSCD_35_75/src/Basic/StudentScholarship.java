/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Basic;

/**
 *
 * @author Isranjan
 */
import java.util.Scanner;
public class StudentScholarship {
    String studentName;
    int studentID;
    double GPA;
    char activityLevel; 
    
    public StudentScholarship(String studentName,int studentID, double GPA, char activityLevel){
        this.studentName=studentName;
        this.studentID=studentID;
        this.GPA=GPA;
        this.activityLevel=activityLevel;
    }
    
    public void calculateScholarship() {

    if (GPA >= 3.5) {
        if (activityLevel == 'A') {
            System.out.println("Full Scholarship - Rs.100000");
        } else if (activityLevel == 'B') {
            System.out.println("Half Scholarship - Rs.50000");
        } else if (activityLevel == 'C') {
            System.out.println("Merit Scholarship - Rs.25000");
        }
    } else {
        System.out.println("Not Eligible for Scholarship");
    }

    int category;

    if (GPA >= 3.7) {
        category = 1;
    } else if (GPA >= 3.0) {
        category = 2;
    } else {
        category = 3;
    }

    switch (category) {
        case 1:
            System.out.println("Excellent");
            break;
        case 2:
            System.out.println("Good");
            break;
        case 3:
            System.out.println("Needs Improvement");
            break;
    }
}
    
    public void displayDetails() {
    System.out.println("Name: " + studentName);
    System.out.println("ID: " + studentID);
    System.out.println("GPA: " + GPA);
    System.out.println("Activity Level: " + activityLevel);
}
    
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many students should be processed");

    int count = scanner.nextInt();
    scanner.nextLine();

    for(int i = 1; i <= count; i++){
        System.out.println("Student " + i);

        System.out.println("Enter Student Name:");
        String studentName = scanner.nextLine();

        System.out.println("Enter Student ID:");
        int studentID = scanner.nextInt();

        System.out.println("Enter GPA:");
        double GPA = scanner.nextDouble();

        System.out.println("Enter Activity Level (A/B/C):");
        char activityLevel = scanner.next().charAt(0);

        scanner.nextLine();

        StudentScholarship s = new StudentScholarship(studentName, studentID, GPA, activityLevel);

        s.calculateScholarship();
        s.displayDetails();
        }
    }
}   
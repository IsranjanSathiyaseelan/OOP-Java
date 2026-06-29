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
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("Student " + i);

            System.out.print("Course Type (1-Theory, 2-Practical): ");
            int type = sc.nextInt();
            sc.nextLine();

            System.out.print("Course Code: ");
            String code = sc.nextLine();

            System.out.print("Course Name: ");
            String course = sc.nextLine();

            System.out.print("Student Name: ");
            String student = sc.nextLine();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            Course c;

            if (type == 1) {
                c = new TheoryCourse(code, course, student, marks);
            } else {
                c = new PracticalCourse(code, course, student, marks);
            }

            c.calculateGrade();
        }

        sc.close();
    }
}

package Inheritance;

import Inheritance.Staff;
import Inheritance.Lecturer;
import Inheritance.AdministrativeOfficer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of staff members: ");
        int n = sc.nextInt();

        Staff[] staffList = new Staff[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Staff Type (1 = Lecturer, 2 = Officer):");
            int type = sc.nextInt();

            System.out.print("Enter Staff ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Department: ");
            String dept = sc.next();

            System.out.print("Enter Basic Salary: ");
            double salary = sc.nextDouble();

            if (type == 1) {

                System.out.print("Enter Subject: ");
                String subject = sc.next();

                System.out.print("Enter Number of Publications: ");
                int pub = sc.nextInt();

                staffList[i] = new Lecturer(id, name, dept, salary, subject, pub);

            } else {

                System.out.print("Enter Years of Service: ");
                int years = sc.nextInt();

                System.out.print("Enter Office Location: ");
                String location = sc.next();

                staffList[i] = new AdministrativeOfficer(id, name, dept, salary, years, location);
            }
        }

        System.out.println("STAFF REPORT");

        for (Staff s : staffList) {

            s.displayBasicDetails();

            double totalSalary = s.calculateSalary();

            s.evaluatePerformance();

            int grade;

            if (totalSalary > 150000) {
                grade = 1;
            } else if (totalSalary >= 100000) {
                grade = 2;
            } else {
                grade = 3;
            }

            switch (grade) {

                case 1:
                    System.out.println("Grade 1 - Senior Staff");
                    break;

                case 2:
                    System.out.println("Grade 2 - Mid-Level Staff");
                    break;

                case 3:
                    System.out.println("Grade 3 - Junior Staff");
                    break;
            }

            System.out.println(" ");
        }

        sc.close();
    }
}
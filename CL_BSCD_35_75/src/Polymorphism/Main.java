/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Polymorphism;

/**
 *
 * @author hnd
 */
import Polymorphism.Employee;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter Employee Type (1 = Full-Time, 2 = Part-Time): ");
            int type = sc.nextInt();

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Employee Name: ");
            String name = sc.next();

            if (type == 1) {

                System.out.print("Enter Monthly Salary: ");
                double salary = sc.nextDouble();

                employees[i] = new FullTimeEmployee(id, name, salary);

            } else if (type == 2) {

                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();

                System.out.print("Enter Hourly Rate: ");
                double rate = sc.nextDouble();

                employees[i] = new PartTimeEmployee(id, name, hours, rate);

            } else {

                System.out.println("Invalid type. Try again.");
                i--; // repeat this iteration
            }
        }

        System.out.println("\n===== EMPLOYEE SALARY REPORT =====");

        for (Employee emp : employees) {

            double salary = emp.calculateSalary(); // polymorphism

            if (salary > 100000) {
                System.out.println("High Income Employee");
            } else if (salary >= 50000) {
                System.out.println("Medium Income Employee");
            } else {
                System.out.println("Low Income Employee");
            }

            System.out.println(" ");
        }

        sc.close();
    }
}

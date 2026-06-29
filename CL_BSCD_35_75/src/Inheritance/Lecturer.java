/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance;

/**
 *
 * @author hnd
 */
public class Lecturer extends Staff{

    String subject;
    int publications;

    public Lecturer(int staffId, String staffName, String department,
                    double basicSalary, String subject, int publications) {

        super(staffId, staffName, department, basicSalary);
        this.subject = subject;
        this.publications = publications;
    }

    public double calculateSalary() {

        double allowance;

        if (publications > 10) {
            allowance = 30000;
        } else if (publications >= 5) {
            allowance = 15000;
        } else {
            allowance = 5000;
        }

        double total = basicSalary + allowance;

        System.out.println("\nLecturer Salary Details:");
        System.out.println("Total Salary: Rs. " + total);

        return total;
    }

    public void evaluatePerformance() {

        System.out.print("Performance: ");

        if (publications > 15) {
            System.out.println("Excellent");
        } else if (publications >= 8) {
            System.out.println("Good");
        } else {
            System.out.println("Needs Improvement");
        }
    }
}

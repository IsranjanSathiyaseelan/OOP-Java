/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Polymorphism;

import Polymorphism.Employee;

/**
 *
 * @author Isranjan
 */
public class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(int employeeID, String employeeName, double monthlySalary) {
        super(employeeID, employeeName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        System.out.println("Full-Time Employee:");
        System.out.println("ID:" + employeeID);
        System.out.println("Name:" + employeeName);
        System.out.println("Monthly Salary: Rs." + monthlySalary);

        return monthlySalary;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Polymorphism;

import Polymorphism.Employee;

/**
 *
 * @author hnd
 */
public class PartTimeEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(int employeeID, String employeeName,int hoursWorked, double hourlyRate) {
        super(employeeID, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        double salary = hoursWorked * hourlyRate;

        System.out.println("Part-Time Employee");
        System.out.println("ID:" + employeeID);
        System.out.println("Name:" + employeeName);
        System.out.println("Hours Worked:" + hoursWorked);
        System.out.println("Hourly Rate: Rs." + hourlyRate);
        System.out.println("Calculated Salary: Rs." + salary);

        return salary;
    }
}
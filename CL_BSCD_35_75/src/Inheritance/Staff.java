/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Inheritance;

/**
 *
 * @author Isranjan
 */
public abstract class Staff {

    protected int id;
    protected String name;
    protected String department;
    protected double basicSalary;

    public Staff(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public void displayBasicDetails() {
        System.out.println("");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
        System.out.println("Basic Salary : " + basicSalary);
    }

    public abstract double calculateSalary();
    public abstract void evaluatePerformance();
}
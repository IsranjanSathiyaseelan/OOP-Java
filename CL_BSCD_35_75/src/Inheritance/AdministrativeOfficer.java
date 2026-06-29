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
public class AdministrativeOfficer extends Staff {

    private int yearsOfService;
    private String officeLocation;

    public AdministrativeOfficer(int id, String name,
            String department, double basicSalary,
            int yearsOfService, String officeLocation) {

        super(id, name, department, basicSalary);

        this.yearsOfService = yearsOfService;
        this.officeLocation = officeLocation;
    }

    @Override
    public double calculateSalary() {

        double allowance = yearsOfService * 2000;

        return basicSalary + allowance;
    }

    @Override
    public void evaluatePerformance() {

        System.out.println("Years of Service : " + yearsOfService);
        System.out.println("Office Location : " + officeLocation);

        if (yearsOfService >= 15) {
            System.out.println("Performance : Excellent");
        } else if (yearsOfService >= 8) {
            System.out.println("Performance : Good");
        } else {
            System.out.println("Performance : Average");
        }

        System.out.println("Total Salary : " + calculateSalary());
    }
}
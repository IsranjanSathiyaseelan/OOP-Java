/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se;

/**
 *
 * @author hnd
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Patient" + i);

            System.out.print("Patient ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Patient Name: ");
            String name = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Illness: ");
            String illness = input.nextLine();

            System.out.print("Bill Amount: ");
            double bill = input.nextDouble();

            Encapsulation p = new Encapsulation(id, name, age, illness, bill);

            System.out.println("Patient Details: ");
            System.out.println("Patient ID: " + p.getpatientID());
            System.out.println("Patient Name: " + p.getpatientName());
            System.out.println("Age: " + p.getage());
            System.out.println("Illness: " + p.getillness());
            System.out.println("Bill Amount: " + p.getbillAmount());

            System.out.print("Category: ");
            p.determineCategory();

            p.calculateDiscount();
        }

        input.close();
    }
}

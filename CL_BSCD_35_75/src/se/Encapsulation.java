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
public class Encapsulation {
    private int patientID;
    private String patientName;
    private int age;
    private String illness;
    private Double billAmount;
    
    Encapsulation(int patientID,String patientName,int age,String illness,Double billAmount){
        this.patientID=patientID;
        this.patientName=patientName;
        this.age=age;
        this.illness=illness;
        this.billAmount=billAmount;
    }
    
    public void determineCategory(){
        if (age <= 13) {
            System.out.println("Child");
            }
        if (13 <= age  && age <= 59) {
            System.out.println("Adult");
            }
        if (69 < 60) {
            System.out.println("Senior Citizen");
            }
    }
    
    public void calculateDiscount(){

    double discount = 0;
    double finalBill;

    if (billAmount > 50000) {
        discount = 10;
    }
    else if (billAmount > 25000) {
        discount = 5;
    }
    else {
        discount = 0;
    }

    finalBill = billAmount - (billAmount * discount / 100);

    System.out.println("Discount Percentage: " + discount + "%");
    System.out.println("Final Bill Amount: Rs. " + finalBill);
}
    
    
  public int getpatientID() {
    return patientID;
  }

  public void setpatientID(int newpatientID) {
    this.patientID = newpatientID;
  }

  public String getpatientName() {
    return patientName;
  }

  public void setpatientName(String newpatientName) {
    this.patientName = newpatientName;
  }
  
  public int getage() {
    return age;
  }

  public void setage(int newage) {
    this.age = newage;
  }
  
  public String getillness() {
    return illness;
  }

  public void setillness(String newillness) {
    this.illness = newillness;
  }
  
  public Double getbillAmount() {
    return billAmount;
  }

  public void setbillAmount(Double newbillAmount) {
    this.billAmount = newbillAmount;
 }
}
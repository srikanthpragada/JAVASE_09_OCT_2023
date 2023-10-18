package oop1;

public class SavingsAccount {
     private int acno;
     private String holderName;
     private double balance;
     
     public SavingsAccount(int no, String name, double bal) {
    	 acno = no;
    	 holderName = name;
    	 balance = bal;
     }
     
     public void deposit(double amount) {
    	 balance += amount;
     }
     
     public void withdraw(double amount) {
    	 balance -= amount;
     }
     
     public double getBalance() {
    	 return balance;
     }
	
}

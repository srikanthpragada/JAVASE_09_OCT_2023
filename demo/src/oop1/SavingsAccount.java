package oop1;

public class SavingsAccount {
	private int acno;
	private String holderName;
	private double balance;
	private static int minBalance = 10000;

	public SavingsAccount(int acno, String holderName, double balance) {
		this.acno = acno;
		this.holderName = holderName;
		this.balance = balance;
	}

	public SavingsAccount(int acno, String holderName) {
		this(acno, holderName, 0);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - SavingsAccount.minBalance >= amount)
			this.balance -= amount;
		else
			System.out.println("Insufficient Balance!");
	}

	public double getBalance() {
		return this.balance;
	}

}

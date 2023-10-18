package oop1;

public class TestAccount {

	public static void main(String[] args) {
		 SavingsAccount a1 = new SavingsAccount(1,"Mr. Andy", 10000);
		 a1.deposit(10000);
		 a1.withdraw(50000);
		 System.out.println(a1.getBalance());;
		 
	}

}

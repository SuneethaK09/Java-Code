package ConstructorAssignment;

public class BankAccount {

	/*
	 * Assignment 5:
	 * 
	 * 1. Create a Java class named "BankAccount" with the following instance
	 * variables: accountNumber (String) balance (double) 2. Create a constructor
	 * for the BankAccount class that takes in the accountNumber and balance as
	 * parameters and initializes the instance variables. 3. Create a method in the
	 * BankAccount class named "deposit" that takes in a double value as a parameter
	 * and adds it to the balance instance variable. 4. Create a method in the
	 * BankAccount class named "withdraw" that takes in a double value as a
	 * parameter and subtracts it from the balance instance variable. 5. Create a
	 * main method that creates an instance of the BankAccount class using the
	 * constructor and performs multiple deposits and withdrawals using the deposit
	 * and withdraw methods. Print out the updated balance after each transaction.
	 * Questions: 1. What is the purpose of an instance variable in Java? 2. How are
	 * instance variables different from local variables in Java? 3. What is the
	 * access level of an instance variable in Java? 4. What is the purpose of a
	 * method in Java? 5. Can a method call other methods within the same class?
	 */

	final String accountNumber;
	static double balance;
	double credit;
	double debit;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		BankAccount.balance = balance;

	}

	public double deposit(double credit) {
		this.credit = credit;
		balance = balance + credit;
		return credit;

	}

	public double withdraw(double debit) {
		this.debit = debit;
		balance = balance - debit;
		return debit;

	}

	public static void main(String[] args) {

		BankAccount acc = new BankAccount("1101234560", 15000);
		System.out.println("AccountNumber:" + acc.accountNumber + " " + "Balance:" + balance);

		acc.deposit(1000.57);
		System.out.println("Amount credited:" + acc.credit);

		System.out.println("AccountNumber:" + acc.accountNumber + " " + "Balance:" + balance);

		acc.withdraw(500);
		System.out.println("Amount debited:" + acc.debit);

		System.out.println("AccountNumber:" + acc.accountNumber + " " + "Balance:" + balance);

	}

}

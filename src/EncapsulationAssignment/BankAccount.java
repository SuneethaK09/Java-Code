package EncapsulationAssignment;

public class BankAccount {

	/*
	 * Assignment 2: Objective: The objective of this assignment is to create a
	 * class that uses encapsulation to hide its implementation details and provide
	 * a simple interface for clients. Instructions: 1. Create a class called
	 * "BankAccount" with the following private attributes: accountNumber (String),
	 * balance (double), and owner (String). 2. Create getter and setter methods for
	 * each attribute. 3. Write a method called "deposit" that takes a double
	 * parameter and adds it to the balance. 4. Write a method called "withdraw"
	 * that takes a double parameter and subtracts it from the balance. 5. Write a
	 * method called "printStatement" that prints out the account number, owner
	 * name, and balance. 6. Create an instance of the "BankAccount" class and set
	 * its attributes using the setter methods. 7. Call the "deposit" and "withdraw"
	 * methods to modify the balance of the account. 8. Call the "printStatement"
	 * method to verify that the data was set correctly. Questions: 1. How can
	 * encapsulation be used to hide implementation details from user of a class? 2.
	 * What are the benefits of using private attributes in a class? 3. What is the
	 * difference between a getter method and a setter method? 4. How can
	 * encapsulation improve the readability of code?
	 */

	private String accountNumber;
	private double balance;
	private String owner;

	public double creditMoney;
	public double debitMoney;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double deposit(double creditMoney) {
		System.out.println("Money credit details");
		this.creditMoney = creditMoney;
		this.balance = balance + creditMoney;
		return creditMoney;

	}

	public double withdraw(double debitMoney) {
		System.out.println("Money debit details");
		this.debitMoney = debitMoney;
		this.balance = balance - debitMoney;
		return debitMoney;
	}

	public void printStatement() {
		System.out.println("Printing the details");
		System.out.println("AccountNumber: " + getAccountNumber() + " " + "Balance: " + getBalance() + " " + "Owner: "
				+ getOwner());

	}

	public static void main(String[] args) {

		BankAccount bank = new BankAccount();

		bank.setAccountNumber("0100110231045");
		bank.setBalance(145000.578);
		bank.setOwner("Peter");

		System.out.println("AccountNumber: " + bank.accountNumber + " " + "Balance: " + bank.balance + " " + "Owner: "
				+ bank.owner);

		bank.deposit(25100);
		// System.out.println("Amount deposited: " + bank.deposit(1000));
		System.out.println("Amount deposited: " + bank.creditMoney);
		System.out.println("Balance: " + bank.balance);

		bank.withdraw(5000);
		System.out.println("Amount debited: " + bank.debitMoney);
		System.out.println("Balance: " + bank.balance);

		bank.printStatement();

	}

}

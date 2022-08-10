package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountMainV4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		double amount;
		int choice;
		String continueChoice;
		boolean result;
		boolean isSalary;

		System.out.println("Enter Account Number");
		accountNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Name");
		name = scanner.nextLine();
		System.out.println("Enter Balance");
		balance = scanner.nextDouble();
		System.out.println("Do you want to open salary account(true|false)");
		isSalary = scanner.nextBoolean();

		Savings account = 
	new Savings(accountNumber, name, balance, isSalary);

		System.out.println(account);
		do {
			System.out.println("Menu");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Balance");

			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextDouble();
				result = account.withdraw(amount);
				if (result)
					System.out.println("Transaction Success");
				else
					System.out.println("Transaction Failed");
				break;
			case 2:
				System.out.println("Enter amount to deposit");
				amount = scanner.nextDouble();
				result = account.deposit(amount);
				if (result)
					System.out.println("Transaction Success");
				else
					System.out.println("Transaction Failed");
				break;
			case 3:
				System.out.println("Balance :: " + account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
	}
}

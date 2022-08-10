package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountMain {
	public static void main(String[] args) {
		System.out.println("Hello World");

		Account account = new Account();
		account.setAccountNumber(101);
		account.setName("Vivek Gohil");
		account.setBalance(1000);

		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());

		System.out.println("------------------");

		Account account2 = new Account(102, "Samarth Patil", 1000);
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());

		System.out.println("------------------");

		System.out.println(account2);

	}
}

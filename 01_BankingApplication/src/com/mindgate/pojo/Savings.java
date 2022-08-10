package com.mindgate.pojo;

public class Savings extends Account {
	private boolean isSalary;

	public Savings() {

	}

	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
	}

	@Override
	public boolean withdraw(double amount) {
		if (isSalary) {
			if (amount > 0 && getBalance() >= amount) {
				setBalance(getBalance() - amount);
				return true;
			}
		} else {
			if (amount > 0 && (getBalance() - amount) >= 2000) {
				setBalance(getBalance() - amount);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			return true;
		}
		return false;
	}
}

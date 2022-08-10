package com.mindgate.factory;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Savings;

public class AccountFactory {
	public Account getAccount(int choice) {
		if (choice == 1) {
			return new Savings();
		}
		if (choice == 2) {
			return new Current();
		}
		return null;
	}
}

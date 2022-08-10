package com.mindgate.main;

import com.mindgate.pojo.A;
import com.mindgate.pojo.B;

public class PolymorphismMain {
	public static void main(String[] args) {
		A a = new B();
		a.show();
	}
}

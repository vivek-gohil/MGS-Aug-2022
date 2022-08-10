package com.mindgate.pojo;

public class B extends A {
	public B() {
		System.out.println("Default Constructor Of B");
	}

	public B(int x) {
		super(x);
		System.out.println("Overloaded Constructor Of B");
	}

}

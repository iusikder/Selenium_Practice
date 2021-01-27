package com.selenium.practice;

public class Constructor {
	String name;
	int age;

	public Constructor() {
		System.out.println("Default Constructor");
	}

	public Constructor(int i) { // 1 Param
		System.out.println(i);
	}

	public Constructor(int i, int j) { // 2 Param
		System.out.println(i);
		System.out.println(j);
	}

	public Constructor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String args[]) {
		// Creating Object of Constructor
		Constructor obj = new Constructor(); // Default Constructor
		Constructor obj1 = new Constructor(10); // 10
		Constructor obj2 = new Constructor(15, 30); // 15,30
		Constructor obj3 = new Constructor("Sabrin", 10);
		Constructor obj4 = new Constructor("Saharin", 15);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		System.out.println(obj4.name);
		System.out.println(obj4.age);
	}

}

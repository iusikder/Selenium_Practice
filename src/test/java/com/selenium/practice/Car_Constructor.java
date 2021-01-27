package com.selenium.practice;

//CTRL+SHIFT+F FOR THE ALIGNMENT

public class Car_Constructor {
	String name;
	int model;
	int price;

	// Constructor
	public Car_Constructor(String name, int model, int price) {
		this.name = name;
		this.model = model;
		this.price = price;

	}

	public static void main(String args[]) {

		// Creating Object of Constructor
		Car_Constructor obj = new Car_Constructor("Honda", 2003, 26000);
		Car_Constructor obj1 = new Car_Constructor("Toyota", 2004, 30000);
		Car_Constructor obj2 = new Car_Constructor("Nissan", 2005, 35000);

		System.out.println(obj.name + "  " + obj.model + "  " + obj.price);
		System.out.println(obj1.name + "  " + obj1.model + "  " + obj1.price);
		System.out.println(obj2.name + "  " + obj2.model + "  " + obj2.price);

	}
}

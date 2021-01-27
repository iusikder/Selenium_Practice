package com.selenium.practice;

public class Encapsulation2 extends Encapsulation {
	
	public static void main(String[] args){
		
		Encapsulation2 obj = new Encapsulation2();
		
		obj.setName("Peter");
		obj.setAge(30);
		obj.setSsn(1111111111);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSsn());
	}
}

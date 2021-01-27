package com.oops;

public class Encapsulation {
	
	private String name = "Automation";
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name=newName;
	}
	
	
	
	public static void main(String[] args){
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
	}
}

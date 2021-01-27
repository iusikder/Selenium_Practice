package com.selenium.practice;

public class Encapsulation {
	
	private String empName;
	private int age;
	private int ssn;
	
	
	
	/*public static void main(String[] args){
		Encapsulation obj = new Encapsulation();
		
		obj.setName("Peter");
		obj.setAge(30);
		obj.setSsn(353453453);
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSsn());
	}
	*/

	public String getName(){
		return empName;
	}
	
	public void setName(String empName){
		this.empName = empName;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getSsn(){
		return ssn;
	}

	public void setSsn(int ssn){
		this.ssn = ssn;
	}
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	//By Naveen
	/*private String empName;
	private int empAge;
	private int empSSN;
	
	
	
	public static void main(String[] args){
		Encapsulation obj = new Encapsulation();
		obj.setEmpName("Peter");
		obj.setEmpAge(40);
		obj.setEmpSSN(423434);
		
		
		System.out.println(obj.getEmpName());
		System.out.println(obj.getEmpAge());
		System.out.println(obj.getEmpSSN());
		
		
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpAge() {
		return empAge;
	}



	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}



	public int getEmpSSN() {
		return empSSN;
	}



	public void setEmpSSN(int empSSN) {
		this.empSSN = empSSN;
	}

	*/
	
	
	
	
	
	
	
	

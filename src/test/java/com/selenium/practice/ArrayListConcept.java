package com.selenium.practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class ArrayListConcept{
	
	public static void main (String args[]){
	
		//Creating object of Employee class
	
		Employee e1 = new Employee("Naveen", "QA", 50);
		Employee e2 = new Employee("Karthik", "Dev", 40);
		Employee e3 = new Employee("Bhanu", "Admin", 30);
		
		ArrayList<Employee> e4 = new ArrayList<Employee>();
		e4.add(e1);
		e4.add(e2);
		e4.add(e3);
		
		Iterator<Employee> it = e4.iterator();
		while(it.hasNext()){
			Employee emp =  it.next();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Output
		//======
		//Naveen QA 50
		//Bhanu Dev 40
		//Karthik Admin 30
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Creating Object of Employee class
		
	/*Employee e1 = new Employee("Naveen", "QA", 30);
	Employee e2 = new Employee("Karthik", "Dev", 40);
	Employee e3 = new Employee("Bhanu", "Admin", 50);
	
	ArrayList<Employee> arr = new ArrayList<Employee>();
	arr.add(e1);
	arr.add(e2);
	arr.add(e3);
	
	
	Iterator<Employee> it = arr.iterator();
	while(it.hasNext()){
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.dept);
		System.out.println(emp.age);*/
	//}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Employee e1 = new Employee("Naveen", "QA", 30);
		Employee e2 = new Employee("Karthik", "Dev", 40);
		Employee e3 = new Employee("Bhanu", "Admin", 50);
		
		ArrayList<Employee> e4 = new ArrayList<Employee>();
		e4.add(e1);
		e4.add(e2);
		e4.add(e3);
		
		Iterator<Employee> it = e4.iterator();
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.dept);
			System.out.println(emp.age);
		}*/
		
	
		


	
	
	
	
	

		


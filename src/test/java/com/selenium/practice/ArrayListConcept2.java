package com.selenium.practice;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListConcept2{
	public static void main (String args[]){
		//ArrayList
/*		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10); //0
		ar.add(20); //1 -----20
		ar.add(30); //2
		ar.add(40); //3 -----40
		ar.add(50); //4
		
	//Size of the Array
		int listCount = ar.size();
		System.out.println(listCount);
		System.out.println(ar.get(3));
		System.out.println(ar.get(1));
		
		//I want to see all the values of ArrayList
		for (int i=0; i<listCount; i=i+1){
			System.out.println("Values of the ArrayList are : " + ar.get(i));
		}
		*/
		
//		5
//		40
//		20
//		Values of the ArrayList are : 10
//		Values of the ArrayList are : 20
//		Values of the ArrayList are : 30
//		Values of the ArrayList are : 40
//		Values of the ArrayList are : 50

	
	

	
	
	
	
	
	
	
	
	
	/////////////////////////////////////
	//Employee Class Objects (There is an Employee Class also)
	/*	Employee emp1 = new Employee("Naveen",30,"QA");
		Employee emp2 = new Employee("Peter",40,"Dev");
		Employee emp3 = new Employee("David",50,"Admin");
		*/
		ArrayList<Employee> al = new ArrayList<Employee>();
		/*al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		*/
		System.out.println(al.size());
		
		//To display the Employees Use Iterator to traverse the values
		Iterator<Employee> it = al.iterator();
		while(it.hasNext()){
			Employee e = it.next();
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.dept);
		}
	
		
		
		
		
		
		}
		
}

	
	
	
	
	

		


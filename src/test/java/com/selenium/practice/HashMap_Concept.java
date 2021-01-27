package com.selenium.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_Concept {
	
	
	public static void main(String[] args){
		
		//Creating object of Employee
	
		Employee e1	= new Employee("Naveen", "QA", 50);
		Employee e2	= new Employee("Karthik", "Dev", 40);
		Employee e3	= new Employee("Bhanu", "Admin", 30);
		
		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);
		
		for(Entry<Integer, Employee> m: hm.entrySet()){
			int key=m.getKey();
			Employee emp=m.getValue();
			
			System.out.println("Employee " + key + " Info");
			System.out.println("------------");
			System.out.println(emp.name + " " + emp.dept + " " + emp.age);
		}
		
		
		
		
		//Output
		//======
			//Employee 1 Info
			//Naveen Dev 50
			//Employee 2 Info
			//Karthik Admin 40
			//Employee 3 Info
			//Bhanu QA 30

		
	
	}		
}	
		
		
		
	















		
		
		
		
		
		
		
/*		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Naveen", "QA", 40);
		Employee e2 = new Employee("Karthik", "Dev", 50);
		Employee e3 = new Employee("Bhanu", "Admin", 30);
		
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);
		
		for(Entry<Integer, Employee> m: hm.entrySet()){
			int key = m.getKey();
			Employee emp = m.getValue();
			System.out.println("Employee "+key+ " Info:");
			System.out.println(emp.name + " " + emp.dept + " " + emp.age );
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	
		/*HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(3, "Ruby");
		hm.put(4, "PHP");
		
		System.out.println(hm.get(2));  //Python
		System.out.println(hm.get(3));  //Ruby
		
		
		//To print all the values of HashMap
		
		for(Entry m: hm.entrySet()){
			System.out.println(m.getKey() +" " + m.getValue());
		}
		
		// Console:: It will print like this: 
			
				1 Java
				2 Python
				3 Ruby
				4 PHP
	*/
	
	
	
	
	
	
	
	//}


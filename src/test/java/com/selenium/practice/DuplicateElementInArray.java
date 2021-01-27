package com.selenium.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class DuplicateElementInArray {
	
	public static void main(String[] args){
		
		//How to find duplicate elements in Array
		
		String[] names = {"java",  "Python", "Ruby", "C#", "Selenium", "Selenium"};
		
		//Using HashSet
		
		Set<String> store = new HashSet<String>();
		
		for(String name: names){
			if(store.add(name)==false){
				System.out.println("Duplicate element found is: "+ name);
			}
		}
	
 	}
}
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	//Approach 1....
		/*String[] arr = {"Java","Java", "Slenium", "Selenium", "Python", "Visual Basic"};

		boolean flag = false;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					System.out.println("Duplicate Element Found: "+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false){
			System.out.println("Duplicate Element Not Found");
		}
		
		*/
		
		
		
	//Approach 2.........
		
		/*String[] names = {"Java", "Ruby", "C", "Python", "Oracle", "Java"};
		
		//Finding duplicate elements in an Array Using HashSet 
		
		Set<String> store = new HashSet<String>();
		for(String name: names){
			if(store.add(name)==false){
				System.out.println("Duplicate Element Found is: " + name);
			}
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		/*String arr[] = {"Java", "Python", "C++", "Ruby", "Java"};	
		boolean flag = false;		
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i]==arr[j]){
					System.out.println("Duplicate Element Found..." + arr[i]);
					flag=true;
				}
				}
		}
		if(flag==false){
			System.out.println("Element Not Found");
		}*/
	//}
	//}


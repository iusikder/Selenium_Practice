package com.selenium.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.jar.Attributes.Name;

public class ArrayListIteration {
	
	public static void main(String[] args){
		
	//Iterating ArrayList values in different ways
		
	ArrayList<String> arr = new ArrayList<String>();
	
	arr.add("Naveen");
	arr.add("Karthik");
	arr.add("Bhanu");
	arr.add("Ashish");
	
	//Advance for loop
	
	
	for(String show: arr){
		System.out.println(show);
	}
	
	}
		
	
}

	
	
	
	
	
	

	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//Using ListIterator to traverse the values to different direction
		ListIterator<String> li = ar.listIterator(ar.size());
		while(li.hasPrevious()){
			System.out.println(li.previous());
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		//using ListIterator
		
		ListIterator<String> li = ar.listIterator(ar.size());
		while(li.hasPrevious()){
			String show = li.previous();
			System.out.println(show);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		//There are different ways to Iterate values from ArrayList
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Imtiaz");
		ar.add("Shameem");    
		ar.add("Sajid");
		ar.add("Shaon");  */
		
		
	/*	
		//Print using ListIterator to traverse the values to different direction
		ListIterator<String> li = ar.listIterator(ar.size());
		while(li.hasPrevious()){
			String show = li.previous();
			System.out.println(show);
		}
		*/
		
		
		/*
		//print using Advanced for loop
		for(String show: ar){
			System.out.println(show);
		}
		
		
		
		//Print using forEachRemaining method and Iterator
		Iterator<String> it = ar.iterator();
		it.forEachRemaining(shows->{
			System.out.println(shows);
		});

	
	
		//Print using For Loop
		for(int i=0; i<ar.size(); i++){
			System.out.println();
		}
		
		//Using Iterator and forEachReamining() method		
			Iterator<String> it = ar.iterator();
			it.forEachRemaining(shows->{
				System.out.println(shows);
		});
				
		
		
		// Print using forEach Loop and lambda expression
		ar.forEach(shows->{
			System.out.println(shows);
		});			
	
		
		//Print using ListIterator to traverse the value in different direction
	
		ListIterator<String> li = ar.listIterator(ar.size());
		while(li.hasPrevious()){
			String show = li.previous();
			System.out.println(show);
		}
	*/
	
	
	
	
	
	
	
	
	
	
		/*ListIterator<String> li = ar.listIterator(ar.size());
		while(li.hasPrevious()){
			String show = li.previous();
			System.out.println(show);
		}*/
			
		// Iterate ArrayList using "for each" and "lambda expression";
		/*ar.forEach(shows->{
			System.out.println(shows);
		});*/
		
		
		//Using Iterator and forEachReamining() method		
		/*Iterator<String> it = ar.iterator();
		it.forEachRemaining(shows->{
			System.out.println(shows);
		});*/			
	


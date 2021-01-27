package com.selenium.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Cls_LinkedList {
	
	public static void main (String args[]){
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("Selenium");
	ll.add("Testing");
	ll.add("QA");	
	System.out.println(ll);

	System.out.println(ll.size());
/*	//Use First and Last
	ll.addFirst("Imtiaz");
	ll.addLast("Sikder");
	System.out.println(ll);
	
	//Use Get
	System.out.println(ll.get(3));//Imtiaz
	
	//Use set
	ll.set(0, "SABRIN");
	System.out.println(ll.get(0));
	
	ll.removeFirst();
	ll.removeLast();
	System.out.println(ll.get(11));*/
	
/*	//Print all the Values using Iterator
	Iterator<String> it = ll.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}*/
	
	
	/*
	for(int i=0; i<ll.size(); i++){
		System.out.println(ll.get(i));
	}
	
	
.
*/
	
	
	//Print values with 'while Loop'
/*	int i=0;
	while(i<ll.size()){
		System.out.println(ll.get(i));
		i++;
	}*/
	
/*	
	int i=1;
	while(i<=10){
		System.out.println(i);
		i++;
	}*/
	
	/*//Print values using Iterator
	Iterator<String> it = ll.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	*/

	}
	
}

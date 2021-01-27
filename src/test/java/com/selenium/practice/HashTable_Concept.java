package com.selenium.practice;

import java.util.Hashtable;

public class HashTable_Concept {
	
	public static void main(String[] args){
		
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		
		ht.put(1, 60);
		ht.put(2, 40);
		ht.put(3, 30);
		ht.put(4, 10);
		
		System.out.println(ht.get(1));  //60
		System.out.println(ht.get(4));   //10
	}
	}

package com.selenium.practice;

public class Array {
	public static void main(String args[]){
		//int i = 20;
		//i = 10;
		//System.out.println(i);
		
		//ONE DIMENSIONAL ARRAY
		
		//Array
		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println("Size or Length of Array is : "+ a.length);
		System.out.println("The way to get 30 is : a[2]-- " + a[2]);
		System.out.println("The way to get 40 is : a[3]-- " + a[3]);
		
		//To Print all the values use For Loop
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
			
		//Char Array
		char c[] = new char[3];
		c[0]='q';
		c[1]='2';
		c[2]='$';
		
		System.out.println(c[2]);   //$
		
		//Boolean Array
		boolean b[] = new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[0]);  // True
		System.out.println(b[1]);  // false
		
		
		//String Array
		String s[] = new String[3];
		s[0]="Selenium";
		s[1]="Automation";
		s[2]="Testing";
		System.out.println(s[2]);  //Testing
		System.out.println("Length of Array is : "+ s.length);   // 3
		
		
		
		
	}
}

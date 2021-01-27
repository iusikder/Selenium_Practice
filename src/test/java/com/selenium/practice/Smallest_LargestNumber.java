package com.selenium.practice;

public class Smallest_LargestNumber {

	public static void main(String[] args) {
		
		
		//Smallest and Largest number in an array
		
		int number[] = {20, 30, 40, 70, -90, 90000};
		int largest=number[0];
		int smallest=number[0];
		
		for(int i=1; i<number.length; i++){
			if(number[i]>largest){
				largest=number[i];
			}else if(number[i]<smallest){
				smallest=number[i];
			}
		}
		System.out.println("Largest number is: "+ largest);
		System.out.println("Smallest number is: "+ smallest);
	} 
}
	
	
	
	
	
	
	
	
	
	
		// Largest and Smallest numbers
	/*	int numbers[] = { -10, 24, 50, -88, 345434 };
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("Largest number is; " + largest);
		System.out.println("Smallest number is: " + smallest);

	}
*/
	


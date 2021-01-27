package com.selenium.practice;

import java.util.ArrayList;

//  To see how many Functions are here. Press= "CTRL+O"

public class Functions {
	
	public static void main(String[] args){
	//Crating Object to call function
		Functions obj = new Functions();	
		
		obj.test();
		//Sum
		int x = obj.sum();
		System.out.println(x);
		
		//division
		int d = obj.division(40, 10);
		System.out.println(d);
		
		//getStudentName
		ArrayList<String> ar1 = obj.getStudentName();
		for(int i=0; i<ar1.size(); i++){
			System.out.println(ar1.get(i));
		}
		
		int[] m =obj.getMarks();
		for(int i=0; i<m.length; i++){
			System.out.println(m[i]);
		}
		
		String cName = obj.getCountryName("London");
		System.out.println(cName);
		
		String br =  obj.getBrowserName("klkjhhk");
		System.out.println(br);
		
		
	}
		
		
	
	//Functions
	public void test(){
		System.out.println("This is my first function");
	}
	
	public int sum(){
		int a = 20; 
		int b = 30; 
		int c = a + b;
		return c;
	}
	
	public int division(int x, int y){
		int div = x/y;
		return div;
	}
	
	public ArrayList<String> getStudentName(){
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Imtiaz");
		ar.add("Shimee");
		ar.add("Sabrin");
		ar.add("Saharin");
		return ar;
	}
	
	public int[] getMarks(){
		int[] x = new int[5];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		x[3]=40;
		x[4]=50;
		return x;
	}
	
	public String getCountryName(String cityName){
		if(cityName.equals("Dhaka")){
			return "Bangladesh";
		}else if(cityName.equals("New York")){
			return "USA";
		}else if(cityName.equals("Brussels")){
			return "Belgium";
		}else if(cityName.equals("Delhi")){
			return "India";
		}else{
		System.out.println("City is not available");
		}
		return cityName;
		}
	
	
	
	public String getBrowserName(String bType){
		if(bType.equals("Firefox")){
			return "Mozilla";
		}else if(bType.equals("IE")){
			return "InternetExplorer";
		}else if(bType.equals("Chrome")){
			return "ChromeBrowser";
		}else{
			System.out.println("Broser is no availabel");
		}
		return bType;
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	obj.test();
		//Sum
		System.out.println(obj.sum());
		//Division
		System.out.println(obj.division(30, 10));
		//GetStudentName
		ArrayList<String> ar1 = obj.getStudentName();
		System.out.println(ar1);
		
		//GetMarks
		int m1[] = obj.getMarks();
		for(int i=0; i<m1.length; i++){
			System.out.println(m1[i]);
		}
		//GetCountryName
		String cName = obj.getCountryName("Dhaka");
		System.out.println("Country Name is: " + cName);
		*/
		
		
		
	//}	
		
	
		

	//Function Creation
	/*public void test(){
		System.out.println("This is my First Function");
	}*/
	
		
	/*public int sum(){
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}*/
	
	

	//}
	/*public int division(int a, int b){
		int div = a/b;
		return div;
	}*/


	
/*	public ArrayList<String> getStudentName(){
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Imtiaz");
		ar.add("Shimee");
		ar.add("Sabrin");
		ar.add("Saharin");
		return ar;
		
	}*/
	

	
		
	

/*	
	public int[] getMarks(){
		int m[] = new int[4];
		m[0]=10;
		m[1]=20; 
		m[2]=30;
		m[3]=40;
		return m;
	}*/
	

	
	/*	
	public String getCountryName(String cityName){
		if(cityName.equals("Dhaka")){
			return "Bangladesh";
		}else if(cityName.equals("Bombay")){
			return "India";
		}else if(cityName.equals("New York")){
			return "USA";
		}else if(cityName.equals("London")){
			return "England";
		}else{
			System.out.println("City is not available");
		}
		return cityName;
	}
	
	*/
	
	
	
	
	
	
	
	
		
	
	

	/*
	public String getCountryName(String cityName){
		if(cityName.equals("Dhaka")){
			return "Bangladesh";
		}else if(cityName.equals("Delhi")){
			return "India";
		}else if(cityName.equals("New York")){
			return "USA";
		}else if(cityName.equals("London")){
			return "UK";		
		}
		return cityName + "is not available, please try again later";
	}	*/
	
	
	

	
	
	
	
	
	

/*
		//To Call these Functions I have to create an Object of the Class.
		
		Functions obj = new Functions();
		
		//1 
		obj.test();
		
		//2
		String s1 = obj.getName();
		System.out.println(s1);
		
		//3
		int a = obj.sum();
		System.out.println(a);
		
		//4
		ArrayList<String> ob = obj.getStudentName();
		System.out.println(ob);
		
		//5
		int m[] = obj.getMarks();
		for(int i=0; i<m.length; i++){
			System.out.println(m[i]);
		}
		
		//6
		int d = obj.division(10, 5);
		System.out.println("Division result is : " + d);

		
		//7
		String country = obj.getCountryName("Dhaka");
		System.out.println("Country name is : " +country);
		
		
		
		
		
			
	}
	
	//1 No Input and No Output
	public void test(){
		System.out.println("Test Method");
	}
	
	//2 No Input / Some Return
	public String getName(){
		System.out.println("Get Name");
		String s ="Selenium";
		return s;		
	}
	
	//3
	public int sum(){
		int a = 10;
		int b = 20; 
		int c = a+b;
		return c; // Output = 30
	}
	
	//4
	public ArrayList<String> getStudentName(){
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Imtiaz");
		ar.add("Shimee");
		ar.add("Sabrin");
		ar.add("Saharin");
		return ar;
	}
	
	//5
	public int[] getMarks(){
		int marks[] = new int[3];
		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		return marks;
	}
		

	//6
	public int division(int x, int y){
		int div = x/y;
		return div;
	}	
	
	
	//7
	public String getCountryName(String cityName){
		if(cityName.equals("Dhaka")){
			return "Bangladesh";
		}else if(cityName.equals("New York")){
				return "USA";
		}else if(cityName.equals("London")){
					return "UK";
		}else if(cityName.equals("Tokyo")){
						return "Japan";
		}else{
			System.out.println("City is not available ");
						
		}
		return cityName;
	}
			*/
		
	

	
	
	
	
	
	
	
	
	


package com.selenium.practice;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class W3Schools_WebTable {
	
	public static void main(String[] main){
	WebDriver driver;
	
	System.setProperty("webdriver.gecko.driver", "C:\\AllDrivers\\NewGeckoDriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();		
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	
	
	
	//Main Test
	
	
	
	List<WebElement> names = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
	List<WebElement> countries = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
	
	System.out.println("Total names are: " + names.size());
	System.out.println("Total countries are: " + countries.size());
	
	String expCompany = "Ernst Handel";
	
	for(int i=0; i<names.size(); i++){
		System.out.println(names.get(i).getText());
		
		if(expCompany.equals(names.get(i).getText())){
			System.out.println("Company name: " + names.get(i).getText() + " Country name: " + countries.get(i).getText());
			break;
		}
		
		
		/*
		if(names.get(i).getText().equals(expCompany)){
			System.out.println("Company " + names.get(i).getText() + " found at position: " + (i+1));
			break;
		}
		*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
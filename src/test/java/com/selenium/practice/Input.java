package com.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Input {
	public static WebDriver driver;
	
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver", "C:/AllDrivers/NewGeckoDriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		driver.get("https://www.facebook.com");	
		
		//How many Input Boxes are in the Facebook
		List<WebElement> input = driver.findElements(By.tagName("input"));
		int inputCnt = input.size();
		System.out.println("Total Input Boxes are: " + inputCnt);
		
		
		
		
		
		
		
		
	}
}

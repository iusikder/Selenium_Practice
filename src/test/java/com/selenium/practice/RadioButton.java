package com.selenium.practice;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class RadioButton {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/AllDrivers/NewGeckoDriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		//driver.get("https://www.facebook.com");		
	}
	
	@Test
	public void radioButton(){
		driver.get("https://www.facebook.com");	
		
		List<WebElement> radio = driver.findElements(By.cssSelector("input[type=radio"));
		
		int radioCnt = radio.size();
		System.out.println("Total radios are: "+ radioCnt);
		
		//Text of the redios
		/*for(int i=1; i<redioCnt; i++){
			System.out.println(redioCnt);
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	//List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		List<WebElement> radio = driver.findElements(By.cssSelector("input[type=radio]"));
		int radioCnt = radio.size();
		System.out.println("Total Radio in Facebook are: " + radioCnt);
		
		//Names of the Radio Button
		for(int i=0; i<radioCnt; i++){
			System.out.println(radio.get(i).getText());
		}*/
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
/*  CONSOLE
 * 	Total Radio in Facebook are: 3
	Names of Radio are: sex
	Names of Radio are: sex
	Names of Radio are: sex
	PASSED: radioButton
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*//Check if "Instagram" is present or not 
		String expText = "Instagram"; 
		boolean textFound = false;
		
		for(int i=0; i<linksCnt; i++){
			String actualText = links.get(i).getText();
			if(expText.equals(actualText)){
				textFound=true;
				System.out.println("Text Found at the position of : "+ (i+1));
				break;
			}
			}
		if(textFound==false){
		System.out.println("Text Not Found");
		}*/
		
		
		
		
		
	
		
		
		
		
		
		/*
		List<WebElement> radio = driver.findElements(By.cssSelector("input[type=radio]"));
		//How many Radio Buttons
		int radioCnt = radio.size();
		System.out.println("Radio Buttons are: " + radioCnt);*/
		
		/*List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksCnt = links.size();
		System.out.println("Tota Links are: " + linksCnt);
		
		
		//Names of all the Links / If 'Instagram' is present or not
		
		String expText = "Instagram";
		boolean linkFound = false;
		
		for(int i=0; i<linksCnt; i++){
			String actualText = links.get(i).getText();
			linkFound = true;
			if(expText.equals(actualText)){
				System.out.println("Link Found at the position of :" + (i+1));
				break;
			}
		}
		if(linkFound==false){
			System.out.println("Link Not Found");
		}	*/
	}
	


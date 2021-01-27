package com.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Links {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/AllDrivers/NewGeckoDriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
		driver.get("https://www.facebook.com");		
	}
	
	@Test
	public void linkTest(){
		
		List<WebElement> links  = driver.findElements(By.tagName("a"));
		int linksCnt = links.size();
		System.out.println("Total links in the Facebook are: " + linksCnt);
		
				
		//Texts of the Links
		String expectedText = "Instagram";
		boolean textFound = false;
	
		for(int i=0; i<linksCnt; i++){
			//System.out.println(links.get(i).getText();
			String actualText = links.get(i).getText();
			
			if(actualText.equals(expectedText)){
				textFound=true;
				System.out.println(actualText + "- presnt at position: " + (i+1));
				break;
			}	
			}
			if(textFound==false){
				System.out.println("Instagram not found");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void LinkTest(){	
		//How many links in the Facebook
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksCount = links.size();
		System.out.println("Total Links in the Facebook are: " + linksCount);
		
		//If 'Privacy' is present or not
		//Links in the Facebook
		
		String expText = "Privacy";
		boolean textFound = false;
		
		for(int i=0; i<linksCount; i++){
			String actualText = links.get(i).getText();			
			if(expText.equals(actualText)){
				textFound = true;
				System.out.println(links.get(i).getText() + "- found at position: " + (i+1));  //39
				break;
			}
		}
		if(textFound==false){
			System.out.println("Text not found");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//How many Links are there in Facebook.com Web-site
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksCount = links.size();
		System.out.println("Total Links on Facebook are : " + linksCount);
		
	
		//Names of the Links on Facebook / "Instagram" is present or not
		String expText = "Instagram";
		boolean linkFound = false;
		
		for (int i=0; i<linksCount; i++){
			String actualText = links.get(i).getText();
			System.out.println("Actual Text is : " + actualText);
			System.out.println("Expected Text is : "+ expText );
			if(actualText.equals(expText)){
				linkFound =true;
				System.out.println("Instagram is presnt on the Website at the position of --"+ (i+1));
				break;
			}
		}		 
		if(linkFound == false){
		System.out.println("Instagram NOT found");		
		}
	*/
	
	}
	
}
	
	
	
	
	
	
	
	














	




package com.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClsDropDown {
	WebDriver driver;
	
	
	 @BeforeMethod
     public void setUp(){
	     System.setProperty("webdriver.gecko.driver", "C:/AllDrivers/NewGeckoDriver/geckodriver.exe");
	     driver = new FirefoxDriver();
	     driver.manage().deleteAllCookies();
	     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);    
	     driver.manage().window().maximize();
	     
	     //driver.get("https://facebook.com");
	     //driver.get("https://www.slideshare.net/login");
	     driver.get("https://orbitz.com");         
	 }
	 
	//package-advanced-preferred-class-hp-package
	 
	 
	 
	 @Test
	 public void dropDownTest() throws Exception{
		//After clicking this Button DropDown box will appear
		driver.findElement(By.id("tab-package-tab-hp")).click();
		//package-advanced-preferred-class-hp-package
		
		
		Select select = new Select(driver.findElement(By.id("package-advanced-preferred-class-hp-package")));
		select.selectByVisibleText("Business");
		
		//How many options 
		List<WebElement> options = select.getOptions();
		int optionsCnt = options.size();
		System.out.println(optionsCnt);
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	


	/* @Test
	 public void dropDownTest(){
		driver.findElement(By.id("tab-package-tab-hp")).click();
		//package-advanced-preferred-class-hp-package
		
		Select select = new Select(driver.findElement(By.id("package-advanced-preferred-class-hp-package")));
		select.selectByVisibleText("Business");
		
		List<WebElement> options = select.getOptions();
		int optionsCnt = options.size();
		System.out.println("Total Options are: " + optionsCnt);
		
		
		//If 'First class' available or not
		
		String expText = "Business";
		boolean optionFound = false;
				
		for(int i=0; i<optionsCnt; i++){
			//System.out.println(options.get(i).getText());
			String actualText = options.get(i).getText();
			if(expText.equals(actualText)){
				optionFound = true;
				System.out.println(options.get(i).getText() + "- Option Found at position: " + (i+1));
				break;
			}
		}
		if(optionFound==false){
			System.out.println("Option could not be found");
		}
		
	 }*/ 
}

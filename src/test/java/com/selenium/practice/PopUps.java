package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//gc Rdddy

public class PopUps {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:/AllDrivers/NewGeckoDriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
			
		//driver.get("https://facebook.com");
		//driver.get("https://www.slideshare.net/login");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	
	@Test
	public void popUpsTest() throws InterruptedException{	
		//After Clicking "Go" Button alert Box will appear		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(4000);
		
	//driver.switchTo().alert().accept();
	//driver.switchTo().defaultContent();
	
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		
		
		//Validation
		
		if(alertText.equals("Please enter a valid user name")){
			System.out.println("Correct alert message");
		}else{
			System.out.println("Incorrect alert message");
		}
		alert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		//
		//validation
		if(text.equals("Please enter a valid user name")){
			System.out.println("Correct alert message");
		}else{
			System.out.println("Incorrect alert message");
		}
		alert.accept();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		
		//Validation
		if(alertText.equals("Please enter a valid user name")){
			System.out.println("Correct Alert message");
		}else{
			System.out.println("Incorrect Alert message");
		}
		alert.accept();*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*//After Clicking "Go" Button alert Box will appear		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		//Alert is a pre-defined library in Java
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		//Validation
		if(text.equals("Please enter a valid user name")){
			System.out.println("Correct alert message");
		}else{
			System.out.println("Incorrect alert message");
		}
		alert.accept();
		//alert.dismiss();
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		/*Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		//Validation
		if(text.equals("Please enter a valid user name")){
			System.out.println("Correct alert message");
		}else{
			System.out.println("Incorrect alert message");
		}
		alert.accept();*/
		
	}	

		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//After Clicking "Go" Button alert Box will appear		
		driver.findElement(By.name("proceed")).click(); //Click on "Go" Button
		
		//Note: "Alert" is pre-defined library of Selenium		
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		//Validation
		String text = alert.getText();
		if(text.equals("Please enter a valid username")){
			System.out.println("Correct alert message");
		}else{
			System.out.println("Incorrect alert message");
		}
		
		alert.accept(); 	//Click on OK Button	
		//alert.dismiss(); //Click on Cancel Button if there is any
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("sdfsdf");//Put the value in Username Box
				*/
	
	
	
	
	
	
	

	
	
	
	

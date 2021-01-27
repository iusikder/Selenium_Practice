package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class isDisplayedTest {
	public WebDriver driver;
	
	
	@BeforeMethod
	public void setUp(){
	System.setProperty("webdriver.gecko.driver", "C:/AllDrivers/NewGeckoDriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	@Test
	public void isDisplayed(){
/*		boolean b1 = driver.findElement(By.id("login1")).isDisplayed();
		System.out.println(b1);
		
		boolean b2 = driver.findElement(By.id("password")).isDisplayed();
		System.out.println(b2);*/
		
		//Using Validation
		Assert.assertEquals(driver.findElement(By.id("login1")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.id("password")).isDisplayed(), true);
		Assert.assertEquals(driver.findElement(By.id("remember")).isSelected(), true);
		
		
		
		
		
		
		
		
		
	}
}

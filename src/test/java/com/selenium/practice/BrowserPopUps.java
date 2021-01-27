package com.selenium.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserPopUps {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUps(){
		System.setProperty("webdriver.gecko.driver","C:/AllDrivers/LatestChrome/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","C:/AllDrivers/NewGeckoDriver/geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
	}
	
	@Test
	public void browserPopUpsTest() throws Exception{
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #1']")).click();
		
		//Actual Test
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println(parentWindowId);
		
		String childWindowId = it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("Title of Child window : "+ driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Title of Parent window : " + driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*
		//Actual Test
		
		Set<String> handler = driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent window id: " + parentWindowId);
		String childWindowId = it.next();
		System.out.println("Child window id: " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("Child window title: "+ driver.getTitle());
		Thread.sleep(7000);
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window title: " + driver.getTitle());
		
		*/
		
		
		
		
		
		
		
		
		
	}
}

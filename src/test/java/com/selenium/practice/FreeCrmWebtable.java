package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FreeCrmWebtable {
	
	//INCOMPLETE BECAUSE THE WEBSITE IS NOT OPENING. I WILL FIX THIS LATER. I DON'T WANT TO SPEND MY TIME ON THIS AT THIS TIME....
	public static WebDriver driver;
	
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.gecko.driver", "C:\\AllDrivers\\NewGeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://classic.crmpro.com/index.cfm?CFID=330838&CFTOKEN=99096559&jsessionid=4830aa9e655a600e57461327227785a77131");
		driver.findElement(By.xpath("//input[@type='username'")).sendKeys("iusikder");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sssimti");
		
		Thread.sleep(4000);
		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		//submitBtn.click();

		Actions actions = new Actions(driver); 
		actions.click(submitBtn).perform();
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();		
		
		/*//Switching to Frame if there is any Frame........
		public void switchToFrame(){
			driver.switchTo().frame("mainpanel");								
		}*/

	}
}

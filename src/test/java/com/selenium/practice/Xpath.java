package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Xpath {
	WebDriver driver;
	
	@BeforeMethod
		public void setUp(){
		System.setProperty("webdriver.chrome.driver","C:/AllDrivers/LatestChrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		
		driver.get(" https://classic.crmpro.com/index.html?e=2");
	}
	
	@Test
	public void test() throws Exception{	
		driver.findElement(By.name("username")).sendKeys("iusikder");
		driver.findElement(By.name("password")).sendKeys("sssimti");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='btn btn-small' and @type='submit']")).click();		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	/*	driver.switchTo().frame("mainpanel"); 		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		action.moveToElement(element).perform();	
*/
	}
	
	@AfterMethod	
	public void tearDown(){
		//driver.quit();
	}
}

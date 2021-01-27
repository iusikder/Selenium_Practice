package com.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\AllDrivers\\NewGeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();			
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");	
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[text()='VIEW ALL']")).click();

	

	
		//*[@id="container"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]
		//*[@id="container"]/div/div[3]/div[2]/div/div[2]/div[3]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]
		//*[@id="container"]/div/div[3]/div[2]/div/div[2]/div[4]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]
		//*[@id="container"]/div/div[3]/div[2]/div/div[2]/div[5]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]
		//*[@id="container"]/div/div[3]/div[2]/div/div[2]/div[6]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]
		//*[@id="container"]/div/div[3]/div[2]/div/div[2]/div[7]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]
	
		
	List<WebElement> rows = driver.findElements(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[2]/div"));
	int rowsCnt = rows.size();
	System.out.println("Total Products: " + rowsCnt);
	
	String beforeXPath = "//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[";
	String afterXPath = "]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]";
	
	for(int i=2; i<=7; i++){
		String xPath = beforeXPath + i + afterXPath;
		String allPrice = driver.findElement(By.xpath(xPath)).getText();
		System.out.println(allPrice);
	}
	
	
	
	
	}
}

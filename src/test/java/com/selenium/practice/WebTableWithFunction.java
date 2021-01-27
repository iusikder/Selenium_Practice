package com.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableWithFunction {
	
	WebDriver driver;	
	
	@Test
	public void webTableTest(){	
		
	//This is for Function below
	//==========================
	String company = "Advanced Enzyme Tech";  //find the current price
	
	System.setProperty("webdriver.gecko.driver", "C:\\AllDrivers\\NewGeckoDriver\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();		

	driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	int rowNumber = getRowNumberWithCellData(company);
	Assert.assertTrue(rowNumber != -1, "Company name not found in table - "+company);
	String price = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rowNumber+"]/td[4]")).getText();
	System.out.println(company + "---" + price);
	
	
	}
	

	
	public int getRowNumberWithCellData(String data){
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for(int rNum=0; rNum<rows.size(); rNum++){
			WebElement row = rows.get(rNum);
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for(int cNum=0; cNum<cells.size(); cNum++){
				//System.out.println(cells.get(cNum).getText());
				if(data.equals(cells.get(cNum).getText()))
					return (rNum+1);
			}
			
		}
		//No data found
		return -1;
		
	}
	//Return rows number corresponding to data
	//data not found returns -1
	
	
	
}

package com.selenium.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WebTableRediff {
	
	WebDriver driver;	
	
	@Test
	public void webTableTest(){	
		
		//This is for normal code
		//=======================
		
		System.setProperty("webdriver.gecko.driver", "C:\\AllDrivers\\NewGeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
	
		//driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		//driver.get("https://portfolio.rediff.com/portfolio");
		driver.get("https://www.rediff.com/");
		
			//====LOGIN TEST===================================================
	
	
		//Click Money Link
		driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
		
		//Clicking on Sign In
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		//Type Email
		driver.findElement(By.xpath("//input[@id='useremail']")).sendKeys("iusikder@yahoo.com");
		
		//Type Password
		driver.findElement(By.xpath("//input[@id='userpass']")).sendKeys("iussab05");
		
		//Click Submit 		
		driver.findElement(By.xpath("//input[@id='loginsubmit']")).click();
		//END OF LOGIN 
		
		
		
		
	
		//VALIDATION
		waitForPageToLoad();
		
		//table[@id='stock']/tbody/tr[1]/td[2]
		//table[@id='stock']/tbody/tr[2]/td[2]
		
		
		
	
		
	/*	
		for(int i=1; i<=2; i++){
		
			System.out.println(stock);
		}*/
	}

	//a[contains(text(),'test2 test2')]/parent::td//precesing-sibling::td//input[@name='contact_id']
	
	
	
			//(stock.get(i).getText().equals("Tata Steel")){
				//System.out.println(stock.get(i).getText());
				//driver.findElement(By.xpath("//table[@id='stock']/tbody/tr["+i+"]/td[1]/input[@type='radio']")).click();
				//driver.findElement(By.xpath("//table[@id='stock']/tbody/tr["+i+"]/td[1]/input")).click();

				
		
	
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
	
	
	
	
	
	
	

	
	
	public void wait (int time){
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	//This Function is for jQuery purpose.
		public void waitForPageToLoad(){
			JavascriptExecutor js = (JavascriptExecutor)driver;
			int i=0;
			while (i!=10){
				String state = (String)js.executeScript("return document.readyState;");
				System.out.println(state);
				
				if(state.equals("complete"))
					break;
			else
					wait(2);
				i++;
			}
			
			//Check jQuery status
			i=0;
			while(i!=10){
				
			Long d = (Long) js.executeScript("return jQuery.active;");
			System.out.println(d);
			if(d.longValue()== 0)
				break;
			else
				wait(2);
			i++;					
			}
		}


		
		//This Function is for selecting the Date
		public void selectDate (String d){
			//Day, Month, Year
			Date current = new Date();
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
			
			try{
				Date selected = sd.parse(d);
				String day = new SimpleDateFormat("dd").format(selected);
				String month = new SimpleDateFormat("MMMM").format(selected);
				String year = new SimpleDateFormat("yyyy").format(selected);
				System.out.println(day+"---"+month+"---"+year);
				String desiredMonthYear=month+" "+year;
				
				while (true){
					String displayMonthYear=driver.findElement(By.xpath("//div[@class='dpTitleText']")).getText();
					if(desiredMonthYear.equals(displayMonthYear)){
						//Select the Day --- xPath was done by FirePath....
						//driver.findElement(By.xpath(".//*[@id='datepicker']/table/tbody/tr[5]/td[2]/div")).click();
						driver.findElement(By.xpath("//td[text()='"+day+"']")).click();
						break;
					}else{
						if(selected.compareTo(current) > 0)
							driver.findElement(By.xpath("//*[@id='datepicker']/table/tbody/tr[1]/td[4]/button")).click();
						else if(selected.compareTo(current) < 0) 
							driver.findElement(By.xpath("//*[@id='datepicker']/table/tbody/tr[1]/td[2]/button")).click();
					
					}
				}
			}catch(ParseException e){
				e.printStackTrace();
			}
		}

	}

	
	
	
	
	
	
	
	


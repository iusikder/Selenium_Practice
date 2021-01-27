package com.selenium.practice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	
	public static void main(String args[]){
		
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "C:\\AllDrivers\\NewGeckoDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowsCnt = rows.size();
		System.out.println("Total rows are: " + rowsCnt);
		//Actual Test
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		//*[@id="customers"]/tbody/tr[5]/td[2]
		//*[@id="customers"]/tbody/tr[6]/td[2]
		//*[@id="customers"]/tbody/tr[7]/td[2]
 //table[@class='dataTable']/tbody/tr/td[1]
			
		String beforeXPath = "//*[@id='customers']/tbody/tr[";
		String afterXPath = "]/td[2]";
		
		boolean flag=false;		
		for(int i=2; i<=rowsCnt; i++){
			String actualXPath = beforeXPath + i + afterXPath;
			String text = driver.findElement(By.xpath(actualXPath)).getText();
			
			if(text.equals("Francisco Chang")){
				System.out.println("Item found at the position of: "+ (i-1));
				flag=true;
			}
		}
		if(flag==false){
			System.out.println("Element Not Found");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		//Test Starts here
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowsCnt = rows.size();
		System.out.println(rowsCnt);
		
		
		String beforeXPath = "//*[@id='customers']/tbody/tr[";
							  //*[@id='customers']/tbody/tr
		String afterXPath = "]/td[1]";
		
		for(int i=2; i<=rowsCnt; i++){
			String actualXPath = beforeXPath + i + afterXPath;
			String text = driver.findElement(By.xpath(actualXPath)).getText();
			System.out.println(text);
			
			if(text.equals("Ernst Handel")){
				System.out.println("Text found at position " + (i-1));
			}
		
		}
		//////////////////////////////////////////////////////
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
/*		// COMPANY
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXPath = "//*[@id='customers']/tbody/tr[";
		String afterXPath = "]/td[1]";
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rowsCount = rows.size();
		
		
		for(int i=2; i<=rowsCount; i++){
			WebElement ele = driver.findElement(By.xpath(beforeXPath + i + afterXPath));
			System.out.println(ele.getText());
			
			//If 'Island Trading' present or not
			if(ele.getText().equals("Island Trading")){
				System.out.println(ele.getText() + "- present at position: " + (i-1));
				break;
			}
		}
			System.out.println("**********************************");
			
			
			//CONTACT
			
			//*[@id="customers"]/tbody/tr[2]/td[2]
			//*[@id="customers"]/tbody/tr[3]/td[2]
			//*[@id="customers"]/tbody/tr[4]/td[2]
			//*[@id="customers"]/tbody/tr[5]/td[2]
			//*[@id="customers"]/tbody/tr[6]/td[2]
			//*[@id="customers"]/tbody/tr[7]/td[2]
			
			String before_XPath_Contact = "//*[@id='customers']/tbody/tr[";
			String after_XPath_Contact = "]/td[2]";
			
			for (int i=2; i<=7; i++){
				WebElement contactName = driver.findElement(By.xpath(before_XPath_Contact + i + after_XPath_Contact));
				System.out.println(contactName.getText());
				
				//If 'Helen Bennett' present or not
				if(contactName.getText().contains("Helen Bennett")){
					System.out.println(contactName.getText() + "- found at position: " + (i-1));
					break;
				}
				
				if(contactName.getText().contains("Helen Bennett"){
					System.out.println(contactName.getText() + "- found at position: " + (i-1));
					break;
				}
			}*/		
		
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

				
	/*	// COMPANY
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforexpath_Comp = "//*[@id='customers']/tbody/tr[";
		String afterxpath_Comp = "]/td[1]";
		boolean textFound = false;
		String expText = "Island Trading";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
															 
		int rowsCount = rows.size();
		System.out.println("Total rows are : " + rowsCount);
		
		//Note: i=0; ---- (i+1)
		//		i=1; ---- (i)---- Normal
		//		i=2; ---- (i-1)
		
		for (int i=2; i<=rowsCount; i++){
			String compName = driver.findElement(By.xpath(beforexpath_Comp + i + afterxpath_Comp)).getText();
			System.out.println(compName);
			
			if(compName.equals(expText)){
				System.out.println(compName + " found at position: " + (i-1));
				textFound = true;
				break;
			}		
		}
		if(textFound==false){
			System.out.println("Text not found");
		}
		
		
		
		
		
		
		//CONTACT
		//*[@id="customers"]/tbody/tr[2]/td[2]
		//*[@id="customers"]/tbody/tr[3]/td[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		//*[@id="customers"]/tbody/tr[5]/td[2]
		//*[@id="customers"]/tbody/tr[6]/td[2]
		//*[@id="customers"]/tbody/tr[7]/td[2]
		
		String beforexpath_Contact = "//*[@id='customers']/tbody/tr[";
		String afterxpath_Contact = "]/td[2]";
		
		for(int i=2; i<=rowsCount; i++){
			String actualXPath = beforexpath_Contact + i + afterxpath_Contact ;
			WebElement contactName = driver.findElement(By.xpath(actualXPath));
			System.out.println(contactName.getText());
			
			//Validation
			if(contactName.getText().equals("Helen Bennett")){
				System.out.println(contactName.getText()+ " found");
			}			
			
		}		
		
	}*/




































		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="main"]/div[3]/h3
			
	/*	String beforeXPath = "//*[@id='customers']/tbody/tr[";
		String afterXPath = "]/td[1]";
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowsCount = rows.size();
		System.out.println("Total Rows in the WebTable are: " + rowsCount);
	
		//Company name
		for(int i=2; i<=rowsCount; i++){
			//This is the Direct way and next lines are using variables. I can write in either way. Naveen used both the ways.
			String company = driver.findElement(By.xpath(beforeXPath +i+ afterXPath)).getText();
			System.out.println(company);
			
					
			String xPathCompany = beforeXPath +i+ afterXPath;
			WebElement element = driver.findElement(By.xpath(xPathCompany));
			System.out.println("All the Company names are: " + element.getText());
		
			if(element.getText().equals("Island Trading")){
				System.out.println("Company name: " + element.getText()+ " is found at position " + (i-1));
				break;			
			}			
		}
		
		
		//*******************************************************************************
		
		//Contact name
		
		String afterXPathComp = "]/td[2]";
		for(int i=2; i<=rowsCount; i++){
			String xPathContact = beforeXPath + i + afterXPathComp;
			WebElement element = driver.findElement(By.xpath(xPathContact));
			System.out.println("All the Contact names are: " + element.getText());
			
			if(element.getText().equals("Helen Bennett")){
				System.out.println("Contact: " + element.getText()+ " is found at position: "+(i-1));
				break;
			}			
		}
		
		
		
		//*********************************************************************
		//For Heading
		//*[@id="customers"]/tbody/tr[1]/th[2]  
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int colsCount = cols.size();
		System.out.println("Total Columns in the table are: " + colsCount);
		
		String colBeforeXPath = "//*[@id='customers']/tbody/tr[1]/th[";
		String colAfterXPath = "]";	
		
		for(int i=1; i<=colsCount; i++ ){
			String actualXPath = colBeforeXPath+i+colAfterXPath;
			WebElement element = driver.findElement(By.xpath(actualXPath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Contact")){
				System.out.println("Contact found at position: " + (i));				
			}	
			}
		
		
		
		*/
		
		//*****************************   **************************************
		
	/*	//THIS IS FOR FREECRM WEBSITE 
		String beforeXPathCrm = "//*[@id='vContactsForm']/table/tbody/tr[";
		String afterXpathCrm = "]/td[2]";
		
		for(int i=4; i<=4; i++){
			String name = driver.findElement(By.xpath(beforeXPathCrm + i + afterXpathCrm )).getText();
			System.out.println(name);
		}
		
		}*/
		
		
/*	boolean contactDisplayed = contactsPage.verifyContactsByName("ABCD EFG");
	Assert.assertTrue(contactDisplayed, "Contact could not be found");*/
	
	//Url: https://classic.crmpro.com/index.cfm?CFID=4660&CFTOKEN=88367726&jsessionid=483052b0fc45cb452f462e4b3ce57f561f15
		//ABCD EFGH  
	//*[@id="vContactsForm"]/table/tbody/tr[4]/td[2]
	
	//xapth for Tick ==//*[@id="vContactsForm"]/table/tbody/tr[4]/td[1]/input
					
	//*[@id="vContactsForm"]/table/tbody/tr[4]/td[1]/input


	
}

	





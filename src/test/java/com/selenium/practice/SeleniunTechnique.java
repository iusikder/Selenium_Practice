	package com.selenium.practice;
	
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeMethod;
	
	public class SeleniunTechnique {

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
		
	/*	
			//How many Links are in the Facebook.com
			@Test
			public void linksAvailable(){		
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int linksCount = links.size();
			System.out.println("Total number of List boxes available are : "+ linksCount);
		}
		
			
			//How many Radio Button are there
			@Test
			public void radioButton(){
			List<WebElement> radioBtn = driver.findElements(By.cssSelector("input[type=radio]"));
			int radioBtnCount = radioBtn.size();
			System.out.println("Total number of DropDown are : " +radioBtnCount);
			}
			
			
			//How many Input Boxes are there
			@Test
			public void inputBox(){
			List<WebElement> inputBox = driver.findElements(By.tagName("input"));
			int inputBoxCount = inputBox.size();
			System.out.println("Total number of Input Boxes available are : "+ inputBoxCount); 
			}
			
			
			//How to get the Values of all the Radio Buttons in the WebPage
			@Test
			public void radioBtnValues(){
			List<WebElement> radioBtns = driver.findElements(By.cssSelector("input[type=radio]"));
			int radioBtnsCount = radioBtns.size();
			System.out.println("Total number of DropDown are : " +radioBtnsCount);
			
			//After this create a Loop
			for(int i=0; i<radioBtnsCount; i++){
				//System.out.println("Values of all the Radio Buttons are: " + radioBtns.get(i).getAttribute("value"));
				//System.out.println("Values of all the Radio Buttons are: " + radioBtns.get(i).getAttribute("name"));
				System.out.println("Values of all the Radio Buttons are: " + radioBtns.get(i).getAttribute("id"));
					
				//To Click on Radio Button
				//radioBtns.get(i).click();
			}
			}
			
			*/
		
		
		
		
		
		
		
		
		/*
			
			//How many Links are in the Facebook.com
			@Test
			public void linksText()
			{										// In case you want to search something different. like-- ChkBox
				//List<WebElement> links = driver.findElements(By.cssSelector("input[type=checkbox]"));
													// In case of Radio Button
				//List<WebElement> links = driver.findElements(By.cssSelector("input[type=radio]"));
				
				
				List<WebElement> links = driver.findElements(By.tagName("a"));
				int linksCount = links.size();
				System.out.println("Total number of Links available are : "+ linksCount);
			
				
				//Find if Instagram is present in the Link or not				
				String expText = "Instagram";
				boolean linkFound = false;	  // Error message will come only once	
				
				for(int i=0; i<=linksCount-1; i++)
				{
					//System.out.println(links.get(i).getText()); //Print all the Links 						
					//links.get(i).click();          //Click on the Link and Navigate back
					//driver.navigate().back();      and Navigate back					
					//System.out.println("i value is : " + i);           //To check the "i" value
					String actLinks = links.get(i).getText();   //Actual Links
					if(actLinks.equals(expText))
					{
						linkFound = true;
						System.out.println("Instagram found at the position of -- "+ (i+1));
						break;					       //Once Element is found it will not go further
					}			
				}	
				if(linkFound == false)
				{
				System.out.println("Link Not Found");
			}
			}
		*/
		
		
		
		
		
		
		
		// DROP-DOWN
		//--------------------------------------------------------------------------
	/*	
		@Test
		public void dropDown() throws InterruptedException{			
			
			driver.findElement(By.id("tab-package-tab-hp")).click();//Clicking on the "Packages" Button
		
			Select type = new Select(driver.findElement(By.id("package-advanced-preferred-class-hp-package")));
		//  type.selectByIndex(2);
		//	type.selectByValue("p");
			//Thread.sleep(10000);			
			type.selectByVisibleText("Business");
			
		//	System.out.println("If the Drop-down is isMultiple : " + type.isMultiple());
			
			List<WebElement> prefClassList = type.getOptions();
			int prefClassCnt = prefClassList.size();
			
			System.out.println(prefClassCnt);
			
			String expClassName = "Business";
			boolean itemExist = false;
			
			for(int i=0; i<=prefClassCnt-1; i++){
				String actClassName = prefClassList.get(i).getText();
				System.out.println("Actual ClassName " + actClassName);
				if(actClassName.equals(expClassName)){
					itemExist = true;
					System.out.println("Business classname exists");				
					break;
			}						
			}	
		if(itemExist == false){
			System.out.println("Business classname doesn't exist");
		}
	}*/
		
	}	
		
		
		
		
		
		
		
		
		
		
		
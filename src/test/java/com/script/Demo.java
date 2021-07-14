package com.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.pages.Clothing;
import com.pages.Fashion;
import com.pages.HomePage;
import com.pages.Quantity;
import com.pages.Twitter;
import com.pages.View_cart;

public class Demo
{
		WebDriver driver;
		HomePage homePage;
		Fashion fash;
		Clothing clothing;
		Twitter twitter;
		Quantity quantity;
		View_cart view;
		
		@BeforeTest
		public void TestSetUp() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
			driver = new ChromeDriver();
			
			
			driver.get("http://demostore.x-cart.com/");	
			driver.manage().window().maximize();
		
		}
		
		@Test
	    public void Testng() throws InterruptedException 
	    {	
			homePage=new HomePage(driver);
			homePage.Click_On_Fashion();
			fash=new Fashion(driver);
			fash.Click_On_Fashion();
			clothing=new Clothing(driver);
			clothing.Click_On_Firstprod();
			twitter=new Twitter(driver);
			twitter.Click_On_Twit();
			quantity=new Quantity(driver);
			quantity.Click_On_Add();
			view=new View_cart(driver);
			view.Click_On_View();
			
		}
		
		
}

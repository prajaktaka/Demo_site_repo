package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage 
{
	
	WebDriver driver;
		
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Click_On_Fashion() 
	{
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Fashion")).click();
		
		return;
	}
}

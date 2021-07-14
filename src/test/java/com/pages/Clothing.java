package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Clothing 
{
	WebDriver driver;
	
	public Clothing(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Click_On_Firstprod() 
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[3]/div/div/div[3]/ul/li[1]/div/div[1]/a/img")).click();
		
		/*String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Boyfriend T-Shirt with Chest Logo";
		Assert.assertEquals(ExpectedTitle, ActualTitle);*/
		return;
	}
}
package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Fashion 
{
	
	WebDriver driver;
		
	public Fashion(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Click_On_Fashion() 
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement fash=driver.findElement(By.linkText("Fashion"));
		Actions actionProvider = new Actions(driver);
	    actionProvider.moveToElement(fash).build().perform();
	    driver.findElement(By.xpath("//*[@id=\"sidebar-first\"]/div/div/div[1]/div/ul/li[1]/ul/li[1]/a/span")).click();
	}
}
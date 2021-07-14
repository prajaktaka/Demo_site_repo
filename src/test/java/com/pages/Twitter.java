package com.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Twitter 
{
	WebDriver driver;
	
	public Twitter(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Click_On_Twit() 
	{
		// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[3]/div[2]/div[3]/div[2]/div/span[2]")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();

    	Set<String>s=driver.getWindowHandles();

    	Iterator<String> I1= s.iterator();

    	while(I1.hasNext())
    	{

    	String child_window=I1.next();


    	if(!parent.equals(child_window))
    	{
    		driver.switchTo().window(child_window);
    		
    		driver.close();
    		
    	}
    	driver.switchTo().window(parent);
    	}
		return;
	}
	
}


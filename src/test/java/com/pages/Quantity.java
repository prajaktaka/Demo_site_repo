package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Quantity 
{
	WebDriver driver;
	
	WebElement add;
	public Quantity(WebDriver driver)
	{
		this.driver=driver;
	}

	public void Click_On_Add() 
	{
		driver.findElement(By.xpath("//*[@id=\"amount7\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"amount7\"]")).sendKeys("2");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[5]/div/div/div[2]/div/div/div[3]/div[3]/form[2]/div[2]/div/div[3]/button")).click();
		
		return;
	}
	
}
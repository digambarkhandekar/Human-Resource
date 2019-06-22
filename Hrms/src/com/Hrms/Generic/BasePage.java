package com.Hrms.Generic;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage 
{
	WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void verifyTitle(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.titleIs(title));
			Reporter.log("title is matching = "+title, true);
		}
		catch(Exception e)
		{
			Reporter.log("title is matching = "+driver.getTitle(), true);
			Assert.fail();
		}
		
	}
	public void verifyElement(WebElement element) 
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		try
		
		{
			wait.until(ExpectedConditions.invisibilityOf(element));
			Reporter.log("element is matching = " ,true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not matching = " ,true);
			Assert.fail();
		}
	}
}

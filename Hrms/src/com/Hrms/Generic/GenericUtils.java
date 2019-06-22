package com.Hrms.Generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class GenericUtils 
{
	public static void getScreenshot(WebDriver driver, String name)
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(src, new File("./ScreenShot/"+name+".png"));
		}
		catch(Exception e)
		{
			
		}
		
	}
	public static void SelectByIndex(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
		
	}
	public static void SelectByValue(WebElement element, int value)
	{
		Select sel=new Select(element);
		sel.selectByIndex(value);
		
	}
	public static void SelectByVisibleText(WebElement element, int text)
	{
		Select sel=new Select(element);
		sel.selectByIndex(text);
		
	}
	public static void alertOk(WebDriver driver)
	{
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		Reporter.log(text,true);
		a.accept();
	}
	public static void alertCancel(WebDriver driver)
	{
		Alert a=driver.switchTo().alert();
		a.dismiss();
	}
	public static void alertSendKeys(WebDriver driver, String text)
	{
		Alert a=driver.switchTo().alert();
		a.sendKeys(text);
		a.accept();
	}
	
}

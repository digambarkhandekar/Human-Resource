package com.Hrms.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConstant
{
	protected WebDriver driver;
	@BeforeMethod
	public void PreCondition()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://192.168.122.62/hrms");
		
	}
	@AfterMethod
	public void PostCondition(ITestResult res)
	{
		int status=res.getStatus();
		if(status==2)
		{
			String name=res.getMethod().getMethodName();
			GenericUtils.getScreenshot(driver, name);
		}
	driver.close();	
	}
}

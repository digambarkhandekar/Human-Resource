package com.Hrms.Test;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Hrms.Generic.BaseTest;
import com.Hrms.Generic.ExcelData;
import com.Hrms.Pages.hrmsLoginPage;

public class validLoginTest extends BaseTest
{
	
	@Test(priority=1)
	public void validLoginTest() 
	{
		String username=ExcelData.getData(file_path, "TC01", 1, 0);
		String password=ExcelData.getData(file_path, "TC01", 1, 1);
		String title=ExcelData.getData(file_path, "TC01", 1, 2);
		
		hrmsLoginPage lp=new hrmsLoginPage(driver);
		lp.enterUN(username);
		lp.enterPW(password);
		lp.clickOnLogin();
	
	}
	
}

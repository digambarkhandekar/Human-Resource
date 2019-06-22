package com.Hrms.Pages;

import org.apache.poi.Version;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.security.Password;

import com.Hrms.Generic.BasePage;

	public class hrmsLoginPage extends BasePage 
	{
		public hrmsLoginPage(WebDriver driver) 
		{
			super(driver);
			PageFactory.initElements(driver, this);	
			// TODO Auto-generated constructor stub
		}
		@FindBy(id="Email")
		private WebElement userNameTB;
		
		@FindBy(id="Password")
		private WebElement passwordTB;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement loginBT;
		
		
		public void enterUN(String username)
		{
			userNameTB.sendKeys(username);
		}
		public void enterPW(String password)
		{
			passwordTB.sendKeys(password);
		}
		public void clickOnLogin()
		{
			loginBT.click();
		}
		public String verifyerrormsg(WebElement error)
		{
			verifyElement(error);
			String aerrormsg=error.getText();
			return aerrormsg;
		}
		public String verifyVersion(WebElement version)
		{
			verifyElement(version);
			String aversion=Version.getVersion();
			return aversion;
		}
		
	}



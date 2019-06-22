package com.Hrms.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hrms.Generic.BasePage;

public class hrmsAddApplicantPage extends BasePage 
{

	
	public hrmsAddApplicantPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//i[@class='fa fa-sign-out text-left']")
	private WebElement Logout;
	
	
	public void ClickOnlogout()
	{
		Logout.click();
	}
	
	
}

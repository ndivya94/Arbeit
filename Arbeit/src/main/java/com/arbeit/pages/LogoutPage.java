package com.arbeit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arbeit.genericLib.BaseTest;

public class LogoutPage 
{
	@FindBy(xpath="//a[@href=\"/crm/logout.sas\"]") private WebElement logoutBtn;
	public LogoutPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public void ClicklogoutBtn()
	{
		logoutBtn.click();
	}

}

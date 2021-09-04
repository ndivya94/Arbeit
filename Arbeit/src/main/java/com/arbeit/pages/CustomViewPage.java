package com.arbeit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arbeit.genericLib.BaseTest;

public class CustomViewPage 
{
	@FindBy(xpath="//input[@value=\"New Sales Order\"]") private WebElement newsalesorderBtn;
	public CustomViewPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickNewsalesorderBtn()
	{
		newsalesorderBtn.click();
	}

}

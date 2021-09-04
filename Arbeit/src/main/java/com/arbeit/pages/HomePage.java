package com.arbeit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arbeit.genericLib.BaseTest;

public class HomePage 
{
	@FindBy(xpath="//body/descendant::img[@id=\"scrollright\"]") private WebElement scrollrightBtn;
	@FindBy(xpath="//a[text()=\"Sales Orders\"]") private WebElement salesorderTab;
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickSalesorderTab()
	{
		for(int i=1;i<=20;i++)
		{
			scrollrightBtn.click();
		}
		salesorderTab.click();
	}

}

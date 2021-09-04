package com.arbeit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arbeit.genericLib.BaseTest;
import com.arbeit.genericLib.WebDriverCommonLib;

public class ViewSalesListpage 
{
	
		@FindBy(xpath="//select[@name=\"cvid\"]") private WebElement viewbtn;
		//@FindBy(xpath="") private WebElement mysalesbtn;

		//@FindBy(xpath="//input[@value=\"Create Task\"]") private WebElement createtaskBtn;
		@FindBy(xpath="//input[@value=\"5108\"]") private WebElement checkbox1;
		@FindBy(xpath="//input[@value=\"5106\"]") private WebElement createtaskBtn;
	public  ViewSalesListpage()
		{
			PageFactory.initElements(BaseTest.driver, this);
	    }
		public void clickviewbtn()
		{
		viewbtn.click();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.selectoption(viewbtn, 0);
		createtaskBtn.click();
		wlib.alert();
		
		}

}

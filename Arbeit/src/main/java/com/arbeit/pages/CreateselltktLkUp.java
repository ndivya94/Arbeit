package com.arbeit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arbeit.genericLib.BaseTest;
import com.arbeit.genericLib.WebDriverCommonLib;

public class CreateselltktLkUp 
{
	@FindBy(xpath="//input[@name=\"property(Subject)\"]") private WebElement subjectTb;
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement acnameLkUp;
	@FindBy(xpath="//a[text()=\"QSpiders Bull Temple\"]") private WebElement qsplink;
	@FindBy(xpath="//img[@title=\"Product Name Lookup\"]") private WebElement pdctLkup;
	@FindBy(xpath="//a[text()=\"12\"]") private WebElement pdctlink;
	@FindBy(xpath="//input[@name='property(txtQty1)']") private WebElement qtytb;
	@FindBy(xpath="//img[@title=\"PriceBook Name Lookup\"]") private WebElement lpLkup;
	@FindBy(xpath="//a[text()='purchase']") private WebElement lplink;
	@FindBy(xpath="//input[@value=\"Save\"][1]") private WebElement saveBtn;
	
	public  CreateselltktLkUp()
	{
	PageFactory.initElements(BaseTest.driver, this);
}
	
	public void acnamelkuppopup() throws Throwable
	{
		subjectTb.click();
		subjectTb.sendKeys("abc");
		acnameLkUp.click();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		//wlib.windowtitles();
		
		Thread.sleep(2000);
		
		wlib.getallwindowhandleclick("Zoho CRM - Account Name Lookup", qsplink);
		//qsplink.click();
		pdctLkup.click();
		wlib.getallwindowhandleclick("Zoho CRM - Product Name Lookup",pdctlink);
		//pdctlink.click();
		qtytb.click();
		qtytb.sendKeys("100");
		lpLkup.click();
		wlib.getallwindowhandleclick("Zoho CRM - Price Book Name Lookup", lplink);
		lplink.click();
		saveBtn.click();
		
		
		
	}

}

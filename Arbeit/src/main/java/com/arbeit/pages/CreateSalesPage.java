package com.arbeit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.arbeit.genericLib.BaseTest;

public class CreateSalesPage 
{
	@FindBy(xpath="//input[@name=\"property(Subject)\"]") private WebElement subjectTb;
	@FindBy(xpath="//input[@name=\"property(Account Name)\"]") private WebElement accountnameTb;
	@FindBy(xpath="//input[@name=\"property(hdnProductName1)\"]") private WebElement productnameTb;
	@FindBy(xpath="//input[@name=\"property(txtQty1)\"]") private WebElement qtyTb;
	@FindBy(xpath="//input[@name=\"property(txtListPrice1)\"]") private WebElement listpriceTb;
	@FindBy(xpath="//input[@value=\"Save\"][1]") private WebElement saveBtn;
	public CreateSalesPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void createSalesorderwithMandatoryfields(String subject, String acname, String product, String qty, String lp)
	{
		subjectTb.sendKeys(subject);
		accountnameTb.sendKeys(acname);
		productnameTb.sendKeys(product);
		qtyTb.sendKeys(qty);
		listpriceTb.sendKeys(lp);
		saveBtn.click();
		
		
	}

}

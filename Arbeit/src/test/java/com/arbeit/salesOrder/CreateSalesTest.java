package com.arbeit.salesOrder;

import org.testng.annotations.Test;

import com.arbeit.genericLib.BaseTest;

import com.arbeit.genericLib.FileLib;
import com.arbeit.genericLib.WebDriverCommonLib;
import com.arbeit.pages.CreateSalesPage;
import com.arbeit.pages.CustomViewPage;
import com.arbeit.pages.HomePage;
import com.arbeit.pages.LoginPage;

public class CreateSalesTest extends BaseTest
{
	@Test
	public void createsales() throws Throwable
	{
	    	  
	    	  LoginPage lp= new LoginPage();
	    	  FileLib flib = new FileLib();
	    	  lp.loginToApp(flib.readpropertyData(PROP_PATH, "username"),flib.readpropertyData(PROP_PATH, "password"));
	    	  WebDriverCommonLib wlib = new WebDriverCommonLib();
	    	  wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "homeTitle"),"Home Page");
	    	  
	    	  HomePage hp= new HomePage();
	    	  hp.clickSalesorderTab();
	    	  
	    	  wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "customviewTitle"),"custom View Page");
	    	  
	    	  CustomViewPage cv = new CustomViewPage();
	    	  cv.clickNewsalesorderBtn();
	    	  
	    	  wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "createSalesorderTitle"),"Create SalesOrder Page");
	    	  CreateSalesPage cs = new CreateSalesPage();
	    	  cs.createSalesorderwithMandatoryfields(flib.readexcelData(EXCEL_PATH, "Sheet1", 0, 1),flib.readexcelData(EXCEL_PATH, "Sheet1", 1, 1),
	    			  flib.readexcelData(EXCEL_PATH, "Sheet1", 2, 1),flib.readexcelData(EXCEL_PATH, "Sheet1", 3, 1),
	    					  flib.readexcelData(EXCEL_PATH, "Sheet1", 4, 1));
	    	   
	    	  wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "salesorderdetailsTitle"),"Salesorder Details Page");
	    	  
	    	  //LogoutPage lo= new LogoutPage();
	    	  //lo.ClicklogoutBtn();
	    	  
	    	  //bt.closeBrowser();
	    					  
	}

}

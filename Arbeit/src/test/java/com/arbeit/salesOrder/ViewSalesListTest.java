package com.arbeit.salesOrder;

import org.testng.annotations.Test;

import com.arbeit.genericLib.BaseTest;
import com.arbeit.genericLib.FileLib;
import com.arbeit.genericLib.WebDriverCommonLib;
import com.arbeit.pages.HomePage;
import com.arbeit.pages.LoginPage;
import com.arbeit.pages.ViewSalesListpage;

public class ViewSalesListTest extends BaseTest
{
	
	@Test
	public void SalesTest() throws Throwable
	{
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		lp.loginToApp(flib.readpropertyData(PROP_PATH, "username"),flib.readpropertyData(PROP_PATH, "password"));
   	  WebDriverCommonLib wlib = new WebDriverCommonLib();
   	  wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "homeTitle"),"Home Page");
   	 HomePage hp= new HomePage();
	  hp.clickSalesorderTab();
	  
	  wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "customviewTitle"),"custom View Page");
	  
	  //CustomViewPage cv = new CustomViewPage();
	 // cv.clickNewsalesorderBtn();
	  
	  //wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "createSalesorderTitle"),"Create SalesOrder Page");
	  ViewSalesListpage vp=new ViewSalesListpage();
	  vp.clickviewbtn();
		
		
	}

}

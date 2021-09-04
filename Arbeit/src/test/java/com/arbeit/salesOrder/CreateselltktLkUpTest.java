package com.arbeit.salesOrder;

import org.testng.annotations.Test;


import com.arbeit.genericLib.BaseTest;
import com.arbeit.genericLib.FileLib;
import com.arbeit.genericLib.WebDriverCommonLib;
import com.arbeit.pages.CreateselltktLkUp;
import com.arbeit.pages.CustomViewPage;
import com.arbeit.pages.HomePage;
import com.arbeit.pages.LoginPage;

public class CreateselltktLkUpTest extends BaseTest
{
	@Test
	public void selltktLkUp() throws Throwable
	
	{
	
	  LoginPage lp= new LoginPage();
	  FileLib flib = new FileLib();
	  lp.loginToApp(flib.readpropertyData(PROP_PATH, "username"),flib.readpropertyData(PROP_PATH, "password"));
	  WebDriverCommonLib wlib = new WebDriverCommonLib();
	  wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "homeTitle"),"Home Page");
	  
	  HomePage hp= new HomePage();
	  hp.clickSalesorderTab();
	 Thread.sleep(2000);
	  
	  //wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "customviewTitle"),"custom View Page");
	  
	  CustomViewPage cv = new CustomViewPage();
	  cv.clickNewsalesorderBtn();
	  
	//wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "createSalesorderTitle"),"Create SalesOrder Page");
	  
	  CreateselltktLkUp clp = new CreateselltktLkUp();
	  clp.acnamelkuppopup();
	}
	

}

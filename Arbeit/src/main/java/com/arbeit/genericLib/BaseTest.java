package com.arbeit.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConsts 
{   
	//Divya
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable 
	{
		FileLib flib = new FileLib();
		String browsername = flib.readpropertyData(PROP_PATH,"browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver= new FirefoxDriver();
		}
		else
		{
			System.out.println("Enter valid Browsername");
		}
		driver.manage().window().maximize();
		String testurl=flib.readpropertyData(PROP_PATH, "url");
		driver.get(testurl);
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.verify(wlib.getpageTitle(),flib.readpropertyData(PROP_PATH, "logintitle"),"Login Page");
		
	
	}
//	@AfterClass
//	public void closeBrowser()
//	{
//		driver.quit();
//	}

}

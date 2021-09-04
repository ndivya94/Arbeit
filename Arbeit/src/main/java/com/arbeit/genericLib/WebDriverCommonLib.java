package com.arbeit.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverCommonLib 
{
	public String getpageTitle()
	{
		String pageTitle=BaseTest.driver.getTitle();
		return pageTitle;
	}
    public void verify(String actual, String expected, String page)
    {
    	if(actual.equals(expected))
    	{
    		System.out.println(page + "is displayed");
    	}
    	else
    	{
    		System.out.println(page + "is not displayed");
    	}
    }
    public void selectoption(WebElement element, int index)
    {
    	Select sel = new Select(element);
    	sel.selectByIndex(index);
    }
    public void selectoption(WebElement element, String value)
    {
    	Select sel = new Select(element);
    	sel.selectByValue(value);
    }
    public void selectoption(String text, WebElement element )
    {
    	Select sel = new Select(element);
    	sel.selectByVisibleText(text);
    }
    public void mouseHover(WebElement element)
    {
    	Actions ac = new Actions(BaseTest.driver);
    	ac.moveToElement(element).perform();
    }
    public void rightclick(WebElement element)
    {
    	Actions ac = new Actions(BaseTest.driver);
    	ac.contextClick(element).perform();
    }
    public void draganddropElement(WebElement source, WebElement target)
    {
    	Actions ac = new Actions(BaseTest.driver);
		ac.dragAndDrop(source, target ).perform();
    			
    }
    public void SwitchToFrame(int index)
    {
    	BaseTest.driver.switchTo().frame(index);
     }
    public void SwitchToFrame(String value)
    {
    	BaseTest.driver.switchTo().frame(value);
     }
    public void SwitchToFrame(WebElement element)
    {
    	BaseTest.driver.switchTo().frame(element);
     }
    public void getFullpageScreenshot(String screenshotpath)
    {
    	TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File dest = new File(screenshotpath);
     }
    public void getFullPageScreenshot(WebElement element, String screenshotPath) 
    {
    	File src = element.getScreenshotAs(OutputType.FILE);
    	File dest = new File(screenshotPath);
    	try
    	{
    		Files.copy(src,dest);
    	}
    	catch(IOException e)
    	{
    	   e.printStackTrace();
    	}
    }
    public void getelementScreenShot(WebElement element, String screenshotpath)
    {
    	File src = element.getScreenshotAs(OutputType.FILE);;
    	File dest = new File(screenshotpath);
    	try
    	{
    		Files.copy(src, dest);
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    public void waitForPageTitle(String title)
    {
    	WebDriverWait wait =  new WebDriverWait(BaseTest.driver,30);
        wait.until(ExpectedConditions.titleContains(title));
    	
    	}
    public void getallwindowhandleclick(String targetBrowserTitle, WebElement element)
    {
    	String mainwindow=BaseTest.driver.getWindowHandle();
    	Set<String> allwhs= BaseTest.driver.getWindowHandles();
    	for(String wh:allwhs)
    	{
    		String title=BaseTest.driver.switchTo().window(wh).getTitle();
    		if(title.equalsIgnoreCase(targetBrowserTitle))
    		{
    			element.click();
    		}
    		BaseTest.driver.switchTo().window(mainwindow);
    	}
    }
    public void getallwindowhandleClose(String targetBrowserTitle, WebElement element)
    {
    	Set<String> allwhs= BaseTest.driver.getWindowHandles();
    	for(String wh:allwhs)
    	{
    		String title=BaseTest.driver.switchTo().window(wh).getTitle();
    		if(title.equalsIgnoreCase(targetBrowserTitle))
    		{
    			BaseTest.driver.close();
    		}
    	}
    	}
    
    public void windowtitles() 
    {
    	Set<String> wind = BaseTest.driver.getWindowHandles();
    	for(String w:wind)
    	{
    		String title = BaseTest.driver.switchTo().window(w).getTitle();
    		System.out.println(title);
    	}
    }
    public void alert()
    {
    	Alert al=BaseTest.driver.switchTo().alert();
    	al.getText();
    	//al.accept();
    	//al.dismiss();
    	
    			
    }
    
    

}

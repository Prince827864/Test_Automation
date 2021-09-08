package com.sgsoft.testScripts;

/* Not only by Selenium but even using the "JavaScriptExecutor" also we can deal with Execution
	(by the help of webdrivers)*/           

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo_20 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		getTitleOfApplication();
		getURLOfApplication();
		getNumberOfLinksInApplication();
		setTextInUserName();
		setTextInUserName2();
		//	clickOnButton1();
		//	clickOnButton2();
		clickOnCheckBox1();
		clickOnCheckBox2();
		closeChrome();
	}

	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver_1.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("F:\\Testing,Java & SQL\\Selenium class\\Notes\\HTML files\\SampleXpath.html");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void getTitleOfApplication()
	{
		JavascriptExecutor js=	(JavascriptExecutor) oBrowser;
		String title=(String) js.executeScript("var kk=document.title;return kk;");
		System.out.println("Title of the Application :"+title);
	}

	static void getURLOfApplication()
	{
		JavascriptExecutor js=	(JavascriptExecutor) oBrowser;
		String url=(String) js.executeScript("var kk=document.URL;return kk;");
		System.out.println("URL of the Application :"+url);
	}

	static void getNumberOfLinksInApplication()
	{
		JavascriptExecutor js=	(JavascriptExecutor) oBrowser;
		long links= (long) js.executeScript("var kk=document.getElementsByTagName('A');return kk.length;");
		System.out.println("# of Links in the Application :"+links);
	}

	static void setTextInUserName()
	{
		JavascriptExecutor js=	(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('uid1user1name1').value='DemoUser123'");
	}

	static void setTextInUserName2()
	{
		WebElement oEle=oBrowser.findElement(By.id("pwd1pass1word1"));
		JavascriptExecutor js=	(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].value='Welcome123'",oEle);
	}

	static void clickOnButton1()		// This is Simple one
	{
		JavascriptExecutor js=	(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('btn1submit1button1').click();");
	}

	static void clickOnButton2()		// Using WebElement 
	{
		WebElement oEle=oBrowser.findElement(By.id("btn1submit1button1"));
		JavascriptExecutor js=	(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].click();",oEle);
	}

	static void clickOnCheckBox1()		// Windows Checkbox
	{
		JavascriptExecutor js=	(JavascriptExecutor) oBrowser;
		js.executeScript("document.getElementById('chk1windows').click();");
	}

	static void clickOnCheckBox2()		// Linux Checkbox
	{
		WebElement oEle=oBrowser.findElement(By.id("chk2linux"));
		JavascriptExecutor js=	(JavascriptExecutor) oBrowser;
		js.executeScript("arguments[0].click();",oEle);
	}

	static void closeChrome()
	{
		try 
		{
			Thread.sleep(2000);
			oBrowser.close();
		}catch(Exception e)
		{
			e.getMessage();
		}
	}

}

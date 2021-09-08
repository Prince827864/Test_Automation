package com.sgsoft.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserSample_4 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser(); navigate();
	}
	static void launchBrowser()
	{
		String path=null;
		{
			try
			{
				path=System.getProperty("user.dir");
				System.setProperty("webdriver.gecko.driver",path+"\\Library\\drivers\\geckodriver.exe");
				System.out.println(path);
				oBrowser=new FirefoxDriver();
			}catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://www.flipkart.com");
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
}
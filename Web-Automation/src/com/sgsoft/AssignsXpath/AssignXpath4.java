package com.sgsoft.AssignsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignXpath4 {
	public static WebDriver ChDrive=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
		logout();
		closeApp();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\\\DemoAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver_1.exe");
			ChDrive=new ChromeDriver();
			ChDrive.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			ChDrive.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			ChDrive.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//div[text()='Login ']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyoutWindow()
	{
		try
		{
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='gettingStartedShortcutsMenuCloseId']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='content tasks']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='addNewButton']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='item createNewCustomer ellipsis']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='customerLightBox_nameField']")).sendKeys("Customer1");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='customerLightBox_commitBtn']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	static void modifyCustomer()
	{
		try
		{
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='editButton available']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='Enter customer description...']")).sendKeys("This is Mine");
			Thread.sleep(1500);
			ChDrive.findElement(By.xpath("//div[@class='closeButton']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	static void deleteCustomer()
	{
		try
		{
			ChDrive.navigate().refresh();			
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//div[text()='ACTIONS']")).click(); //To click on Actions
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//div[text()='Delete']")).click();	//To click on Delete
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//span[text()='Delete permanently']")).click();	//To click on Delete permanently
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.getMessage();
		}
	}

	static void logout()
	{
		try
		{
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='logoutLink']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	static void closeApp()
	{
		try
		{
			Thread.sleep(1000);
			ChDrive.close();
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
}

package com.sgsoft.AssignsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignXpath5 {
	public static WebDriver ChDrive=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createCustomer();
		createProject();
		deleteProject();
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
			Thread.sleep(2000);
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

		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	static void createProject()
	{
		try
		{
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='addNewButton']")).click();
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='item createNewProject ellipsis']")).click();
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='projectPopup_projectNameField']")).sendKeys("Project1");
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='projectPopup_commitBtn']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	static void deleteProject()
	{
		try
		{
			ChDrive.findElement(By.xpath("//div[@class='node projectNode selected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='action']")).click();	
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='deleteButton']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//span[@id='projectPanel_deleteConfirm_submitTitle']")).click();
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
			ChDrive.findElement(By.xpath("//div[@class='node customerNode notSelected']//div[@class='editButton available']")).click();
			Thread.sleep(2000);				
			ChDrive.findElement(By.xpath("//div[@class='edit_customer_sliding_panel sliding_panel']//div[@class='img']/following-sibling::div[@class='action']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//div[@class='dropdownContainer actionsMenu']//div//div[@class='deleteButton'][@style='display: inline-block;']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//div[@*='customerPanel_deleteConfirm_submitBtn']")).click();	//To click on Delete permanently
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
			ChDrive.close();
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
}

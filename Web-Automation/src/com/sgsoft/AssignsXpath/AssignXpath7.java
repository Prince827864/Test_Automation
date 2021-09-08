package com.sgsoft.AssignsXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AssignXpath7 {
	public static WebDriver ChDrive=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
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
	static void createProject()
	{
		try
		{
			ChDrive.findElement(By.xpath("//*[@*='addNewButton']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='item createNewProject ellipsis']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='projectNameField inputFieldWithPlaceholder']")).sendKeys("Project1");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='projectPopup_commitBtn']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	static void createTask()
	{
		try
		{
			ChDrive.findElement(By.xpath("//div[@class='addNewTaskButtonContainer']//div[@class='addNewButton']")).click();
			Thread.sleep(1000);

			ChDrive.findElement(By.xpath("//div[@class='dropdownContainer addNewTaskMenu']//div[@class='item createNewTask ellipsis']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//td[@class='nameCell first']//input[@placeholder='Enter task name']")).sendKeys("Task1");
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='createTasksPopup_commitBtn']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteTask()
	{
		try
		{
			ChDrive.findElement(By.xpath("//table[@class='createdTasksRowsTable']//div[@class='title ellipsis']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div//div[@class='actionButton']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//div[@class='edit_task_sliding_panel sliding_panel']//div[@class='deleteButton']//div[@class='title']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//div[@id='taskPanel_deleteConfirm_submitBtn']//div[@class='buttonIcon']//span[@id='taskPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
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
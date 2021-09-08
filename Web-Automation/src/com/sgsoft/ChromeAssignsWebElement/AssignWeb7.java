package com.sgsoft.ChromeAssignsWebElement;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignWeb7 {
	public static WebDriver driver=null;
	public static ActitimePageObjectModel AtPom=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTasks();
		deleteProject();
		deleteCustomer();
		logout();
		closeBrowser();
	}
	static void launchBrowser()
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver_1.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			AtPom=new ActitimePageObjectModel(driver);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			driver.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			AtPom.getUserName().sendKeys("admin");
			AtPom.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			AtPom.clickLoginButton().click();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void flyOutWindow()
	{
		try
		{
			AtPom.closeFlyOutWindow().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createCustomer()
	{
		try
		{
			AtPom.clickOnTasks().click();
			Thread.sleep(2000);
			AtPom.clickOnAddNew().click();
			Thread.sleep(2000);
			AtPom.createNewCustomer().click();
			Thread.sleep(2000);
			AtPom.EnterCustomerNameTextField().sendKeys("demoCustomer");
			Thread.sleep(2000);
			AtPom.createCustomerButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			AtPom.clickOnAddNew().click();
			Thread.sleep(2000);
			AtPom.createNewProject().click();
			Thread.sleep(2000);
			AtPom.enterProjectNameTextField().sendKeys("demoProject");
			Thread.sleep(2000);
			AtPom.createProjectButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createTask()
	{
		try
		{
			AtPom.clickOnAddNewTasks().click();
			Thread.sleep(2000);
			AtPom.clickOnCreateNewTasks().click();
			Thread.sleep(2000);
			AtPom.enterTask1TextField().sendKeys("Task-1");
			Thread.sleep(2000);
			AtPom.enterTask2TextField().sendKeys("Task-2");
			Thread.sleep(2000);
			AtPom.enterTask3TextField().sendKeys("Task-3");
			Thread.sleep(2000);
			AtPom.enterTask4TextField().sendKeys("Task-4");
			Thread.sleep(2000);
			AtPom.enterTask5TextField().sendKeys("Task-5");
			Thread.sleep(2000);
			AtPom.createTasksButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteTasks()
	{
		try
		{
			AtPom.Task1Checkbox().click();
			Thread.sleep(2000);
			AtPom.Task2Checkbox().click();
			Thread.sleep(2000);
			AtPom.Task4Checkbox().click();
			Thread.sleep(2000);
			AtPom.DeleteTask().click();
			Thread.sleep(2000);
			AtPom.deleteTaskPermanently().click();
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteProject()
	{
		try
		{
			AtPom.projectSettings().click();
			Thread.sleep(2000);
			AtPom.clickOnActionsProject().click();
			Thread.sleep(2000);
			AtPom.DeleteProject().click();
			Thread.sleep(2000);
			AtPom.deleteProjectPermanently().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try
		{
			AtPom.CustomerSettings().click();
			Thread.sleep(2000);
			AtPom.clickOnActionsCustomer().click();
			Thread.sleep(2000);
			AtPom.deleteCustomer().click();
			Thread.sleep(2000);
			AtPom.deleteCustomerPermanently().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			AtPom.clickLogout().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeBrowser()
	{
		try
		{
			driver.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

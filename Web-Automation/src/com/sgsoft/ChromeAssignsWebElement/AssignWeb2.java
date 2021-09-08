package com.sgsoft.ChromeAssignsWebElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignWeb2 {
	public static WebDriver driver=null;
	public static ActitimePageObjectModel AtPom=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
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
	
	
	static void createUser()
	{
		try
		{
			AtPom.clickOnUser().click();
			Thread.sleep(2000);
			AtPom.clickOnAddUser().click();
			Thread.sleep(2000);
			AtPom.firstnameTextField().sendKeys("User1");
			AtPom.lastnameTextField().sendKeys("Demo");
			AtPom.emailTextField().sendKeys("user1@gmail.com");
			AtPom.usernameTextField().sendKeys("User1");
			AtPom.passwordTextField().sendKeys("welcome1");
			AtPom.passwordCopyTextField().sendKeys("welcome1");
			Thread.sleep(2000);
			AtPom.clickOnCreateUser().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			AtPom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			AtPom.firstnameTextField().sendKeys("New");
			AtPom.lastnameTextField().sendKeys("New");
			AtPom.emailTextField().clear();
			AtPom.emailTextField().sendKeys("user1new@gmail.com");
			AtPom.usernameTextField().sendKeys("New");
			AtPom.passwordTextField().sendKeys("new");
			AtPom.passwordCopyTextField().sendKeys("new");
			Thread.sleep(2000);
			AtPom.clickOnSaveChanges().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			AtPom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			AtPom.clickOnDeleteUser().click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			al.accept();
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

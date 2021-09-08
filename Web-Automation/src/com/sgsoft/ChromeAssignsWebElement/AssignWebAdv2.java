package com.sgsoft.ChromeAssignsWebElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignWebAdv2 {
	public static WebDriver driver=null;
	public static ActitimePageObjectModel AtPom=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		
		loginAsAdmin();
		minimizeFlyOutWindow();
		createUser1();
		logoutAsAdmin();
		
		loginAsUser1();
		createUser2();
		logoutAsUser1();
		
		loginAsUser2();
		createUser3();
		logoutAsUser2();
		
		loginAsAdmin();
		modifyUser1();
		logoutAsAdmin();
		
		loginAsUpdatedUser1();
		modifyUser2();
		logoutAsUser1();
		
		loginAsUpdatedUser2();
		modifyUser3();
		logoutAsUser2();
		
		loginAsUpdatedUser2();
		deleteUser3();
		logoutAsUser2();
		
		loginAsUpdatedUser1();
		deleteUser2();
		logoutAsUser1();
		
		loginAsAdmin();
		deleteUser1();
		logoutAsAdmin();
		
		closeApplication();
		
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
			Thread.sleep(2000);	//To make the delay of 3 Seconds
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsAdmin()
	{
		try
		{
			AtPom.getUserName().sendKeys("admin");
			AtPom.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			AtPom.clickLoginButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyOutWindow()
	{
		try
		{
			AtPom.closeFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser1()
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
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAsAdmin()
	{
		try
		{
			AtPom.clickLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser1()
	{
		try
		{
			AtPom.getUserName().sendKeys("User1");
			AtPom.getPassword().sendKeys("welcome1");
			Thread.sleep(2000);
			AtPom.clickLoginButton().click();
			Thread.sleep(2000);
			AtPom.startExploringActiTime().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try
		{
			AtPom.clickOnUser().click();
			Thread.sleep(2000);
			AtPom.clickOnAddUser().click();
			Thread.sleep(2000);
			AtPom.firstnameTextField().sendKeys("User2");
			AtPom.lastnameTextField().sendKeys("Demo");
			AtPom.emailTextField().sendKeys("user2@gmail.com");
			AtPom.usernameTextField().sendKeys("User2");
			AtPom.passwordTextField().sendKeys("welcome2");
			AtPom.passwordCopyTextField().sendKeys("welcome2");
			Thread.sleep(2000);
			AtPom.clickOnCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAsUser1()
	{
		try
		{
			AtPom.clickLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUser2()
	{
		try
		{
			AtPom.getUserName().sendKeys("User2");
			AtPom.getPassword().sendKeys("welcome2");
			Thread.sleep(2000);
			AtPom.clickLoginButton().click();
			Thread.sleep(2000);
			AtPom.startExploringActiTime().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createUser3()
	{
		try
		{
			AtPom.clickOnUser().click();
			Thread.sleep(2000);
			AtPom.clickOnAddUser().click();
			Thread.sleep(2000);
			AtPom.firstnameTextField().sendKeys("User3");
			AtPom.lastnameTextField().sendKeys("Demo");
			AtPom.emailTextField().sendKeys("user3@gmail.com");
			AtPom.usernameTextField().sendKeys("User3");
			AtPom.passwordTextField().sendKeys("welcome3");
			AtPom.passwordCopyTextField().sendKeys("welcome3");
			Thread.sleep(2000);
			AtPom.clickOnCreateUser().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutAsUser2()
	{
		try
		{
			AtPom.clickLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser1()
	{
		try
		{
			AtPom.clickOnUser().click();
			Thread.sleep(2000);
			AtPom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			AtPom.firstnameTextField().sendKeys("New");
			AtPom.lastnameTextField().sendKeys("New");
			AtPom.emailTextField().clear();
			AtPom.emailTextField().sendKeys("user1new@gmail.com");
			AtPom.passwordTextField().sendKeys("welcome1new");
			AtPom.passwordCopyTextField().sendKeys("welcome1new");
			Thread.sleep(2000);
			AtPom.clickOnSaveChanges().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUpdatedUser1()
	{
		try
		{
			AtPom.getUserName().sendKeys("User1");
			AtPom.getPassword().sendKeys("welcome1new");
			Thread.sleep(2000);
			AtPom.clickLoginButton().click();
			Thread.sleep(2000);
			AtPom.startExploringActiTime().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser2()
	{
		try
		{
			AtPom.clickOnUser().click();
			Thread.sleep(2000);
			AtPom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			AtPom.firstnameTextField().sendKeys("New");
			AtPom.lastnameTextField().sendKeys("New");
			AtPom.emailTextField().clear();
			AtPom.emailTextField().sendKeys("user2new@gmail.com");
			AtPom.passwordTextField().sendKeys("welcome2new");
			AtPom.passwordCopyTextField().sendKeys("welcome2new");
			Thread.sleep(2000);
			AtPom.clickOnSaveChanges().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginAsUpdatedUser2()
	{
		try
		{
			AtPom.getUserName().sendKeys("User2");
			AtPom.getPassword().sendKeys("welcome2new");
			Thread.sleep(2000);
			AtPom.clickLoginButton().click();
			Thread.sleep(2000);
			AtPom.startExploringActiTime().click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser3()
	{
		try
		{
			AtPom.clickOnUser().click();
			Thread.sleep(2000);
			AtPom.clickOnCreatedUser().click();
			Thread.sleep(2000);
			AtPom.firstnameTextField().sendKeys("New");
			AtPom.lastnameTextField().sendKeys("New");
			AtPom.emailTextField().clear();
			AtPom.emailTextField().sendKeys("user3new@gmail.com");
			AtPom.passwordTextField().sendKeys("welcome3new");
			AtPom.passwordCopyTextField().sendKeys("welcome3new");
			Thread.sleep(2000);
			AtPom.clickOnSaveChanges().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser3()
	{
		try
		{
			AtPom.clickOnUser().click();
			Thread.sleep(2000);
			AtPom.clickOnCreatedUser3().click();;
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
	static void deleteUser2()
	{
		try
		{
			AtPom.clickOnUser().click();
			Thread.sleep(2000);
			AtPom.clickOnCreatedUser2().click();;
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
	static void deleteUser1()
	{
		try
		{
			AtPom.clickOnUser().click();
			Thread.sleep(2000);
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
	static void closeApplication()
	{
		try
		{
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

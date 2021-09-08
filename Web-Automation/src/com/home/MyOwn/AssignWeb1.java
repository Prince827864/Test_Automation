package com.home.MyOwn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignWeb1 {
	public static WebDriver drive=null;
	public static ConditionsDemo page=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		createUser();
		deleteUser();
		logout(); 
		closeApplication();

	}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\DemoAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver_1.exe");
			drive=new ChromeDriver();
			drive.manage().window().maximize();
			page=new ConditionsDemo(drive);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			drive.get("http://localhost:81/login.do");
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
			page.getUserName().sendKeys("admin");
			page.getPassword().sendKeys("manager");
			page.getLoginButton().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void flyOutWindow()
	{
		try
		{
			page.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try
		{
			page.getUser().click();
			Thread.sleep(2000);
			page.getAddUser().click();
			Thread.sleep(2000);
			page.getFName().sendKeys("user1");
			page.getLName().sendKeys("demo1");
			page.getEmail().sendKeys("x@gmail.com");
			Thread.sleep(2000);
			page.getuUserName().sendKeys("User1");
			page.getuPwd().sendKeys("welcome1");
			page.getuPwdCopy().sendKeys("welcome1");
			Thread.sleep(2000);
			page.getCtUser().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}

	static void deleteUser()
	{
		try
		{
			page.getSelectUser().click();
			Thread.sleep(2500);
			page.getDelBtn().click();	Thread.sleep(2500);
			Alert oAlert = drive.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2500);
		}catch (Exception e)
		{
			e.getStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			page.getLogoutLink().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()
	{
		try
		{
			drive.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

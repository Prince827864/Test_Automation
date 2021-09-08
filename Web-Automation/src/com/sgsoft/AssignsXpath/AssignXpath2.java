package com.sgsoft.AssignsXpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignXpath2 {
	public static WebDriver ChDrive=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createUser();
		modifyUser();
		deleteUser();
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
			ChDrive.findElement(By.xpath("//*[@*='content users']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='addUserButton beigeButton useNativeActive']")).click();
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='firstNameField inputFieldWithPlaceholder']")).sendKeys("user1");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='userDataLightBox_lastNameField']")).sendKeys("demo1");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='userDataLightBox_emailField']")).sendKeys("Xyz@gmail.com");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='usernameField inputFieldWithPlaceholder']")).sendKeys("Username1");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='userDataLightBox_passwordField']")).sendKeys("Hello1");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='userDataLightBox_passwordCopyField']")).sendKeys("Hello1");
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			ChDrive.findElement(By.xpath("//*[@*='userNameCell first']")).click();
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='userDataLightBox_usernameField']")).sendKeys("UserName2");
			Thread.sleep(2000);
			ChDrive.findElement(By.xpath("//*[@*='userDataLightBox_commitBtn']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
	static void deleteUser()
	{
		try
		{
			ChDrive.findElement(By.xpath("//*[@*='userNameCell first']")).click();
			Thread.sleep(1000);
			ChDrive.findElement(By.xpath("//*[@*='userDataLightBox_deleteBtn']")).click();
			Alert al= ChDrive.switchTo().alert();
			String content = al.getText();
			System.out.println(content);
			al.accept();
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
			ChDrive.close();
		}catch(Exception e)
		{
			e.getMessage();
		}
	}
}

package com.sgsoft.ChromeAssignsfindElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {
	public static WebDriver drive=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser();
		deleteUser();
		logout();
		closeApplication();

	}

	static void launchBrowser() 
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",
					"F:\\\\DemoAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver_1.exe");
			drive = new ChromeDriver();
			drive.manage().window().maximize();
		} catch (Exception e)
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
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void login() 
	{
		try 
		{
			drive.findElement(By.id("username")).sendKeys("admin");
			// Explaining the Line mentioned above

			/*
			 * By by=By.name("username"); WebElement oEle=oBrowser.findElement(by);
			 * oEle.sendKeys("admin");
			 */

			drive.findElement(By.name("pwd")).sendKeys("manager");
			drive.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try 
		{
			drive.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void createUser() 
	{
		try
		{
			drive.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			drive.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			drive.findElement(By.name("firstName")).sendKeys("demo");
			drive.findElement(By.name("lastName")).sendKeys("User2");
			drive.findElement(By.name("email")).sendKeys("demo@gmail.com");
			drive.findElement(By.name("username")).sendKeys("demoUser2");
			drive.findElement(By.name("password")).sendKeys("Welcome1");
			drive.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			drive.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(5000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void deleteUser() 
	{
		try 
		{
			drive.findElement(By.xpath(
					"//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
			.click();
			Thread.sleep(3000);
			drive.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = drive.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication() 
	{
		try {
			drive.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}

package com.sgsoft.ChromeAssignsfindElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
	public static WebDriver chrome=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
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
			chrome=new ChromeDriver();
			chrome.manage().window().maximize();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	static void navigate()
	{
		try 
		{
			chrome.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	static void login()
	{
		try
		{
			chrome.findElement(By.id("username")).sendKeys("admin");
			chrome.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			chrome.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	static void createUser()
	{
		try
		{
			chrome.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(1000);
			chrome.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(1000);
			chrome.findElement(By.name("firstName")).sendKeys("user1");
			chrome.findElement(By.name("lastName")).sendKeys("demo1");
			chrome.findElement(By.name("email")).sendKeys("xyz@gmail.com");
			chrome.findElement(By.name("username")).sendKeys("demoUser1");
			chrome.findElement(By.name("password")).sendKeys("Welcome1");
			chrome.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			chrome.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	static void modifyUser()
	{
		try
		{
			chrome.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table")).click();
			Thread.sleep(2500);
			chrome.findElement(By.name("password")).sendKeys("Welcome3");
			Thread.sleep(2500);
			chrome.findElement(By.name("passwordCopy")).sendKeys("Welcome3");
			Thread.sleep(2500);
			chrome.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2500);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			chrome.findElement(By.xpath(
					"//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
			.click();
			Thread.sleep(3000);
			chrome.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al= chrome.switchTo().alert();
			String content = al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			Thread.sleep(2500);
			chrome.findElement(By.id("logoutLink")).click();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}

	static void closeApp()
	{
		try 
		{	
			Thread.sleep(1000);
			chrome.close();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}

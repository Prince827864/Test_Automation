package com.sgsoft.TestNGAssigns;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TempDemos {

	public static WebDriver driver = null;

	@Test(priority=1)
	public void launchBrowser() 
	{
		String path=null;
		try
		{
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver_1.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	@Test(priority=2)
	public void navigate() {
		try {
			driver.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=3)
	public void loginAsAdmin() {
		try {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=4)
	public void minimizeFlyOutWindow() {
		try {
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=5)
	public void createUser1() {
		try {
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);

			driver.findElement(By.name("firstName")).sendKeys("User1");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			driver.findElement(By.name("email")).sendKeys("user1@gmail.com");
			driver.findElement(By.name("username")).sendKeys("User1");
			driver.findElement(By.name("password")).sendKeys("welcome1");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=6)
	public void createUser2() {
		try {
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);

			driver.findElement(By.name("firstName")).sendKeys("User2");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			driver.findElement(By.name("email")).sendKeys("user2@gmail.com");
			driver.findElement(By.name("username")).sendKeys("User2");
			driver.findElement(By.name("password")).sendKeys("welcome2");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=7)
	public void createUser3() {
		try {
			driver.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);

			driver.findElement(By.name("firstName")).sendKeys("User3");
			driver.findElement(By.name("lastName")).sendKeys("Demo");
			driver.findElement(By.name("email")).sendKeys("user3@gmail.com");
			driver.findElement(By.name("username")).sendKeys("User3");
			driver.findElement(By.name("password")).sendKeys("welcome3");
			driver.findElement(By.name("passwordCopy")).sendKeys("welcome3");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=8)
	public void logoutAsAdmin() {
		try {
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=9)
	public void loginAsUser1() {
		try {
			driver.findElement(By.id("username")).sendKeys("User1");
			driver.findElement(By.name("pwd")).sendKeys("welcome1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=10)
	public void logoutAsUser1()
	{
		try
		{
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=11)
	public void loginAsUser2()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User2");
			driver.findElement(By.name("pwd")).sendKeys("welcome2");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=12)
	public void logoutAsUser2()
	{
		try
		{
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=13)
	public void loginAsUser3()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("User3");
			driver.findElement(By.name("pwd")).sendKeys("welcome3");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div")).click();
			Thread.sleep(4000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=14)
	public void logoutAsUser3()
	{
		try
		{
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test (dependsOnMethods="loginAsAdmin")		//Trying still
	
	public void deleteUser1() {
		try 
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			String content = al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=16)
	public void deleteUser2() {
		try {
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			String content = al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=17)
	public void deleteUser3() {
		try {
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			String content = al.getText();
			System.out.println(content);
			al.accept();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority=18)
	public void closeApplication() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

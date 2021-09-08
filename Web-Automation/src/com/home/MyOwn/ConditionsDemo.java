package com.home.MyOwn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConditionsDemo {

	public ConditionsDemo(WebDriver drive)
	{
		PageFactory.initElements(drive, this);
	}

	//Create WebElement for UserName text field
	private WebElement username;

	public WebElement getUserName()
	{
		return username;
	}

	//Create WebElement for Password Text Field
	private WebElement pwd;

	public WebElement getPassword()
	{
		return pwd;
	}

	//Create WebElement for Login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oBtnLogin;

	public WebElement getLoginButton()
	{
		return oBtnLogin;
	}

	//Create WebElement for FlyOutWindow 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}

	//Create WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLnkLogout;
	public WebElement getLogoutLink()
	{
		return oLnkLogout;
	}
	
	//Create WebElement for Get User
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement oUser;
	public WebElement getUser()
	{
		return oUser;
	}
	//Create WebElement for Add User
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement oAddUser;
	public WebElement getAddUser()
	{
		return oAddUser;
	}

	//Create WebElement for Create User
	private WebElement userDataLightBox_firstNameField;
	public WebElement getFName()
	{
		return userDataLightBox_firstNameField;
	}
	
	private WebElement userDataLightBox_lastNameField;
	public WebElement getLName()
	{
		return userDataLightBox_lastNameField;
	}
	
	private WebElement userDataLightBox_emailField;
	public WebElement getEmail()
	{
		return userDataLightBox_emailField;
	}

	private WebElement userDataLightBox_usernameField;
	public WebElement getuUserName()
	{
		return userDataLightBox_usernameField;
	}
	
	private WebElement userDataLightBox_passwordField;
	public WebElement getuPwd()
	{
		return userDataLightBox_passwordField;
	}
	
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getuPwdCopy()
	{
		return userDataLightBox_passwordCopyField;
	}
	
	private WebElement userDataLightBox_commitBtn;
	public WebElement getCtUser()
	{
		return userDataLightBox_commitBtn;
	}
	
	//Create WebElement for Delete User
	@FindBy (xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table")
	private WebElement selectUser;
	public WebElement getSelectUser()
	{
		return selectUser;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDelBtn()
	{
		return userDataLightBox_deleteBtn;
	}
	
	//Create WebElement for Modify User
}

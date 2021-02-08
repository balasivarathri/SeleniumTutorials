package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Login scenario
	//Page Factory or ObjectRepositary:
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement loginButton;
	
	//Forgot password on Login page
	
	//@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	//WebElement forgotPassBtn;
	
	//@FindBy(xpath="//a[contains(text(),'Sign Up')]")
		//WebElement signUpBtn;
	
	
	//Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions:
	
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	} 
	
	public HomePage verifyValidLogin(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		return new HomePage();
	}
}

package com.ReusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	
	
	WebDriver driver;
	
	public void testCaseSignUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		enterUrl("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		//click on Sign in button
		click(By.xpath("//*[contains(@class,'login')]"));
		
		//enter text in the text box
		enterText(By.id("email_create"),"testbala@mailinator.com");
		
		//click on Create Account button
		click(By.id("SubmitCreate"));
		
		Thread.sleep(4000);
		
		//Select Radio button
		click(By.id("id_gender1"));
		
		//enter First Name and Last Name in text boxes
		enterText(By.id("customer_firstname"), "Madhavi");
		enterText(By.id("customer_lastname"), "Sivarathri");
		enterText(By.id("passwd"), "Test@123");
		enterText(By.id("company"), "TCS");
		enterText(By.id("address1"), "3-60/A,Madharam,Singareni,Khammam");
		enterText(By.id("city"), "texas");
		enterText(By.id("postcode"), "73301");
		enterText(By.id("phone_mobile"), "9959855206");
		
		
		//Select Dropdown values
		dropDown(By.id("days"), "15");
		dropDown(By.id("months"), "4");
		dropDown(By.id("years"), "1988");
		dropDown(By.id("id_state"), "30");
		
		//Select Check Boxes
		click(By.id("newsletter"));
		click(By.id("optin"));
		click(By.id("submitAccount"));
	}

	
	public void enterUrl(String KUrl) {
		driver.get(KUrl);
	}
	
	public void click( By prop) {
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop, String testdata) {
		driver.findElement(prop).sendKeys(testdata);
	}
	
	public void dropDown(By prop, String value) {
		new Select (driver.findElement(prop)).selectByValue(value);
	}
	
	public static void main(String[] args) throws InterruptedException {
		Signup method = new Signup();
		method.testCaseSignUp();
		
	}

}

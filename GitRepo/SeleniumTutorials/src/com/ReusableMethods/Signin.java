package com.ReusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signin {
	
	WebDriver driver;
	
	public void testCaseSignIn() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();		
		enterUrl("http://automationpractice.com/index.php");	
		driver.manage().window().maximize();
		click(By.xpath("//*[contains (@class,'login')]"));
		enterText(By.id("email"), "testbala@mailinator.com");
		enterText(By.id("passwd"), "Test@123");
		click(By.id("SubmitLogin"));
		//mouse Over Functions
		Actions move = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(null));
		move.moveToElement(element).build().perform();
		mouseOver(By.xpath("//a[contains(@title,'Women')]"));
		
	}
	public void enterUrl(String Url) {
		driver.get(Url);
	}
	
	public void click(By prop) {
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop ,String testdata) {
		driver.findElement(prop).sendKeys(testdata);
	}
	
	public void mouseOver(By prop) {
		driver.findElement(prop).click();
	}
	public static void main(String[] args) {
		Signin signin = new Signin();
		signin.testCaseSignIn();
	}

}

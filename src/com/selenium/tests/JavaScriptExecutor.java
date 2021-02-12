package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	WebDriver driver;
	public static void main(String[] args) {


		// To Initialize browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				// To maximize the window
				driver.manage().window().maximize();
				// To delete all cookies
				driver.manage().deleteAllCookies();
				// To wait the page to load
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com");
				driver.findElement(By.id("email")).sendKeys("balasivarathri@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("9959855206");
				WebElement lgnbtn= driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
				
				flash(lgnbtn, driver);
				
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolour = element.getCssValue("backgroundColor");
		for(int i=0; i<10;i++) {
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolour,element,driver);
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
			
		}
	}
}

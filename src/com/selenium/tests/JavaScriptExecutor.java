package com.selenium.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	WebDriver driver;

	public static void main(String[] args) throws IOException {

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
		driver.findElement(By.id("pass")).sendKeys("995985526");

		// execute Script ---- to execute java script code
		WebElement lgnbtn = driver.findElement(By.xpath("//button[contains(text(),'Log In')]"));
		// To highlight the element
		//flash(lgnbtn, driver);

		// To highlight the border with red color
		//drawBorder(lgnbtn, driver);

		// To Capture Screenshot and store as a file format
		//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// To Store in desired location using copy file method
		//FileUtils.copyFile(src, new File("C:\\Users\\User\\Desktop\\Screenshots\\FB.jpg"));
		
		//To click on element by using JavaScriptExecutor
		clickElement(lgnbtn, driver);
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolour = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);
			changeColor(bgcolour, element, driver);
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='9px solid red'", element);
	}
	public static void clickElement(WebElement element ,WebDriver driver) {		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()", driver);
		
	}
}

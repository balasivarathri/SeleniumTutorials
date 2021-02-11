package com.selenium.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapureScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

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
		//To Capture Screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//To Store in desired location using copy file method
		FileUtils.copyFile(src, new File("C:\\Users\\User\\Desktop\\Screenshots\\ScreenShot1.jpg"));

	}

}

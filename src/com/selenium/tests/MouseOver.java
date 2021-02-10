package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("You 1st")).click();
		driver.quit();
	}

}

package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPractice2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.name("username")).sendKeys("balakrishna431");
		driver.findElement(By.name("password")).sendKeys("9989*Bala");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		//driver.findElement(By.xpath(""));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
		
		
		//driver.navigate().to("https://demoqa.com/menu");
		//Thread.sleep(9000);
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'Main Item 2')]"))).build().perform();
		 * action.moveToElement(driver.findElement(By.
		 * xpath("//a[contains(text(),'SUB SUB LIST »')]"))).build().perform();
		 * driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 2')]")).click(
		 * );
		 */
	}

}

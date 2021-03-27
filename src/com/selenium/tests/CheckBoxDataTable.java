package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CheckBoxDataTable {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		driver.navigate().to("https://ui.cogmento.com");
		//Thread.sleep(9000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("balukrishna5588@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9989*Bala");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='main-nav']"))).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		action.moveToElement(driver.findElement(By.xpath("//td[contains(text(),'Lead')]"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'bala krishna sivarathri')]/parent::td//preceding-sibling::td//input[@name='id']")).click();
		
		}

}

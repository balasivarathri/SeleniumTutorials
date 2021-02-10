package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//*[contains(text(),'Droppable')]")).click();
		Thread.sleep(3000);
		//Switch to frame
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//for drag and drop
		
		  Actions action = new Actions(driver);
		  
		  action.clickAndHold(driver.findElement(By.xpath("//*[@id = 'draggable']")))
		  .moveToElement(driver.findElement(By.xpath("//*[@id = 'droppable']")))	  
		  .release().build().perform();
		 
		
	}

}

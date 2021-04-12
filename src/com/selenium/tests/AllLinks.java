package com.selenium.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/r.php");
		
		Select dropDown = new Select(driver.findElement(By.id("day")));
		List<WebElement> list = dropDown.getOptions();
		System.out.println(list.size());
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i).getText());
		 }

	}

}

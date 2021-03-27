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
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php");

		/*
		 * List<WebElement> links = driver.findElements(By.cssSelector("a"));
		 * System.out.println(links.size());
		 * 
		 * for(WebElement link: links) { System.out.println(link.getText());
		 * System.out.println(link.getAttribute("id")); }
		 */
		Select dropDown = new Select(driver.findElement(By.id("year")));
		List<WebElement> dd = dropDown.getOptions();
		System.out.println(dd.size());

		for (int i = 0; i < dd.size(); i++) {
			System.out.println(dd.get(i).getText());
		}

	}

}

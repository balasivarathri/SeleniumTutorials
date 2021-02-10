package com.selenium.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		// To find out total links on the page		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//To get the name of each link
		for(int i =0;i<links.size();i++) {
			String linktext=links.get(i).getText();
			System.out.println(linktext);
		}
	}

}

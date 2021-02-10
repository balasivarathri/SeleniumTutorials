package com.selenium.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		//To Initialize browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To maximize the window
		driver.manage().window().maximize();
		//To delete all cookies
		driver.manage().deleteAllCookies();
		//To wait the page to load
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.fnb.co.za/");
		//To get url of the page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//To get the page title
		String title = driver.getTitle();
		System.out.println(title);
		//Validation
		if (title.equalsIgnoreCase("Facebook – log in or sign up")) {
			System.out.println("Test case pass");
		}
		else 
		{
			System.out.println("Test Case Fail");
						
		}
		// To get the titles of all links
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
	
		for (int i=0;i<links.size();i++) {
			
			System.out.println(links.get(i).getText());
			
		}
		driver.close();
	}	
	
}

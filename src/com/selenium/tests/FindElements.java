package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		//To Initialize browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To maximize the window
		driver.manage().window().maximize();
		//To delete all coockies
		driver.manage().deleteAllCookies();
		//To wait the page to load
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		//To get url of the page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//To get the page title
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equalsIgnoreCase("Facebook – log in or sign up")) {
			System.out.println("Test case pass");
		}else 
		{
			System.out.println("Test Case Fail");
		}
	}	

}

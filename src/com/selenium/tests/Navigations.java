package com.selenium.tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

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

		driver.get("https://www.google.com");
		// To navigate to other site
		driver.navigate().to("https://www.fnb.co.za");
		// To Navigate forward
		driver.navigate().forward();		
		// To Navigate back
		driver.navigate().back();
		//To Refresh the page
		driver.navigate().refresh();		
		// To quit the browser 
		//driver.quit();

	}

}

package com.ReusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static void initializeDriver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\geckodriver.exe");
			driver = new ChromeDriver();
		}
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
	}

}

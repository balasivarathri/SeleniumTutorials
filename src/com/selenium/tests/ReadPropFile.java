package com.selenium.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fs = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\src\\com\\selenium\\tests\\config.properties");
		
		prop.load(fs);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url); 
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		}
		else if(browser.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\geckodriver.exe");
		 driver = new FirefoxDriver();
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys("Bala Krishna");
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys("Sivarathri");
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys("balasivarathri@gmail.com");
		driver.findElement(By.xpath(prop.getProperty("checkbox_xpath"))).click();
		
		
	}

}

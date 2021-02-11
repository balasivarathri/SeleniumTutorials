package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertPopups {

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
				driver.get("https://www.fnb.co.za/");
				driver.findElement(By.xpath("//input[@id='OBSubmit']")).click();
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				//alert.accept();
				Thread.sleep(2000);
				alert.dismiss();
				driver.quit();
		
	}

}

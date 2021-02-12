package com.selenium.tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserPopups {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\SeleniumTutorials\\Browser_LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		//Thread.sleep(7000);
		driver.findElement(By.xpath("//button[contains(text(),'New Window')]")).click();
		//To get the parent and child window ids
		Set <String> handler= driver.getWindowHandles();
		Iterator <String> it=handler.iterator();
		String parentwindowid =it.next();
		System.out.println("Parentwindow Id is:"+ parentwindowid);
		String childwindowid =it.next();
		System.out.println("Childwindow Id is:"+ childwindowid);
		//To swith to childwindow
		driver.switchTo().window(childwindowid);
		System.out.println("The title of childwindow is:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowid);
		System.out.println("The titile of parentwindow is:"+driver.getTitle());
		
		
		
	}

}

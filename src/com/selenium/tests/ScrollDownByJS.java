package com.selenium.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownByJS {

	public static void main(String[] args) throws InterruptedException {

		// To lanunch the browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Excercise\\Browser_LIB\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//To maximise the window
				driver.manage().window().maximize();
				//TO delete all the cookies
				driver.manage().deleteAllCookies();
				//To maintain 
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//To launch the url
				//driver.get("https://www.softwaretestingmaterial.com/selenium-interview-questions/");
				driver.get("https://the-internet.herokuapp.com/infinite_scroll");
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				//1.Scroll to specific location by using (x,y)co ordinates
				//js.executeScript("window.scrollTo(0,15000)");
				
				//2.Scroll to specific web element by (scrollIntoView method) using xpath
				//WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Best Sellers in Clothing & Accessories')]"));
				//js.executeScript("arguments[0].scrollIntoView(true)", element);
				
				//3.Scroll to bottom of the page by using scrollHeight method
				//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				
				//4.slider to slide from left to right
				//WebElement slider =driver.findElement(By.xpath("//input[@type='range']"));
				//slider.sendKeys(Keys.END);
				
				//5. Scroll dynamically for loading pages by while(loop)
				
				long initialHeight=(long)(js.executeScript("return document.body.scrollHeight"));
				
				while(true) {
					js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
					Thread.sleep(2000);
					long currentHeight=(long)(js.executeScript("return document.body.scrollHeight"));
					if(initialHeight == currentHeight) {
						break;
					}
					initialHeight = currentHeight;
				}
		
	}

}

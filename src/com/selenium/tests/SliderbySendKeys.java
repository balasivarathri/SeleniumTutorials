package com.selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SliderbySendKeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Excercise\\Browser_LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/slider/");
		//4.slider to slide from left to right
		WebElement slider =driver.findElement(By.xpath("//input[@type='range']"));
		slider.sendKeys(Keys.END);
	}

}
